import java.util.*;

/**
 * La clase Persona representa a una persona con DNI, nombre, apellido y año de nacimiento.
 * Proporciona métodos para establecer y obtener estos atributos, calcular la edad y mostrar la información de la persona.
 *
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Persona {
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;

    /**
     * Constructor para objetos de la clase Persona.
     * 
     * @param p_dni          Número de DNI de la persona.
     * @param p_nombre       Nombre de la persona.
     * @param p_apellido     Apellido de la persona.
     * @param p_anio         Año de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    /**
     * Constructor para objetos de la clase Persona con fecha de nacimiento completa.
     * 
     * @param p_dni          Número de DNI de la persona.
     * @param p_nombre       Nombre de la persona.
     * @param p_apellido     Apellido de la persona.
     * @param p_fecha        Fecha de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    /**
     * Establece la fecha de nacimiento de la persona.
     * 
     * @param p_fecha Fecha de nacimiento de la persona.
     */
    private void setFechaNacimiento(Calendar p_fecha) {
        this.fechaNacimiento = p_fecha;
    }
    
    /**
     * Establece el número de DNI de la persona.
     * 
     * @param p_dni Número de DNI de la persona.
     */
    private void setDNI(int p_dni) {
        this.nroDni = p_dni;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param p_nombre Nombre de la persona.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece el apellido de la persona.
     * 
     * @param p_apellido Apellido de la persona.
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    /**
     * Establece el año de nacimiento de la persona.
     * 
     * @param p_anio Año de nacimiento de la persona.
     */
    private void setAnioNacimiento(int p_anio) {
        Calendar nuevaFecha = Calendar.getInstance();
        nuevaFecha.set(p_anio, 1, 1);
        this.setFechaNacimiento(nuevaFecha);
    }

    /**
     * Obtiene el número de DNI de la persona.
     * 
     * @return Número de DNI de la persona.
     */
    public int getDNI() {
        return this.nroDni;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return this.nombre;
    }
  
    /**
     * Obtiene el apellido de la persona.
     * 
     * @return Apellido de la persona.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Obtiene el año de nacimiento de la persona.
     * 
     * @return Año de nacimiento de la persona.
     */
    public int getAnioNacimiento() {
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    
    /**
     * Obtiene la fecha de nacimiento de la persona.
     * 
     * @return Fecha de nacimiento de la persona.
     */
    public Calendar getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    /**
     * Calcula y devuelve la edad de la persona basada en el año actual.
     * 
     * @return Edad de la persona.
     */
    public int edad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad = anioHoy - this.getAnioNacimiento();
        return edad;
    }

    /**
     * Devuelve una cadena con el nombre y apellido de la persona.
     * 
     * @return Nombre y apellido de la persona.
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Verifica si hoy es el cumpleaños de la persona.
     * 
     * @return True si hoy es el cumpleaños de la persona, false en caso contrario.
     */
    public boolean esCumpleanos() {
        Calendar hoy = new GregorianCalendar();
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = hoy.get(Calendar.MONTH); 
        int diaNacimiento = this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
        int mesNacimiento = this.getFechaNacimiento().get(Calendar.MONTH);

        return diaHoy == diaNacimiento && mesHoy == mesNacimiento;
    }

    /**
     * Muestra la información de la persona, incluyendo nombre, apellido, DNI y edad.
     */
    public void mostrar() {
        System.out.println("nombre y apellido: " + this.nomYApe() + " DNI: " + this.getDNI() + " Edad: " + this.edad());
    }
}

