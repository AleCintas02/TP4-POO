/**
 * La clase Cliente representa un cliente con DNI, nombre, apellido y saldo.
 * Proporciona métodos para agregar saldo, establecer un nuevo saldo, 
 * obtener el nombre completo y mostrar la información del cliente.
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Cliente {
    // Atributos
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * Constructor para inicializar un objeto Cliente con los datos proporcionados.
     *
     * @param p_dni     el número de DNI del cliente
     * @param p_nombre  el nombre del cliente
     * @param p_apellido el apellido del cliente
     * @param p_importe el saldo inicial del cliente
     */
    public Cliente(int p_dni, String p_nombre, String p_apellido, double p_importe) {
        this.setNroDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSaldo(p_importe);
    }
    
    /**
     * Establece el número de DNI del cliente.
     *
     * @param p_nroDni el número de DNI a establecer
     */
    private void setNroDni(int p_nroDni) {
        this.nroDni = p_nroDni;
    }
    
    /**
     * Establece el nombre del cliente.
     *
     * @param p_nombre el nombre a establecer
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el apellido del cliente.
     *
     * @param p_apellido el apellido a establecer
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    
    /**
     * Establece el saldo del cliente.
     *
     * @param p_importe el saldo a establecer
     */
    private void setSaldo(double p_importe) {
        this.saldo = p_importe;
    }
    
    /**
     * Obtiene el número de DNI del cliente.
     *
     * @return el número de DNI del cliente
     */
    public int getNroDni() {
        return this.nroDni;
    }
    
    /**
     * Obtiene el nombre del cliente.
     *
     * @return el nombre del cliente
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Obtiene el apellido del cliente.
     *
     * @return el apellido del cliente
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
     * Obtiene el saldo actual del cliente.
     *
     * @return el saldo del cliente
     */
    public double getSaldo() {
        return this.saldo;
    }
        
    /**
     * Agrega un importe al saldo actual del cliente.
     *
     * @param p_importe el importe a agregar al saldo
     * @return el nuevo saldo del cliente después de agregar el importe
     */
    public double agregaSaldo(double p_importe) {
        double nuevoSaldo = this.getSaldo() + p_importe;
        this.setSaldo(nuevoSaldo);
        return this.getSaldo();
    }

    /**
     * Establece un nuevo saldo para el cliente.
     *
     * @param p_importe el nuevo saldo a establecer
     * @return el nuevo saldo del cliente
     */
    public double nuevoSaldo(double p_importe) {
        this.setSaldo(p_importe);
        return this.getSaldo();
    }

    /**
     * Obtiene el nombre completo del cliente (nombre y apellido).
     *
     * @return el nombre completo del cliente
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Muestra la información del cliente en la consola.
     */
    public void mostrar() {
        System.out.println("- Cliente -");
        System.out.println("Nombre y Apellido: " + this.nomYApe() + "(" + this.getNroDni() + ")");
        System.out.println("Saldo: " + this.getSaldo());
    }
}
