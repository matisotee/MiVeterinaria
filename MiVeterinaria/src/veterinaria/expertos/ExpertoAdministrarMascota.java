package veterinaria.expertos;

import DTO.DTOinfoMascota;
import DTO.DTOtratamiento;
import java.sql.Date;
import java.util.ArrayList;
import veterinaria.datas.Conexion;
import veterinaria.datas.MascotaData;
import veterinaria.modelo.Cliente;
import veterinaria.modelo.Mascota;

/**
 *
 * @author mauri
 * 
 */
public class ExpertoAdministrarMascota {
    
    private ExpertoAdministrarTratamiento expertoTratamiento;   
    private MascotaData mascotaData; 
    private Mascota mascotaActual;
    private Cliente clienteActual;
    
    public ExpertoAdministrarMascota(Cliente cliente){
        try {
        Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
            mascotaData = new MascotaData (conexion);
 
        } catch (ClassNotFoundException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
        
        this.clienteActual = cliente;
    }
    
    
    
    public ArrayList<String> listarMascotas(){
    
       ArrayList<Mascota> mascotas = mascotaData.obtenerMascotas(clienteActual.getDni());
       
       ArrayList<String> listAlias =  new ArrayList(); 
       
       for (int i = 0;i < mascotas.size();i++) {
           
          String alias = mascotas.get(i).getAlias();
          
          listAlias.add(alias);
       }
       
       return listAlias;
        
    }
    
    public DTOinfoMascota buscarMascota (String alias){
        
        mascotaActual =   mascotaData.buscarMascota(clienteActual.getDni(), alias);
        
        DTOinfoMascota dto = new DTOinfoMascota(mascotaActual.getAlias(),mascotaActual.getEspecie(),mascotaActual.getFecNac(),mascotaActual.getPesoMedio(),mascotaActual.getRaza(),mascotaActual.getSexo());
       
        
        return dto;
    
     }
    
    public DTOtratamiento buscarTratamientosActivos (){
      expertoTratamiento = new ExpertoAdministrarTratamiento(mascotaActual);
      DTOtratamiento dto =  expertoTratamiento.buscarTratamientosActivos(true);
      return dto;
    }
    
    public void borrarMascota (){
        mascotaData.borrarMascota(mascotaActual.getId());
    }
    
    public ArrayList<String> listarVisitas (){
       expertoTratamiento= new ExpertoAdministrarTratamiento(mascotaActual);
        ArrayList<String> tipos = expertoTratamiento.buscarListaDeTipoTratamiento();
       return tipos;
    }
    
    public void registrarMascota (String especie,String alias,String sexo,String raza,String colorPelo,Date fecNac){
        mascotaActual = new Mascota (clienteActual,especie,alias,sexo,raza,colorPelo,fecNac);
        mascotaData.guardarMascota(mascotaActual);
    }
    
    public String getAliasMascotaActual(){
        return mascotaActual.getAlias();
    }

    public ExpertoAdministrarTratamiento getExpertoTratamiento() {
        return expertoTratamiento;
    }

    public void setExpertoTratamiento(ExpertoAdministrarTratamiento expertoTratamiento) {
        this.expertoTratamiento = expertoTratamiento;
    }

    public Cliente getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(Cliente clienteActual) {
        this.clienteActual = clienteActual;
    }
    
    
    
    
 }
