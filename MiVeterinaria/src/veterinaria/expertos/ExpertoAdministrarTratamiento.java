package veterinaria.expertos;

import DTO.DTOtratamiento;
import DTO.DTOvisita;
import java.util.ArrayList;
import veterinaria.datas.Conexion;
import veterinaria.datas.TipoTratamientoData;
import veterinaria.datas.TratamientoData;
import veterinaria.modelo.Mascota;
import veterinaria.modelo.TipoTratamiento;
import veterinaria.modelo.Tratamiento;

/**
 *
 * @author mauri
 * 
 */

public class ExpertoAdministrarTratamiento {
    
    TratamientoData tratamientoData;
    ExpertoVisita expertoVisita;
    TipoTratamientoData tipoTratamientoData;
    Mascota mascotaActual;
    Tratamiento tratamientoActual;
    

    public ExpertoAdministrarTratamiento(Mascota mascota){
            try {
            Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
                 tratamientoData = new TratamientoData (conexion);
                 tipoTratamientoData = new TipoTratamientoData(conexion);

            } catch (ClassNotFoundException e) {
                System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
            }
            
            this.mascotaActual = mascota;
        }
     
    public DTOtratamiento buscarTratamientosActivos (boolean estado){
        
       tratamientoActual = tratamientoData.buscarTratamientoActivo(mascotaActual.getId(), estado);
       DTOtratamiento dto;
       if (tratamientoActual == null){
           dto = null;
       }else{
         dto = new DTOtratamiento (tratamientoActual.getDescripcion(),tratamientoActual.getImporte(),tratamientoActual.getTipoTratamiento().getNombreTipoTratamiento()); 
       }
       
       return dto;
    }
    
    public ArrayList<String> buscarListaDeTipoTratamiento (){
        ArrayList<TipoTratamiento> tiposTratamiento =tipoTratamientoData.obtenerListaDeTipoTratamiento();
        ArrayList<String> nombreTiposTratamiento = new ArrayList();
        
        for(int i=0;i< tiposTratamiento.size();i++){
            String nombreTipoTratamiento = tiposTratamiento.get(i).getNombreTipoTratamiento();
            nombreTiposTratamiento.add(nombreTipoTratamiento);
        }
        
        return nombreTiposTratamiento;
    }
    
    public void guardarNuevoTratamiento(String tipoTratamiento,String descripcion,boolean estado,double importe){
        tratamientoActual = new Tratamiento (mascotaActual,tipoTratamientoData.buscarTipoTratamiento(tipoTratamiento),descripcion,importe,estado);
        tratamientoData.guardarTratamiento(tratamientoActual);
    }
    
    public void realizarVisita (String detalles,double peso){
        expertoVisita = new ExpertoVisita(tratamientoActual);
        expertoVisita.realizarVisita(detalles,peso);
    }
    
    public void finalizarTratamiento (boolean estado){
       tratamientoActual.setEstado(false);
       tratamientoData.actualizarTratamiento(tratamientoActual);
    }
       
    public ArrayList<DTOvisita> listaDeVisitasDeUnMismoTipo (String nombreTipoTratamiento){
        ArrayList<Tratamiento> tratamientos = tratamientoData.obtenerTratamientos(mascotaActual.getId(), nombreTipoTratamiento);
        ArrayList<DTOvisita> dtosTodasLasVisitas = new ArrayList<>();
        
        for (int i = 0;i < tratamientos.size();i++){
           expertoVisita = new ExpertoVisita(tratamientos.get(i));
           ArrayList<DTOvisita> dtosVisitaActual = expertoVisita.listaDeVisitas();
           
            for(int x = 0; x < dtosVisitaActual.size();x++){
               dtosTodasLasVisitas.add(dtosVisitaActual.get(x));
            }
        }
        
        return dtosTodasLasVisitas;
        
        
    }

    public ExpertoVisita getExpertoVisita() {
        return expertoVisita;
    }

    public void setExpertoVisita(ExpertoVisita expertoVisita) {
        this.expertoVisita = expertoVisita;
    }
    
    
 
 }
