package veterinaria.expertos;

import DTO.DTOinfoTratamientos;
import java.time.LocalDate;
import java.util.ArrayList;
import veterinaria.datas.Conexion;
import veterinaria.datas.TipoTratamientoData;
import veterinaria.datas.TratamientoData;
import veterinaria.datas.VisitaData;
import veterinaria.modelo.Cliente;
import veterinaria.modelo.Mascota;
import veterinaria.modelo.TipoTratamiento;
import veterinaria.modelo.Tratamiento;
import veterinaria.modelo.Visita;


/**
 *
 * @author mauri
 * 
 */

public class ExpertoVisitasDeDistintasMascotas {

    private TipoTratamientoData tipoTratamientoData;
    private TratamientoData tratamientoData;
    private VisitaData visitaData;
    
    public ExpertoVisitasDeDistintasMascotas() {
        try{
            Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
            tratamientoData = new TratamientoData(conexion);
            tipoTratamientoData = new TipoTratamientoData(conexion);
            visitaData = new VisitaData(conexion);
 
         }
        catch (ClassNotFoundException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }   
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
    
    public ArrayList <DTOinfoTratamientos> buscarVisitasDelMismoTipo (String nombreTipoTratamiento){
        
        ArrayList<Tratamiento> listaTratamientos = tratamientoData.buscarTratamientosDelMismoTipo(nombreTipoTratamiento);
        ArrayList<DTOinfoTratamientos> dtos = new ArrayList();
        
        for (int i = 0; i < listaTratamientos.size();i++){
            Mascota mascota = listaTratamientos.get(i).getMascota();
            String alias = mascota.getAlias();
            Cliente cliente = mascota.getCliente();
            String nombreCliente = cliente.getNombreApellido();
            ArrayList<Visita> visitas = visitaData.obtenerVisitas(listaTratamientos.get(i).getId());
            
            for(int x = 0;x < visitas.size();x++){ 
                LocalDate fecha = visitas.get(x).getFecha();
                String detalles = visitas.get(x).getDetalles();
                DTOinfoTratamientos dto = new DTOinfoTratamientos(alias,detalles,fecha,nombreCliente);
                dtos.add(dto);
            }     
        }
        
        return dtos;
    }  
}
