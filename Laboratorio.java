/**
 * La clase Laboratorio representa un laboratorio con información relevante
 * como su nombre, domicilio, teléfono, compra mínima y día de entrega.
 * Proporciona métodos para acceder y modificar estos datos.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro 
 */
public class Laboratorio {
    
    // Atributos privados de la clase
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor de la clase {@code Laboratorio} que inicializa todos los atributos.
     *
     * @param p_nombre    Nombre del laboratorio.
     * @param p_domicilio Domicilio del laboratorio.
     * @param p_telefono  Teléfono de contacto del laboratorio.
     * @param p_compraMin Compra mínima del laboratorio.
     * @param p_diaEnt    Día de entrega del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt) {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMin(p_compraMin);
        setDiaEntrega(p_diaEnt);
    }

    /**
     * Constructor sobrecargado de la clase {@code Laboratorio}, que establece la compra mínima 
     * y el día de entrega a valores predeterminados (0).
     *
     * @param p_nombre    Nombre del laboratorio.
     * @param p_domicilio Domicilio del laboratorio.
     * @param p_telefono  Teléfono de contacto del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setTelefono(p_telefono);
        setCompraMin(0);  // Valor predeterminado
        setDiaEntrega(0); // Valor predeterminado
    }

    // Métodos privados para modificar los atributos
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    private void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }

    private void setCompraMin(int p_compraMin) {
        this.compraMinima = p_compraMin;
    }

    private void setDiaEntrega(int p_diaEntrega) {
        this.diaEntrega = p_diaEntrega;
    }

    // Métodos públicos para acceder a los atributos
    public String getNombre() {
        return this.nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public int getCompraMin() {
        return this.compraMinima;
    }

    public int getDiaEntrega() {
        return this.diaEntrega;
    }

    // Métodos públicos para modificar los valores de los atributos
    /**
     * Establece una nueva compra mínima para el laboratorio.
     *
     * @param p_compraMin Nueva compra mínima.
     */
    public void nuevaCompraMinima(int p_compraMin) {
        setCompraMin(p_compraMin);
    }

    /**
     * Establece un nuevo día de entrega para el laboratorio.
     *
     * @param p_diaEnt Nuevo día de entrega.
     */
    public void nuevoDiaEntrega(int p_diaEnt) {
        setDiaEntrega(p_diaEnt);
    }

    /**
     * Devuelve una cadena de texto que contiene la información del laboratorio.
     *
     * @return Información del laboratorio en formato de cadena.
     */
    public String mostrar() {
        String info = "Nombre: " + nombre;
        info += "\nDomicilio: " + domicilio + "\nTeléfono: " + telefono;
        return info;
    }
}
