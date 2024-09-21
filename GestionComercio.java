/**
 * La clase GestionComercio simula la gestión de empleados dentro de un comercio.
 * Instancia empleados y un comercio, y agrega empleados al comercio.
 * Finalmente, muestra la nómina de empleados del comercio.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class GestionComercio {

    /**
     * Método principal que ejecuta la simulación de la gestión del comercio.
     * 
     * @param args Argumentos pasados por línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Creación de empleados
        Empleado empleado1 = new Empleado(30100623L, "Gonzalez", "Juan", 102750.0, 2018);
        Empleado empleado2 = new Empleado(37045987L, "Martinez", "Mercedes", 100718.0, 2020);
        Empleado empleado3 = new Empleado(32550096L, "Gomez", "Virginia", 150120.0, 2018);
        
        // Creación de comercio
        Comercio comercio1 = new Comercio("Avanti SRL");
        
        // Alta de empleados en el comercio
        comercio1.altaEmpleado(empleado1);
        comercio1.altaEmpleado(empleado2);
        comercio1.altaEmpleado(empleado3);
        
        // Mostrar la nómina de empleados del comercio
        comercio1.nomina();
    }
}
