package DTO;

import java.time.LocalDate;

/**
 *
 * @author mauri
 */
public class DTOinfoTratamientos {
    
    private String aliasMascota;
    private String detalleTratamiento;
    private LocalDate fecha;
    private String nombreCliente;

    public DTOinfoTratamientos(String aliasMascota, String detalleTratamiento, LocalDate fecha, String nombreCliente) {
        this.aliasMascota = aliasMascota;
        this.detalleTratamiento = detalleTratamiento;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
    }

    public String getAliasMascota() {
        return aliasMascota;
    }

    public void setAliasMascota(String aliasMascota) {
        this.aliasMascota = aliasMascota;
    }

    public String getDetalleTratamiento() {
        return detalleTratamiento;
    }

    public void setDetalleTratamiento(String detalleTratamiento) {
        this.detalleTratamiento = detalleTratamiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
    
    
}
