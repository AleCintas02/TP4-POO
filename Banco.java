import java.util.ArrayList;
import java.util.HashSet;

/**
 * La clase Banco representa un banco que contiene información sobre sus sucursales,
 * empleados y cuentas bancarias.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Banco {
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList empleados;
    private ArrayList cuentasBancarias;

    /**
     * Constructor que inicializa el banco con un nombre, localidad, número de sucursal
     * y un empleado.
     * 
     * @param p_nombre El nombre del banco.
     * @param p_localidad La localidad donde se encuentra el banco.
     * @param p_nroSucursal El número de sucursal del banco.
     * @param p_empleado El empleado inicial del banco.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList());
        this.agregarEmpleado(p_empleado); 
        this.setCuentasBancarias(new ArrayList());
    }

    /**
     * Constructor que inicializa el banco con un nombre, localidad, número de sucursal
     * y una lista de empleados.
     * 
     * @param p_nombre El nombre del banco.
     * @param p_localidad La localidad donde se encuentra el banco.
     * @param p_nroSucursal El número de sucursal del banco.
     * @param p_empleados La lista de empleados del banco.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(new ArrayList()); 
    }

    /**
     * Constructor que inicializa el banco con un nombre, localidad, número de sucursal,
     * una lista de empleados y una lista de cuentas bancarias.
     * 
     * @param p_nombre El nombre del banco.
     * @param p_localidad La localidad donde se encuentra el banco.
     * @param p_nroSucursal El número de sucursal del banco.
     * @param p_empleados La lista de empleados del banco.
     * @param p_cuentas La lista de cuentas bancarias del banco.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados, ArrayList p_cuentas) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentas);
    }

    // Setters

    /**
     * Establece el nombre del banco.
     * 
     * @param p_nombre El nuevo nombre del banco.
     */
    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece el número de sucursal del banco.
     * 
     * @param p_nroSucursal El nuevo número de sucursal.
     */
    public void setNroSucursal(int p_nroSucursal) {
        this.nroSucursal = p_nroSucursal;
    }

    /**
     * Establece la localidad del banco.
     * 
     * @param p_localidad La nueva localidad del banco.
     */
    public void setLocalidad(Localidad p_localidad) {
        this.localidad = p_localidad;
    }

    /**
     * Establece la lista de empleados del banco.
     * 
     * @param p_empleados La nueva lista de empleados.
     */
    public void setEmpleados(ArrayList p_empleados) {
        this.empleados = p_empleados;
    }

    /**
     * Establece la lista de cuentas bancarias del banco.
     * 
     * @param p_cuentasBancarias La nueva lista de cuentas bancarias.
     */
    public void setCuentasBancarias(ArrayList p_cuentasBancarias) {
        this.cuentasBancarias = p_cuentasBancarias;
    }

    // Getters

    /**
     * Obtiene el nombre del banco.
     * 
     * @return El nombre del banco.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el número de sucursal del banco.
     * 
     * @return El número de sucursal.
     */
    public int getNroSucursal() {
        return this.nroSucursal;
    }

    /**
     * Obtiene la localidad del banco.
     * 
     * @return La localidad del banco.
     */
    public Localidad getLocalidad() {
        return this.localidad;
    }

    /**
     * Obtiene la lista de empleados del banco.
     * 
     * @return La lista de empleados.
     */
    public ArrayList getEmpleados() {
        return this.empleados;
    }

    /**
     * Obtiene la lista de cuentas bancarias del banco.
     * 
     * @return La lista de cuentas bancarias.
     */
    public ArrayList getCuentasBancarias() {
        return this.cuentasBancarias;
    }

    /**
     * Agrega un empleado a la lista de empleados del banco.
     * 
     * @param p_empleado El empleado a agregar.
     * @return Verdadero si el empleado fue agregado correctamente, falso en caso contrario.
     */
    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * Quita un empleado de la lista de empleados del banco.
     * 
     * @param p_empleado El empleado a quitar.
     * @return Verdadero si el empleado fue quitado correctamente, falso en caso contrario.
     */
    public boolean quitarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().remove(p_empleado);
    }
    
    /**
     * Agrega una cuenta bancaria a la lista de cuentas del banco.
     * 
     * @param p_cuenta La cuenta bancaria a agregar.
     * @return Verdadero si la cuenta fue agregada correctamente, falso en caso contrario.
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuentasBancarias().add(p_cuenta);
    }
    
    /**
     * Quita una cuenta bancaria de la lista de cuentas del banco.
     * 
     * @param p_cuenta La cuenta bancaria a quitar.
     * @return Verdadero si la cuenta fue quitada correctamente, falso en caso contrario.
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuentasBancarias().remove(p_cuenta);
    }
    
    /**
     * Cuenta el número de cuentas activas (con saldo mayor a cero).
     * 
     * @return El número de cuentas activas.
     */
    private int cuentasSaldoActivo() {
        int cuentasActivas = 0;
        for (Object unaCuenta : this.getCuentasBancarias()) {
            CuentaBancaria cuenta = (CuentaBancaria) unaCuenta; 
            if (cuenta.getSaldo() > 0) {
                cuentasActivas++;
            }
        }
        return cuentasActivas;
    }
    
    /**
     * Obtiene una lista de titulares de cuentas con saldo cero.
     * 
     * @return Un conjunto de titulares con cuentas en cero.
     */
    public HashSet<Persona> listaDeTitulares() {
        HashSet<Persona> titulares = new HashSet<>();
        
        for (Object unaCuenta : this.getCuentasBancarias()) {          
            CuentaBancaria cuenta = (CuentaBancaria) unaCuenta;
            if (cuenta.getSaldo() == 0) {
                titulares.add(cuenta.getTitular());
            }
        }
        
        return titulares;
    }
    
    /**
     * Lista las cuentas bancarias con saldo cero en la consola.
     */
    public void listarCuentasConSaldoCero() {
        System.out.println("Cuentas sin saldo:");
        System.out.println(String.format("%-20s %-40s", "Cuenta", "Apellido y Nombre"));
        System.out.println("-----------------------------------------------------------");
    
        for (Object unaCuenta : this.getCuentasBancarias()) {
            CuentaBancaria cuenta = (CuentaBancaria) unaCuenta;
            if (cuenta.getSaldo() == 0) {
                System.out.println(String.format("%-20s %-40s",
                    cuenta.getNroCuenta(),
                    cuenta.getTitular().nomYApe()));
            }
        }
    }
    
    /**
     * Lista los sueldos de los empleados en la consola.
     */
    public void listarSueldos() {
        for (Object unEmpleado : this.getEmpleados()) {
            Empleado empleado  = (Empleado) unEmpleado;
            System.out.println(empleado.getCuil() + " " + empleado.apeYNom() +  " ----------- " + empleado.sueldoNeto());
        }
    }
    
    /**
     * Calcula el total de sueldos a pagar a los empleados.
     * 
     * @return El total de sueldos a pagar.
     */
    public double sueldosAPagar() {
        double sueldosPagar = 0;
        for (Object unEmpleado : this.getEmpleados()) {
            Empleado empleado = (Empleado) unEmpleado;
            sueldosPagar += empleado.sueldoNeto();
        }
        return sueldosPagar;
    }
    
    /**
     * Muestra un resumen de la información del banco y sus cuentas en la consola.
     */
    public void mostrar() {
        int contadorCuentas = 0;
        int cuentasSaldoCero = 0;
        System.out.println("Banco: " + this.getNombre() + "  \tSucursal: " + this.getNroSucursal());
        System.out.println("************************************************************");
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("************************************************************");
        for (Object unaCuenta : this.getCuentasBancarias()) {
            CuentaBancaria cuenta = (CuentaBancaria) unaCuenta;
            contadorCuentas++;
            if (cuenta.getSaldo() == 0) {
                cuentasSaldoCero++;
            }
        }
        System.out.println("Número total de Cuentas Bancarias: " + contadorCuentas);
        System.out.println("Cuentas Activas: " + this.cuentasSaldoActivo());
        System.out.println("Cuentas Saldo Cero: " + cuentasSaldoCero);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Cuentas sin saldo:");
        System.out.println("--- Cuenta -------------------- Apellido y Nombre ---------------");
        this.listarCuentasConSaldoCero();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Listado de clientes: ");
        for (Object unTitular : this.listaDeTitulares()) {
            Persona titular = (Persona) unTitular;
            System.out.println(titular.nomYApe());
        }
    }
}
