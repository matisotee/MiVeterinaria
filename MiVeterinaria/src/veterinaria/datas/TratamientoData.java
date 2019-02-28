
package veterinaria.datas;

import veterinaria.datas.MascotaData;
import veterinaria.datas.Conexion;
import veterinaria.modelo.TipoTratamiento;
import veterinaria.modelo.Tratamiento;
import veterinaria.modelo.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mauri ft Mati Licensed
 */
public class TratamientoData {
    
    
     private Connection connection = null;
     private Conexion conexion;
     MascotaData mascotaData;
     TipoTratamientoData tipoTratamientoData;
    
    public TratamientoData(Conexion conexion) {
         
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
            mascotaData = new MascotaData (conexion);
            tipoTratamientoData = new TipoTratamientoData (conexion);
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
        }
    }
    
    public Tratamiento buscarTratamientoActivo(int idMascota, boolean estado){
         Tratamiento tratamiento = null;   

            try {
                String sql = "SELECT * FROM tratamiento WHERE mascota_id = ? AND estado = ?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setInt(1,idMascota);
                statement.setBoolean(2,estado);
                
                ResultSet resultSet = statement.executeQuery();

                

                while(resultSet.next()){ // mientras haya datos va creando una Mascota, a esa mascota le va seteando los datos
                    tratamiento = new Tratamiento();
                    tratamiento.setId(resultSet.getInt("id_tratamiento"));
                   
                    tratamiento.setDescripcion(resultSet.getString("descripcion"));
                    tratamiento.setEstado(resultSet.getBoolean("estado"));
                    tratamiento.setImporte(resultSet.getDouble("importe"));
                    Mascota mascota = mascotaData.buscarMascota(resultSet.getInt("mascota_id"));
                    tratamiento.setMascota(mascota);
                    TipoTratamiento tipoTratamiento = tipoTratamientoData.buscarTipoTratamiento(resultSet.getString("nombre_tipo_tratamiento"));
                    tratamiento.setTipoTratamiento(tipoTratamiento);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener un tratamiento : " + ex.getMessage());
            }
            
            return tratamiento; 
    }
    
    public void guardarTratamiento (Tratamiento tratamiento){
            try {
            
                String sql = "INSERT INTO tratamiento (mascota_id, nombre_tipo_tratamiento,descripcion,estado,importe) VALUES ( ? , ? , ? , ? , ? );";

                    try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                        statement.setInt(1, tratamiento.getMascota().getId());
                        statement.setString(2, tratamiento.getTipoTratamiento().getNombreTipoTratamiento());
                        statement.setString(3, tratamiento.getDescripcion());
                        statement.setBoolean(4, tratamiento.getEstado());
                        statement.setDouble(5, tratamiento.getImporte());
                    
                        
                        
                        
                        statement.executeUpdate();
                        
                        ResultSet rs = statement.getGeneratedKeys();
                        
                        if (rs.next()) {
                          tratamiento.setId(rs.getInt(1));
                        } else {
                          System.out.println("No se pudo obtener el id luego de insertar un Tratamiento");
                        }
                        statement.close();
                    }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un Tratamiento: " + ex.getMessage());
          }
        }
    
    public Tratamiento buscarTratamiento (int id){
        Tratamiento tratamiento = null;   

            try {
                String sql = "SELECT * FROM tratamiento WHERE id_tratamiento = ?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setInt(1,id);
                
                
                ResultSet resultSet = statement.executeQuery();

                

                while(resultSet.next()){ // mientras haya datos va creando un tratamiento, a esa tratamiento le va seteando los datos
                    tratamiento = new Tratamiento();
                    tratamiento.setId(resultSet.getInt("id_tratamiento"));
                   
                    tratamiento.setDescripcion(resultSet.getString("descripcion"));
                    tratamiento.setEstado(resultSet.getBoolean("estado"));
                    tratamiento.setImporte(resultSet.getDouble("importe"));
                    Mascota mascota = mascotaData.buscarMascota(resultSet.getInt("mascota_id"));
                    tratamiento.setMascota(mascota);
                    TipoTratamiento tipoTratamiento = tipoTratamientoData.buscarTipoTratamiento(resultSet.getString("nombre_tipo_tratamiento"));
                    tratamiento.setTipoTratamiento(tipoTratamiento);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener un tratamiento : " + ex.getMessage());
            }
            
            return tratamiento; 
    }
    
    public void actualizarTratamiento (Tratamiento tratamiento) {
      try {
            
            String sql = "UPDATE tratamiento SET  descripcion = ?, estado = ?,importe = ? WHERE id_tratamiento = ?;";

                    PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                        statement.setString(1, tratamiento.getDescripcion());
                        statement.setBoolean(2, tratamiento.getEstado());
                        statement.setDouble(3, tratamiento.getImporte());
                        statement.setInt(4, tratamiento.getId());
                     
                        
                        
                        statement.executeUpdate();
                        
                        statement.close();
      
                    
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar datos de un tratamiento: " + ex.getMessage());
        } 
   }
    
    public ArrayList<Tratamiento> obtenerTratamientos(int idMascota, String nombreTipoTratamiento){
        ArrayList<Tratamiento> tratamientos = new ArrayList<>();

            try {
                String sql = "SELECT * FROM tratamiento WHERE mascota_id = ? AND nombre_tipo_tratamiento = ?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setInt(1, idMascota);
                statement.setString(2, nombreTipoTratamiento);
                
                ResultSet resultSet = statement.executeQuery();

                Tratamiento tratamiento;

                while(resultSet.next()){ // mientras haya datos va creando una Mascota a ese mascota le va seteando los datos
                    tratamiento = new Tratamiento();
                    tratamiento.setId(resultSet.getInt("id_tratamiento"));
                   
                    tratamiento.setDescripcion(resultSet.getString("descripcion"));
                    tratamiento.setEstado(resultSet.getBoolean("estado"));
                    tratamiento.setImporte(resultSet.getDouble("importe"));
                    Mascota mascota = mascotaData.buscarMascota(resultSet.getInt("mascota_id"));
                    tratamiento.setMascota(mascota);
                    TipoTratamiento tipoTratamiento = tipoTratamientoData.buscarTipoTratamiento(resultSet.getString("nombre_tipo_tratamiento"));
                    tratamiento.setTipoTratamiento(tipoTratamiento);
                    tratamientos.add(tratamiento);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener las mascotas : " + ex.getMessage());
            }
            return tratamientos;
    }
    
    public ArrayList<Tratamiento> buscarTratamientosDelMismoTipo(String nombreTipoTratamiento){
        ArrayList<Tratamiento> tratamientos = new ArrayList<>();

            try {
                String sql = "SELECT * FROM tratamiento WHERE nombre_tipo_tratamiento = ?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setString(1, nombreTipoTratamiento);
                
                
                ResultSet resultSet = statement.executeQuery();

                Tratamiento tratamiento;

                while(resultSet.next()){ // mientras haya datos va creando una Mascota a ese mascota le va seteando los datos
                    tratamiento = new Tratamiento();
                    tratamiento.setId(resultSet.getInt("id_tratamiento"));
                   
                    tratamiento.setDescripcion(resultSet.getString("descripcion"));
                    tratamiento.setEstado(resultSet.getBoolean("estado"));
                    tratamiento.setImporte(resultSet.getDouble("importe"));
                    Mascota mascota = mascotaData.buscarMascota(resultSet.getInt("mascota_id"));
                    tratamiento.setMascota(mascota);
                    TipoTratamiento tipoTratamiento = tipoTratamientoData.buscarTipoTratamiento(resultSet.getString("nombre_tipo_tratamiento"));
                    tratamiento.setTipoTratamiento(tipoTratamiento);
                    tratamientos.add(tratamiento);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener los tratamientos : " + ex.getMessage());
            }
            return tratamientos;
    }
    
    public ArrayList<Tratamiento> obtenerTratamientosActivos (boolean estado){
                
        ArrayList<Tratamiento> tratamientos = new ArrayList<>();
        
            try {
                String sql = "SELECT * FROM tratamiento WHERE estado = ?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                
                statement.setBoolean(1,estado);
                
                ResultSet resultSet = statement.executeQuery();

                Tratamiento tratamiento;

                while(resultSet.next()){ 
                    tratamiento = new Tratamiento();
                    tratamiento.setId(resultSet.getInt("id_tratamiento"));
                   
                    tratamiento.setDescripcion(resultSet.getString("descripcion"));
                    tratamiento.setEstado(resultSet.getBoolean("estado"));
                    tratamiento.setImporte(resultSet.getDouble("importe"));
                    Mascota mascota = mascotaData.buscarMascota(resultSet.getInt("mascota_id"));
                    tratamiento.setMascota(mascota);
                    TipoTratamiento tipoTratamiento = tipoTratamientoData.buscarTipoTratamiento(resultSet.getString("nombre_tipo_tratamiento"));
                    tratamiento.setTipoTratamiento(tipoTratamiento);
                    
                    tratamientos.add(tratamiento);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener un tratamiento : " + ex.getMessage());
            }
            
            return tratamientos;  
    }
}
