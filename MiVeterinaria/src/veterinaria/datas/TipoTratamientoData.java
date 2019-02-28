package veterinaria.datas;




import veterinaria.datas.Conexion;
import veterinaria.modelo.TipoTratamiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mauri
 * 
 */
public class TipoTratamientoData {
    private Connection connection = null;
     private Conexion conexion;
    
    public TipoTratamientoData(Conexion conexion) {
         
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
        }
    }
    
    public TipoTratamiento buscarTipoTratamiento(String nombreTipoTratamiento){
         TipoTratamiento tipoTratamiento = null;   

            try {
                String sql = "SELECT * FROM tipo_tratamiento WHERE nombre = ?;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setString(1,nombreTipoTratamiento);
                
                ResultSet resultSet = statement.executeQuery();

                

                while(resultSet.next()){ // mientras haya datos va creando una Mascota, a esa mascota le va seteando los datos
                    tipoTratamiento = new TipoTratamiento();
                    tipoTratamiento.setNombreTipoTratamiento(resultSet.getString("nombre"));
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener la mascota : " + ex.getMessage());
            }
            
            return tipoTratamiento; 
    }
    
    public ArrayList <TipoTratamiento> obtenerListaDeTipoTratamiento (){
        
        ArrayList<TipoTratamiento> listaDeTiposDeTratamientos = new ArrayList<>();
        
            try {
                String sql = "SELECT * FROM tipo_tratamiento ;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                
                
                ResultSet resultSet = statement.executeQuery();

                TipoTratamiento tipoTratamiento;

                while(resultSet.next()){ 
                    tipoTratamiento = new TipoTratamiento();
                    
                    tipoTratamiento.setNombreTipoTratamiento(resultSet.getString("nombre"));
                    
                    listaDeTiposDeTratamientos.add(tipoTratamiento);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener la lista de Tipo de Tratamientos : " + ex.getMessage());
            }
            return listaDeTiposDeTratamientos;
        
        
    }
    
    public void guardarTipoTratamiento (String nombreTipoTratamiento){
       
        try {
            
                String sql = "INSERT INTO tipo_tratamiento (nombre) VALUES ( ? );";

                    PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                        statement.setString(1,nombreTipoTratamiento);

                        statement.executeUpdate();

                        statement.close(); 
                        
        } catch (SQLException ex) {
            System.out.println("Error al insertar un Tipo de Tratamiento: " + ex.getMessage());
          }

    }
}
