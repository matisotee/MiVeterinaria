package veterinaria.expertos;

import DTO.DTOvisita;
import java.time.LocalDate;
import java.util.ArrayList;
import veterinaria.datas.Conexion;
import veterinaria.datas.MascotaData;
import veterinaria.datas.VisitaData;
import veterinaria.modelo.Mascota;
import veterinaria.modelo.Tratamiento;
import veterinaria.modelo.Visita;

/**
 *
 * @author mauri
 * 
 */

public class ExpertoVisita {
    Visita visita;
    VisitaData visitaData;
    MascotaData mascotaData;
    Tratamiento tratamientoActual;
    

    public ExpertoVisita(Tratamiento tratamientoActual) {
        try {
        Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
           visitaData = new VisitaData(conexion);
           mascotaData = new MascotaData(conexion);
 
        } catch (ClassNotFoundException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }   
     
        this.tratamientoActual = tratamientoActual; 
     
     }
    
    public ArrayList<DTOvisita> listaDeVisitas (){
       ArrayList<Visita> visitas = new ArrayList<>();       
       visitas = visitaData.obtenerVisitas(tratamientoActual.getId());
       ArrayList<DTOvisita> dtos = new ArrayList();
       for(int i = 0;i<visitas.size();i++){
         LocalDate fechas = visitas.get(i).getFecha();
         String detalles = visitas.get(i).getDetalles();
         
         DTOvisita dto = new DTOvisita(detalles,fechas);
         dtos.add(dto);
         
       }
       
       return dtos;
    }
    
    public void realizarVisita(String detalles,double peso){
        
       LocalDate fechaActual = LocalDate.now();
       visita = new Visita (tratamientoActual,fechaActual,detalles,peso);
       visitaData.guardarVisita(visita);
       
       Mascota mascota = visita.getTratamiento().getMascota();
       int idMascota = mascota.getId();
       double pesoPromedio = visitaData.obtenerPesoPromedio(idMascota); // le setea el peso medio a la mascota que acaba de realizar visita.
       mascota.setPesoMedio(pesoPromedio);
       mascotaData.actualizarMascota(mascota);

     }
    
 
 }
