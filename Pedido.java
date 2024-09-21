import java.util.*;
import java.text.SimpleDateFormat;

/**
 * La clase Pedido representa un pedido realizado por un cliente, que incluye 
 * una fecha, una lista de productos y la información del cliente. También proporciona 
 * métodos para agregar, eliminar productos y calcular los totales del pedido.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Pedido {
    private Calendar fecha;
    private ArrayList<Producto> productos;
    private Cliente cliente;


    /**
     * Constructor que crea un pedido con una fecha y cliente, sin productos iniciales.
     * 
     * @param p_fecha La fecha en que se realiza el pedido.
     * @param p_cliente El cliente que realiza el pedido.
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    /**
     * Constructor que crea un pedido con una fecha, cliente y un producto inicial.
     * 
     * @param p_fecha La fecha en que se realiza el pedido.
     * @param p_cliente El cliente que realiza el pedido.
     * @param p_producto El primer producto añadido al pedido.
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<>());
        this.agregarProducto(p_producto);
    }

    /**
     * Establece la fecha del pedido.
     * 
     * @param p_fecha La fecha del pedido.
     */
    private void setFecha(Calendar p_fecha) {
        this.fecha = p_fecha;
    }

    /**
     * Establece el cliente del pedido.
     * 
     * @param p_cliente El cliente que realiza el pedido.
     */
    private void setCliente(Cliente p_cliente) {
        this.cliente = p_cliente;
    }

    /**
     * Establece la lista de productos del pedido.
     * 
     * @param p_producto La lista de productos del pedido.
     */
    private void setProductos(ArrayList<Producto> p_producto) {
        this.productos = p_producto;
    }

    /**
     * Devuelve la fecha del pedido.
     * 
     * @return La fecha del pedido.
     */
    public Calendar getFecha() {
        return this.fecha;
    }

    /**
     * Devuelve la lista de productos del pedido.
     * 
     * @return Una lista de productos del pedido.
     */
    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    /**
     * Devuelve el cliente que realiza el pedido.
     * 
     * @return El cliente que realiza el pedido.
     */
    public Cliente getCiente() {
        return this.cliente;
    }

    /**
     * Agrega un producto al pedido.
     * 
     * @param p_producto El producto a agregar.
     * @return {@code true} si el producto se agregó exitosamente.
     */
    public boolean agregarProducto(Producto p_producto) {
        return this.getProductos().add(p_producto);
    }
    
    /**
     * Elimina un producto del pedido.
     * 
     * @param p_producto El producto a eliminar.
     * @return {@code true} si el producto fue eliminado exitosamente.
     */
    public boolean eliminarProducto(Producto p_producto) {
        return this.getProductos().remove(p_producto);
    }

    /**
     * Calcula el total al contado de todos los productos en el pedido.
     * 
     * @return El total al contado de los productos.
     */
    public double totalAlContado() {
        double totalContado = 0;
        for (Producto producto : this.getProductos()) {
            totalContado += producto.precioContado();
        }
        return totalContado;
    }

    /**
     * Calcula el total financiado de todos los productos en el pedido.
     * 
     * @return El total financiado de los productos.
     */
    public double totalFinanciado() {
        double totalLista = 0;
        for (Producto producto : this.getProductos()) {
            totalLista += producto.precioLista();
        }
        return totalLista;
    }

    /**
     * Muestra el detalle del pedido, incluyendo la fecha, los productos, 
     * sus precios de lista y precios al contado.
     */
    public void mostrar() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(this.getFecha().getTime());

        System.out.println("****** Detalle del pedido ****** Fecha: " + fechaFormateada);
        System.out.println(String.format("%-30s\t%-15s\t%-15s", "Producto", "Precio lista", "Precio Contado"));
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        for (Producto unProducto : this.getProductos()) {
            System.out.println(String.format("%-30s\t%-15.2f\t%-15.2f",
                    unProducto.getDescripcion(),
                    unProducto.precioLista(),
                    unProducto.precioContado()));
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }
}
