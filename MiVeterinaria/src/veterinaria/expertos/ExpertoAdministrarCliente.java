package veterinaria.expertos;

import DTO.DTOcliente;
import DTO.DTOeditarCliente;
import java.util.ArrayList;
import veterinaria.datas.ClienteData;
import veterinaria.datas.Conexion;
import veterinaria.modelo.Cliente;



/**
 *
 * @author mauri
 * 
 */


public class ExpertoAdministrarCliente {
    
    private ClienteData clienteData;
    private Cliente clienteActual;
    private ExpertoAdministrarMascota expertoMascota;

    
    
    public ExpertoAdministrarCliente(){
        try {
        Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
            clienteData = new ClienteData (conexion);
 
        } catch (ClassNotFoundException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
    }
    
    
    public ArrayList <DTOcliente> buscarClientes(String nombreApellido){
        
       ArrayList<Cliente> clientes = clienteData.buscarClientes(nombreApellido);
       ArrayList<DTOcliente> dtos = new ArrayList(); 
       
       for (int i = 0; i < clientes.size();i++){
           
         String nombre =  clientes.get(i).getNombreApellido();
         int dni =  clientes.get(i).getDni();
         
         
         DTOcliente dto = new DTOcliente(dni,nombre);  
         
         dtos.add(dto);
         
       } 
    
      return dtos;
       
    } 
    
    public void guardarCliente (String nombreApellido,int dni,String direccion,long telefono,String responsable2){
       
       clienteActual = new Cliente (dni,nombreApellido,direccion,telefono,responsable2);
        
       clienteData.guardarCliente(clienteActual);
     
    }
    
    public void seleccionarCliente (int dni){
        clienteActual=clienteData.buscarCliente(dni);
    }
    
    public ArrayList <String> listarMascotas (){
      
       expertoMascota = new ExpertoAdministrarMascota(clienteActual);
       
       ArrayList <String> mascotas = expertoMascota.listarMascotas();
       
       return mascotas;
    }
    
    public void borrarCliente (){
        clienteData.borrarCliente(clienteActual.getDni());
    } 
    
    public DTOeditarCliente editarCliente (){
       
       
       DTOeditarCliente dto = new DTOeditarCliente(clienteActual.getDni(),clienteActual.getNombreApellido(),clienteActual.getDireccion(),clienteActual.getResponsable2(),clienteActual.getTelefono());
       
       return dto;
    }
    
    public void actualizarCliente (int dni,String nombreApellido,String direccion,String responsable2,long telefono){
        
        clienteActual = new Cliente (dni,nombreApellido,direccion,telefono,responsable2);
        
        clienteData.actualizarCliente(clienteActual);
        
    }
    
    public String getNombreClienteActual (){
        return clienteActual.getNombreApellido();
    }
    
    public int getDniClienteActual(){
        return clienteActual.getDni();
    }
    
    public ExpertoAdministrarMascota getExpertoMascota() {
        return expertoMascota;
    }

    public void setExpertoMascota(ExpertoAdministrarMascota expertoMascota) {
        this.expertoMascota = expertoMascota;
    }

    public Cliente getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(Cliente clienteActual) {
        this.clienteActual = clienteActual;
    }
    
    public ArrayList<Integer> listaDeDnis(){
        return clienteData.todosLosDni();
    }
            
}
