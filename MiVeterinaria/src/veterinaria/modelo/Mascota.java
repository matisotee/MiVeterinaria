
package veterinaria.modelo;

import java.sql.Date;
import veterinaria.modelo.Cliente;


/**
 *
 * @author Mauri
 */
public class Mascota {
 
    
    
    private int id; 
    private Cliente cliente_duenio;
    private String especie;
    private String alias;
    private String sexo;
    private String raza;
    private String colorPelo;
    private Date fecNac;
    private double pesoMedio;
    
    
    

    public Mascota(Cliente cliente, String especie, String alias, String sexo, String raza, String colorPelo, Date fecNac) {
        
        this.especie = especie;
        this.alias = alias;
        this.sexo = sexo;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fecNac = fecNac;
        this.cliente_duenio = cliente;
    }
    
    public Mascota(){
        
    }

    // SETTERS
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    
    public void setPesoMedio (double peso){
        this.pesoMedio = peso;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }
    
    public void setCliente (Cliente cliente){
        this.cliente_duenio = cliente;
    }
       

    // GETTERS
    
    public int getId() {
        return id;
    }
    
    public Cliente getCliente(){
        return cliente_duenio;
    }
    
    public String getEspecie() {
        return especie;
    }

    public String getAlias() {
        return alias;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaza() {
        return raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

  

}
