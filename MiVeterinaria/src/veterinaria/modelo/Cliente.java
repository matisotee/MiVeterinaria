package veterinaria.modelo;

/**
 *
 * @author Mauri
 * 
 */
public class Cliente {
    
    
    private int dni;
    private String nombreApellido;
    private String direccion;
    private long telefono;
    private String responsable2;
    
    public Cliente(int dni, String nombreApellido, String direccion, long telefono, String responsable2) {
        
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.responsable2 = responsable2;
     }
    
    public Cliente (){
        
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getResponsable2() {
        return responsable2;
    }

    public void setResponsable2(String responsable2) {
        this.responsable2 = responsable2;
    }
}
