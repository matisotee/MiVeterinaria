package DTO;


import java.time.LocalDate;

/**
 *
 * @author mauri
 */
public class DTOvisita {
    private String detalles;
    private LocalDate fechaVisita;

    public DTOvisita(String detalles, LocalDate fechaVisita) {
        this.detalles = detalles;
        this.fechaVisita = fechaVisita;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }
    
    
}
