import java.util.*;

/**
 * La clase Comercio representa un comercio con una nómina de empleados.
 * Proporciona métodos para dar de alta y de baja a empleados, buscar empleados, calcular su sueldo neto y mostrar la nómina completa.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Comercio {

    private String nombre;  // Nombre del comercio
    private HashMap<Long, Empleado> empleados;  // Mapa de empleados por su CUIL (Clave Única de Identificación Laboral)

    /**
     * Constructor que crea un comercio con el nombre especificado.
     * Inicializa un mapa vacío de empleados.
     * 
     * @param p_nombre El nombre del comercio.
     */
    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<>());
    }

    /**
     * Constructor que crea un comercio con el nombre especificado y un mapa inicial de empleados.
     * 
     * @param p_nombre El nombre del comercio.
     * @param p_empleados El mapa de empleados que se asigna al comercio.
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }

    /**
     * Establece el nombre del comercio.
     * 
     * @param p_nombre El nombre del comercio.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece el mapa de empleados del comercio.
     * 
     * @param p_empleados El mapa de empleados.
     */
    private void setEmpleados(HashMap<Long, Empleado> p_empleados) {
        this.empleados = p_empleados;
    }

    /**
     * Devuelve el nombre del comercio.
     * 
     * @return El nombre del comercio.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el mapa de empleados del comercio.
     * 
     * @return El mapa de empleados.
     */
    public HashMap<Long, Empleado> getEmpleados() {
        return this.empleados;
    }

    /**
     * Da de alta a un empleado en el comercio, agregándolo al mapa de empleados.
     * 
     * @param p_empleado El empleado que se va a dar de alta.
     */
    public void altaEmpleado(Empleado p_empleado) {
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }

    /**
     * Da de baja a un empleado del comercio, eliminándolo del mapa de empleados.
     * 
     * @param p_empleado El empleado que se va a dar de baja.
     */
    public void bajaEmpleado(Empleado p_empleado) {
        this.getEmpleados().remove(p_empleado.getCuil());
    }

    /**
     * Devuelve la cantidad de empleados que tiene el comercio.
     * 
     * @return La cantidad de empleados.
     */
    public int cantidadDeEmpleados() {
        return this.getEmpleados().size();
    }

    /**
     * Verifica si un empleado con un determinado CUIL es parte del comercio.
     * 
     * @param p_cuil El CUIL del empleado a verificar.
     * @return {@code true} si el empleado está en el comercio, de lo contrario {@code false}.
     */
    public boolean esEmpleado(long p_cuil) {
        return this.getEmpleados().containsKey(p_cuil);
    }

    /**
     * Verifica si un empleado es parte del comercio.
     * 
     * @param p_empleado El empleado a verificar.
     * @return {@code true} si el empleado está en el comercio, de lo contrario {@code false}.
     */
    public boolean esEmpleado(Empleado p_empleado) {
        return this.getEmpleados().containsValue(p_empleado);
    }

    /**
     * Busca un empleado en el comercio por su CUIL.
     * 
     * @param p_cuil El CUIL del empleado a buscar.
     * @return El objeto {@code Empleado} si se encuentra, de lo contrario {@code null}.
     */
    public Empleado buscarEmpleado(long p_cuil) {
        return this.getEmpleados().get(p_cuil);
    }

    /**
     * Imprime el sueldo neto de un empleado en el comercio según su CUIL.
     * 
     * @param p_cuil El CUIL del empleado cuyo sueldo se va a mostrar.
     */
    public void sueldoNeto(long p_cuil) {
        System.out.println("Sueldo neto: " + this.buscarEmpleado(p_cuil).sueldoNeto());
    }

    /**
     * Muestra la nómina de empleados del comercio con sus sueldos netos.
     * 
     * Imprime el CUIL, nombre completo y sueldo neto de cada empleado.
     */
    public void nomina() {
        System.out.println("**** Nómina de empleados de " + this.getNombre() + " ****");
        for (Map.Entry<Long, Empleado> empleado : this.getEmpleados().entrySet()) {
            System.out.println(empleado.getKey() + " " + empleado.getValue().nomYApe() + " ------------ " + empleado.getValue().sueldoNeto());
        }
    }
}
