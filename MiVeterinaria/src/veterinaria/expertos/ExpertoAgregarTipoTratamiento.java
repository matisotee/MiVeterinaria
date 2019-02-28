package veterinaria.expertos;

import veterinaria.datas.Conexion;
import veterinaria.datas.TipoTratamientoData;
import veterinaria.modelo.TipoTratamiento;

/**
 *
 * @author mauri
 * 
 */
public class ExpertoAgregarTipoTratamiento {
    
    private TipoTratamiento tipoTratamiento;
    private TipoTratamientoData tipoTratamientoData;
    
    
public ExpertoAgregarTipoTratamiento(){
        try {
        Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
            tipoTratamientoData = new TipoTratamientoData (conexion);
 
        } catch (ClassNotFoundException e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
    }
    
public void agregarTipoTratamiento (String nombreTipoTratamiento){
        
        tipoTratamiento = new TipoTratamiento(nombreTipoTratamiento);
        tipoTratamientoData.guardarTipoTratamiento(nombreTipoTratamiento);
        
    }
    
}
