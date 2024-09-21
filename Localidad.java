/**
 * La clase Localidad representa una localidad con un nombre y una provincia.
 * Proporciona métodos para establecer y obtener estos atributos, y para mostrar la información de la localidad.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Localidad
{
    private String nombre;
    private String provincia;
    
    /**
     * Constructor para objetos de la clase Localidad.
     * 
     * @param p_nombre    Nombre de la localidad.
     * @param p_provincia Provincia en la que se encuentra la localidad.
     */
    public Localidad(String p_nombre, String p_provincia)
    {
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    /**
     * Obtiene el nombre de la localidad.
     * 
     * @return Nombre de la localidad.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene la provincia en la que se encuentra la localidad.
     * 
     * @return Provincia de la localidad.
     */
    public String getProvincia(){
        return this.provincia;
    }

    /**
     * Muestra la información de la localidad en formato de cadena.
     * 
     * @return Cadena con el nombre y la provincia de la localidad.
     */
    public String mostrar(){
        return "Localidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia();
    }
}

