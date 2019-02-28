
package DTO;

import java.sql.Date;

/**
 *
 * @author mauri
 */
public class DTOinfoMascota {
    
    private String alias ;
    private String especie;
    private Date  fecNac;
    private double pesoMedio;
    private String raza;
    private String sexo;

    public DTOinfoMascota(String alias, String especie, Date fecNac, double pesoMedio, String raza, String sexo) {
        this.alias = alias;
        this.especie = especie;
        this.fecNac = fecNac;
        this.pesoMedio = pesoMedio;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
