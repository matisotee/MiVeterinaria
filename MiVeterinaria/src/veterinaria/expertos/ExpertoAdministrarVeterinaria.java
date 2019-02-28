package veterinaria.expertos;

import DTO.DTOcliente;
import DTO.DTOeditarCliente;
import DTO.DTOinfoMascota;
import DTO.DTOtratamiento;
import DTO.DTOvisita;
import java.sql.Date;
import java.util.ArrayList;


/**
 *
 * @author mauri
 * 
 */
public class ExpertoAdministrarVeterinaria {
    ExpertoAdministrarCliente expertoCliente = new ExpertoAdministrarCliente();
    ExpertoAdministrarMascota expertoMascota;
    ExpertoAdministrarTratamiento expertoTratamiento;
    ExpertoVisita expertoVisita;

    
    // Metodos cliente
    public ArrayList <DTOcliente> buscarClientes(String nombreApellido){
       
       return expertoCliente.buscarClientes(nombreApellido);
       
    } 
    
    public void guardarCliente (String nombreApellido,int dni,String direccion,long telefono,String responsable2){
       
       expertoCliente.guardarCliente(nombreApellido, dni, direccion, telefono, responsable2);
     
    }
    
    public void seleccionarCliente (int dni){
        expertoCliente.seleccionarCliente(dni);
    }
    
    public ArrayList <String> listarMascotas (){
      
        ArrayList <String> mascotas = expertoCliente.listarMascotas();
        expertoMascota= expertoCliente.getExpertoMascota();
        return mascotas;   
    }
    
    public ArrayList<Integer> listaDeDnis(){
        return expertoCliente.listaDeDnis();
    }
    
    public void borrarCliente (){
        expertoCliente.borrarCliente();
    } 
    
    public DTOeditarCliente editarCliente (){
       
       return expertoCliente.editarCliente();
       
    }
    
    public void actualizarCliente (int dni,String nombreApellido,String direccion,String responsable2,long telefono){
        expertoCliente.actualizarCliente(dni, nombreApellido, direccion, responsable2, telefono);
        
        
    }
    
    public ExpertoAdministrarCliente getExpertoCliente() {
        return expertoCliente;
    }
    
    //Metodos Mascota
    
    
    
    public DTOinfoMascota buscarMascota (String alias){
       
        return expertoMascota.buscarMascota(alias);
     }
    
    public DTOtratamiento buscarTratamientosActivos (){
      DTOtratamiento dto = expertoMascota.buscarTratamientosActivos();
      expertoTratamiento = expertoMascota.getExpertoTratamiento();
      return dto;
    }
    
    public void borrarMascota (){
        expertoMascota.borrarMascota();
    }
    
    public ArrayList<String> listarVisitas (){
       ArrayList<String> listaVisitas =expertoMascota.listarVisitas();
       expertoTratamiento = expertoMascota.getExpertoTratamiento();
       return listaVisitas;
    }
    
    public void registrarMascota (String especie,String alias,String sexo,String raza,String colorPelo,Date fecNac){
        expertoMascota.registrarMascota(especie, alias, sexo, raza, colorPelo, fecNac);
    }
    
    //Metodos Tratamiento
    
    
    
    public ArrayList<String> buscarListaDeTipoTratamiento (){
        return expertoTratamiento.buscarListaDeTipoTratamiento();
    }
    
    public void guardarNuevoTratamiento(String tipoTratamiento,String descripcion,boolean estado,double importe){
        expertoTratamiento.guardarNuevoTratamiento(tipoTratamiento, descripcion, estado, importe);
    }
    
    public void realizarVisita (String detalles,double peso){
        expertoTratamiento.realizarVisita(detalles, peso);
        expertoVisita = expertoTratamiento.getExpertoVisita();
    }
    
    public void finalizarTratamiento (boolean estado){
       expertoTratamiento.finalizarTratamiento(estado);
    }
       
    public ArrayList<DTOvisita> listaDeVisitasDeUnMismoTipo (String nombreTipoTratamiento){
        return expertoTratamiento.listaDeVisitasDeUnMismoTipo(nombreTipoTratamiento);
         
    }
    
   
    
    

    public void setExpertoCliente(ExpertoAdministrarCliente expertoCliente) {
        this.expertoCliente = expertoCliente;
    }

    public ExpertoAdministrarMascota getExpertoMascota() {
        return expertoMascota;
    }

    public void setExpertoMascota(ExpertoAdministrarMascota expertoMascota) {
        this.expertoMascota = expertoMascota;
    }

    public ExpertoAdministrarTratamiento getExpertoTratamiento() {
        return expertoTratamiento;
    }

    public void setExpertoTratamiento(ExpertoAdministrarTratamiento expertoTratamiento) {
        this.expertoTratamiento = expertoTratamiento;
    }

    public ExpertoVisita getExpertoVisita() {
        return expertoVisita;
    }

    public void setExpertoVisita(ExpertoVisita expertoVisita) {
        this.expertoVisita = expertoVisita;
    }
    
    
}
