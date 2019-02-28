    
package veterinaria.datas;

import veterinaria.datas.TratamientoData;
import veterinaria.datas.Conexion;
import veterinaria.modelo.Tratamiento;
import veterinaria.modelo.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mauri
 * 
 */
public class VisitaData {
     private Connection connection = null;
     private Conexion conexion;
     TratamientoData tratamientoData;
    
    public VisitaData(Conexion conexion) {
         
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
            tratamientoData = new TratamientoData (conexion);
           
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
        }
    }
    
    public ArrayList<Visita> obtenerVisitas(int idTratamiento){
        ArrayList<Visita> visitas = new ArrayList<>();

            try {
                String sql = "SELECT * FROM visita WHERE tratamiento_id = ? ;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setInt(1, idTratamiento);
                
                ResultSet resultSet = statement.executeQuery();

                Visita visita;

                while(resultSet.next()){ // mientras haya datos va creando una Mascota a ese mascota le va seteando los datos
                    visita = new Visita();
                    visita.setId(resultSet.getInt("id_visita"));
                   
                    visita.setDetalles(resultSet.getString("detalles"));
                    Date date = resultSet.getDate("fecha");
                    LocalDate fecha =date.toLocalDate();
                    visita.setFecha(fecha);
                    visita.setPesoVisita(resultSet.getDouble("peso"));
                    Tratamiento tratamiento = tratamientoData.buscarTratamiento(resultSet.getInt("tratamiento_id"));
                    visita.setTratamiento(tratamiento);
                    visitas.add(visita);
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al obtener las visitas : " + ex.getMessage());
            }
            return visitas;
    }
    
    public void guardarVisita(Visita visita){
        try {
            
            String sql = "INSERT INTO visita (tratamiento_id, detalles,fecha,peso) VALUES ( ? , ? , ? , ? );";

                    try (
                        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                        statement.setInt(1, visita.getTratamiento().getId());
                        statement.setString(2, visita.getDetalles());
                        statement.setDate(3, Date.valueOf(visita.getFecha()));
                        statement.setDouble(4, visita.getPesoVisita());
                    
                        
                        
                        
                        statement.executeUpdate();
                        
                        ResultSet rs = statement.getGeneratedKeys();
                        
                        if (rs.next()) {
                          visita.setId(rs.getInt(1));
                        } else {
                          System.out.println("No se pudo obtener el id luego de insertar una Visita");
                        }       
                    }
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Visita: " + ex.getMessage());
          }
    }
    
    public double obtenerPesoPromedio(int idMascota){
            
            double pesoPromedio=0;

            try {
                String sql = "SELECT AVG(v.peso) AS promedio FROM visita v INNER JOIN tratamiento t ON v.tratamiento_id = t.id_tratamiento INNER JOIN mascota m ON t.mascota_id = m.id_mascota WHERE m.id_mascota = ? ORDER BY v.fecha DESC LIMIT 10 ;";
                PreparedStatement statement = connection.prepareStatement(sql);
                
                statement.setInt(1, idMascota);
                
                ResultSet resultSet = statement.executeQuery();

                

                while(resultSet.next()){ 
                    pesoPromedio= resultSet.getDouble("promedio");
                    
                }      
                    statement.close();    

            } catch (SQLException ex) {
                System.out.println("Error al calcular peso promedio : " + ex.getMessage());
            }
            return pesoPromedio;
    }
    
}
