package DTO;

/**
 *
 * @author mauri
 * 
 */
public class DTOcliente {
    private int dni ;
    private String nombreApellido;

    public DTOcliente(int dni, String nombreApellido) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
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
    
 
    
}
