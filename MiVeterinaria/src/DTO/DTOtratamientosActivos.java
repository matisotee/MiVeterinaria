package DTO;

/**
 *
 * @author mauri el dEV
 * 
 */
public class DTOtratamientosActivos {
    
    private String aliasMascota;
    private String descripcion;
    private String nombreCliente;
    private String tipoTratamiento;

    public DTOtratamientosActivos(String aliasMascota, String descripcion, String nombreCliente, String tipoTratamiento) {
        this.aliasMascota = aliasMascota;
        this.descripcion = descripcion;
        this.nombreCliente = nombreCliente;
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getAliasMascota() {
        return aliasMascota;
    }

    public void setAliasMascota(String aliasMascota) {
        this.aliasMascota = aliasMascota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }
    
    
    
}
