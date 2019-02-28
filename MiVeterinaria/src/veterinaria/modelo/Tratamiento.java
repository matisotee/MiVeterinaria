
package veterinaria.modelo;

import veterinaria.modelo.Mascota;

/**
 *
 * @author Mauri
 */
public class Tratamiento {
    
    private int id;
    private Mascota mascota;
    private TipoTratamiento tipoTratamiento;
    private String descripcion;
    private double importe;
    private boolean estado;



    public Tratamiento(Mascota mascota,TipoTratamiento tipoTratamiento, String descripcion, double importe, boolean estado) {
        
        this.mascota = mascota;
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }
    
    public Tratamiento (){
    
    }
    
    
    public void setTipoTratamiento(TipoTratamiento tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public TipoTratamiento getTipoTratamiento() {
        return tipoTratamiento;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId (int id){
        this.id = id ;
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
   }
