
package veterinaria.modelo;


import java.time.LocalDate;

/**
 *
 * @author Mauri
 * 
 */
public class Visita {
    private int id;
    private Tratamiento tratamiento;
    private LocalDate fecha;
    private String detalles;
    private double pesoVisita;
    
    

    public Visita(Tratamiento tratamiento, LocalDate fecha, String detalles, double pesoVisita) {
        
        
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.detalles = detalles;
        this.pesoVisita = pesoVisita;
        
        
    }
    
    public Visita(){
        
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getPesoVisita() {
        return pesoVisita;
    }

    public void setPesoVisita(double pesoVisita) {
        this.pesoVisita = pesoVisita;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    


}
