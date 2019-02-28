package veterinaria.expertos;

import DTO.DTOtratamientosActivos;
import java.util.ArrayList;
import veterinaria.datas.Conexion;
import veterinaria.datas.TratamientoData;
import veterinaria.modelo.Cliente;
import veterinaria.modelo.Mascota;
import veterinaria.modelo.TipoTratamiento;
import veterinaria.modelo.Tratamiento;

/**
 *
 * @author mauri
 * 
 */
public class ExpertoTratamientosActivos {
    
    TratamientoData tratamientoData;
    
    public ExpertoTratamientosActivos(){
            try {
                Conexion conexion = new Conexion("jdbc:mysql://localhost/veterinaria", "root", "");
                tratamientoData = new TratamientoData (conexion);   
            }
            catch (ClassNotFoundException e) {
                System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
            }
        }


    public ArrayList<DTOtratamientosActivos> listarTratamientosActivos (boolean estado) {
            ArrayList<Tratamiento> tratamientos = tratamientoData.obtenerTratamientosActivos(estado);
            ArrayList<DTOtratamientosActivos> dtos = new ArrayList();
            for(int i = 0;i < tratamientos.size();i++){
                String descripcion = tratamientos.get(i).getDescripcion();
                TipoTratamiento tipoTratamiento = tratamientos.get(i).getTipoTratamiento();
                String nombreTipoTratamiento = tipoTratamiento.getNombreTipoTratamiento();
                Mascota mascota = tratamientos.get(i).getMascota();
                String aliasMascota = mascota.getAlias();
                Cliente cliente = mascota.getCliente();
                String nombreApellido = cliente.getNombreApellido();

                DTOtratamientosActivos dto = new DTOtratamientosActivos(aliasMascota,descripcion,nombreApellido,nombreTipoTratamiento);
                dtos.add(dto);
            }

            return dtos;
        }
    
   
 }
