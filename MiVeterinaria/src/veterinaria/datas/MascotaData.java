
package veterinaria.datas;

import veterinaria.datas.Conexion;
import veterinaria.datas.ClienteData;
import veterinaria.modelo.Mascota;
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
    public class MascotaData {
    
     private Connection connection = null;
     private Conexion conexion;
     ClienteData clienteData;
    
    public MascotaData(Conexion conexion) {
         
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
             clienteData = new ClienteData (conexion);
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
        }
    }
    
    
        public void guardarMascota (Mascota mascota){
            try {
            
                String sql = "INSERT INTO mascota (cliente_dni, especie, raza, sexo, alias, color_pelo, fec_nac, peso_medio) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? );";

                    try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                        statement.setInt(1, mascota.getCliente().getDni());
                        statement.setString(2, mascota.getEspecie());
                        statement.setString(3, mascota.getRaza());
                        statement.setString(4, mascota.getSexo());
                        statement.setString(5, mascota.getAlias());
                        statement.setString(6, mascota.getColorPelo());
                        statement.setDate(7,(mascota.getFecNac()));
                        statement.setDouble(8, mascota.getPesoMedio());
                        
                        
                        
                        statement.executeUpdate();
                        
                        ResultSet rs = statement.getGeneratedKeys();
                        
                        if (rs.next()) {
                          mascota.setId(rs.getInt(1));
                        } else {
                          System.out.println("No se pudo obtener el id luego de insertar una Mascota");
                        }       
                    }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Mascota: " + ex.getMessage());
          }
        }
    
        public ArrayList<Mascota> obtenerMascotas(int dniCliente){

            ArrayList<Mascota> mascota = new ArrayList<>();

            try {
                String sql = "SELECT * FROM mascota WHERE cliente_dni = ?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setInt(1, dniCliente);
                
                ResultSet resultSet = statement.executeQuery();

                Mascota mascot;

                while(resultSet.next()){ // mientras haya datos va creando una Mascota a ese mascota le va seteando los datos
                    mascot = new Mascota();
                    mascot.setId(resultSet.getInt("id_mascota"));
                   
                    mascot.setEspecie(resultSet.getString("especie"));
                    mascot.setAlias(resultSet.getString("alias"));
                    mascot.setSexo(resultSet.getString("sexo"));
                    mascot.setRaza(resultSet.getString("raza"));
                    mascot.setColorPelo(resultSet.getString("color_pelo"));
                    mascot.setFecNac(resultSet.getDate("fec_nac"));
                    mascot.setPesoMedio(resultSet.getDouble("peso_medio"));
                    Cliente cliente = clienteData.buscarCliente(dniCliente);
                    mascot.setCliente(cliente);
                    
                    mascota.add(mascot);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener las mascotas : " + ex.getMessage());
            }
            return mascota;
        }
        
        public Mascota buscarMascota (int dniCliente,String alias){
            
                  Mascota mascota = null;   

            try {
                String sql = "SELECT * FROM mascota WHERE cliente_dni = ? AND alias = ?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setInt(1, dniCliente);
                statement.setString(2, alias);
                
                ResultSet resultSet = statement.executeQuery();

                

                while(resultSet.next()){ // mientras haya datos va creando una Mascota, a esa mascota le va seteando los datos
                    mascota = new Mascota();
                    mascota.setId(resultSet.getInt("id_mascota"));
                   
                    mascota.setEspecie(resultSet.getString("especie"));
                    mascota.setAlias(resultSet.getString("alias"));
                    mascota.setSexo(resultSet.getString("sexo"));
                    mascota.setRaza(resultSet.getString("raza"));
                    mascota.setColorPelo(resultSet.getString("color_pelo"));
                    mascota.setFecNac(resultSet.getDate("fec_nac"));
                    mascota.setPesoMedio(resultSet.getDouble("peso_medio"));
                    Cliente cliente = clienteData.buscarCliente(dniCliente);
                    mascota.setCliente(cliente);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener la mascota : " + ex.getMessage());
            }
            
            return mascota;   
            
            
        }
        
        public Mascota buscarMascota (int id){
             Mascota mascota = null;   

            try {
                String sql = "SELECT * FROM mascota WHERE id_mascota = ? ;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setInt(1, id);
                
                
                ResultSet resultSet = statement.executeQuery();

                

                while(resultSet.next()){ // mientras haya datos va creando una Mascota, a esa mascota le va seteando los datos
                    mascota = new Mascota();
                    mascota.setId(resultSet.getInt("id_mascota"));
                   
                    mascota.setEspecie(resultSet.getString("especie"));
                    mascota.setAlias(resultSet.getString("alias"));
                    mascota.setSexo(resultSet.getString("sexo"));
                    mascota.setRaza(resultSet.getString("raza"));
                    mascota.setColorPelo(resultSet.getString("color_pelo"));
                    mascota.setFecNac(resultSet.getDate("fec_nac"));
                    mascota.setPesoMedio(resultSet.getDouble("peso_medio"));
                    Cliente cliente = clienteData.buscarCliente(resultSet.getInt("cliente_dni"));
                    mascota.setCliente(cliente);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener la mascota : " + ex.getMessage());
            }
            
            return mascota;   
        }
    
        public void borrarMascota(int id){
        try {
            
            String sql = "DELETE FROM mascota WHERE id_mascota = ?;"; // envia una query donde elimina la mascota con el id que obtuvo por parametro

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al elimiar una Mascota: " + ex.getMessage());
        }
        
      
    }
        
        public void actualizarMascota (Mascota mascota){
        
        try {
            
            String sql = "UPDATE mascota SET cliente_dni = ?, especie = ?, raza = ?, sexo = ?, alias = ?, color_pelo = ?, fec_nac = ?, peso_medio = ?  WHERE id_mascota = ?;";
            
            

                    PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                        
                       
                        statement.setInt(1, mascota.getCliente().getDni());
                        statement.setString(2, mascota.getEspecie());
                        statement.setString(3, mascota.getRaza());
                        statement.setString(4, mascota.getSexo());
                        statement.setString(5, mascota.getAlias());
                        statement.setString(6, mascota.getColorPelo());
                        statement.setDate(7, mascota.getFecNac());
                        statement.setDouble(8, mascota.getPesoMedio());
                        statement.setInt(9, mascota.getId());
                        
                        statement.executeUpdate();
                        
                        statement.close();
      
                    
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar datos de una mascota: " + ex.getMessage());
        }
    }
        
         
    
 }
