
package DTO;

/**
 *
 * @author mauri
 */
public class DTOtratamiento {
 
    private String descripcion;
    private double importe;
    private String tipoTratamiento;

    public DTOtratamiento(String descripcion, double importe, String tipoTratamiento) {
        this.descripcion = descripcion;
        this.importe = importe;
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    } 
    
}
