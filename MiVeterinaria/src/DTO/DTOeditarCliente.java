
package DTO;

/**
 *
 * @author mauri
 */
public class DTOeditarCliente {
    
    private int dni;
    private String nombreApellido;
    private String direccion;
    private String responsable2;
    private long telefono;

    public DTOeditarCliente(int dni, String nombreApellido, String direccion, String responsable2, long telefono) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.responsable2 = responsable2;
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getResponsable2() {
        return responsable2;
    }

    public void setResponsable2(String responsable2) {
        this.responsable2 = responsable2;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
}
