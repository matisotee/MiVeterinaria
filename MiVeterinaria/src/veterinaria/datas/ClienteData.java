
package veterinaria.datas;

import veterinaria.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Mauri
 * 
 */

public class ClienteData {
    
    private Connection connection = null;
    
    public ClienteData (Conexion conexion){
        
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
        }
    }
    
    public void guardarCliente (Cliente cliente){
            try {
            
                String sql = "INSERT INTO cliente (dni, nombre_apellido, direccion, telefono, responsable_2) VALUES ( ? , ? , ? , ? , ? );";

                    try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                        statement.setInt(1, cliente.getDni());
                        statement.setString(2, cliente.getNombreApellido());
                        statement.setString(3, cliente.getDireccion());
                        statement.setLong(4, cliente.getTelefono());
                        statement.setString(5, cliente.getResponsable2());
                        
                        statement.executeUpdate();
                        
                    }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
    }
           
    public void borrarCliente(int dni){
        try {
            
            String sql = "DELETE FROM cliente WHERE dni =?;"; // envia una query donde elimina el cliente con el id que obtumo por parametro

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, dni);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al elimiar un cliente: " + ex.getMessage());
        }
        
      
    }
            
    public void actualizarCliente (Cliente cliente){
        
        try {
            
            String sql = "UPDATE cliente SET direccion = ?, telefono = ?, responsable_2 = ?, nombre_apellido = ? WHERE dni = ?;";

                    PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                        
                       
                        statement.setString(1, cliente.getDireccion());
                        statement.setLong(2, cliente.getTelefono());
                        statement.setString(3, cliente.getResponsable2());
                        statement.setString(4, cliente.getNombreApellido());
                        statement.setInt(5, cliente.getDni());
                        
                        statement.executeUpdate();
                        
                        statement.close();
      
                    
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar datos de un cliente: " + ex.getMessage());
        }
    }
    
    public Cliente buscarCliente(int dni){
        
        Cliente cliente = null;
        try {
            
            String sql = "SELECT * FROM cliente WHERE dni =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, dni);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                cliente = new Cliente();
                
                cliente.setDni(resultSet.getInt("dni"));
                cliente.setNombreApellido(resultSet.getString("nombre_apellido"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getLong("telefono"));
                cliente.setResponsable2(resultSet.getString("responsable_2"));
            }      
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        
        return cliente;
    }
    
    public ArrayList <Cliente> buscarClientes(String nombreApellido){
        
        Cliente cliente = null;
        ArrayList <Cliente> clientes = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM cliente WHERE nombre_apellido = ? OR responsable_2 = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, nombreApellido);
            statement.setString(2, nombreApellido);
            
            ResultSet resultSet=statement.executeQuery();
           
            
            while(resultSet.next()){
                cliente = new Cliente();
                
                cliente.setDni(resultSet.getInt("dni"));
                cliente.setNombreApellido(resultSet.getString("nombre_apellido"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getLong("telefono"));
                cliente.setResponsable2(resultSet.getString("responsable_2"));
                clientes.add(cliente);
            }      
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        
        return clientes;
    }
    
    public ArrayList<Integer> todosLosDni(){
        ArrayList<Integer> dnis = new ArrayList();
        try {
            
            String sql = "SELECT dni FROM cliente;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            

            ResultSet resultSet = statement.executeQuery();


            while(resultSet.next()){
                int dni;

                dni = resultSet.getInt("dni");

                dnis.add(dni);
            }  
            
            statement.close();

            }
            catch (SQLException ex) {
                System.out.println("Error al obtener todos los dnis " + ex.getMessage());
            }
        
            return dnis;
        }
     
}
