/**
 * Clase que representa un producto en el sistema.
 * Incluye información como código, rubro, descripción, costo, stock, porcentaje de punto de reposición,
 * existencia mínima y el laboratorio asociado.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Producto {

    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    /**
     * Constructor de la clase Producto.
     * 
     * @param p_codigo Código del producto.
     * @param p_rubro Rubro del producto.
     * @param p_desc Descripción del producto.
     * @param p_costo Costo del producto.
     * @param p_stock Cantidad de stock del producto.
     * @param p_porcPtoRepo Porcentaje de punto de reposición.
     * @param p_existMinima Existencia mínima del producto.
     * @param p_lab Laboratorio asociado al producto.
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, int p_stock, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab) {
        setCodigo(p_codigo);
        setRubro(p_rubro);
        setDescripcion(p_desc);
        setCosto(p_costo);
        setStock(p_stock);
        setporcPtoRepo(p_porcPtoRepo);
        setExistMinima(p_existMinima);
        setLaboratorio(p_lab);
    }

    /**
     * Constructor de la clase Producto con valores predeterminados para stock, porcentaje de punto de reposición
     * y existencia mínima.
     * 
     * @param p_codigo Código del producto.
     * @param p_rubro Rubro del producto.
     * @param p_desc Descripción del producto.
     * @param p_costo Costo del producto.
     * @param p_lab Laboratorio asociado al producto.
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab) {
        setCodigo(p_codigo);
        setRubro(p_rubro);
        setDescripcion(p_desc);
        setCosto(p_costo);
        setStock(0);
        setporcPtoRepo(0.0);
        setExistMinima(0);
        setLaboratorio(p_lab);
    }

    /**
     * Establece el laboratorio asociado al producto.
     * 
     * @param p_lab Laboratorio asociado al producto.
     */
    private void setLaboratorio(Laboratorio p_lab) {
        this.laboratorio = p_lab;
    }

    /**
     * Establece el código del producto.
     * 
     * @param p_codigo Código del producto.
     */
    private void setCodigo(int p_codigo) {
        this.codigo = p_codigo;
    }

    /**
     * Establece el rubro del producto.
     * 
     * @param p_rubro Rubro del producto.
     */
    private void setRubro(String p_rubro) {
        this.rubro = p_rubro;
    }

    /**
     * Establece la descripción del producto.
     * 
     * @param p_descripcion Descripción del producto.
     */
    private void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }

    /**
     * Establece el costo del producto.
     * 
     * @param p_costo Costo del producto.
     */
    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    /**
     * Establece el stock del producto.
     * 
     * @param p_stock Cantidad de stock del producto.
     */
    private void setStock(int p_stock) {
        this.stock = p_stock;
    }

    /**
     * Establece el porcentaje de punto de reposición del producto.
     * 
     * @param p_porcPtoRepo Porcentaje de punto de reposición.
     */
    private void setporcPtoRepo(double p_porcPtoRepo) {
        this.porcPtoRepo = p_porcPtoRepo;
    }

    /**
     * Establece la existencia mínima del producto.
     * 
     * @param p_existMinima Existencia mínima del producto.
     */
    private void setExistMinima(int p_existMinima) {
        this.existMinima = p_existMinima;
    }

    /**
     * Obtiene el laboratorio asociado al producto.
     * 
     * @return Laboratorio asociado al producto.
     */
    public Laboratorio getLaboratorio() {
        return this.laboratorio;
    }

    /**
     * Obtiene el código del producto.
     * 
     * @return Código del producto.
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * Obtiene el rubro del producto.
     * 
     * @return Rubro del producto.
     */
    public String getRubro() {
        return this.rubro;
    }

    /**
     * Obtiene la descripción del producto.
     * 
     * @return Descripción del producto.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Obtiene el costo del producto.
     * 
     * @return Costo del producto.
     */
    public double getCosto() {
        return this.costo;
    }

    /**
     * Obtiene la cantidad de stock del producto.
     * 
     * @return Cantidad de stock del producto.
     */
    public int getStock() {
        return this.stock;
    }

    /**
     * Obtiene el porcentaje de punto de reposición del producto.
     * 
     * @return Porcentaje de punto de reposición.
     */
    public double getPorcPtoRepo() {
        return this.porcPtoRepo;
    }

    /**
     * Obtiene la existencia mínima del producto.
     * 
     * @return Existencia mínima del producto.
     */
    public double getExistMinima() {
        return this.existMinima;
    }

    /**
     * Calcula el precio de lista del producto, agregando un porcentaje al costo.
     * 
     * @return Precio de lista del producto.
     */
    public double precioLista() {
        double porcentaje = this.getCosto() * 0.12;
        return this.getCosto() + porcentaje;
    }

    /**
     * Calcula el valor total del stock valorizado, agregando un porcentaje al costo total del stock.
     * 
     * @return Valor del stock valorizado.
     */
    public double stockValorizado() {
        double stockVal = this.getCosto() * this.getStock();
        double porcentaje = stockVal * 0.12;
        return stockVal + porcentaje;
    }

    /**
     * Ajusta el porcentaje de punto de reposición del producto.
     * 
     * @param p_porce Nuevo porcentaje de punto de reposición.
     */
    public void ajustarPtoRepo(double p_porce) {
        this.setporcPtoRepo(p_porce);
    }

    /**
     * Ajusta la existencia mínima del producto.
     * 
     * @param p_cantidad Nueva existencia mínima.
     */
    public void ajustarExistMin(int p_cantidad) {
        this.setExistMinima(p_cantidad);
    }

    /**
     * Ajusta la cantidad de stock del producto, sumando una cantidad especificada.
     * 
     * @param p_cantidad Cantidad a sumar al stock.
     */
    public void ajuste(int p_cantidad) {
        this.setStock(this.getStock() + p_cantidad);
    }

    /**
     * Calcula el precio al contado del producto, aplicando un descuento al costo.
     * 
     * @return Precio al contado del producto.
     */
    public double precioContado() {
        return this.getCosto() - (this.getCosto() * 0.05);
    }

    /**
     * Muestra una línea de información del producto con su descripción, costo y precio al contado.
     * 
     * @return Información en formato de cadena del producto.
     */
    public String mostrarLinea() {
        return "\n\n" + getDescripcion() + " " + getCosto() + " " + precioContado();
    }

    /**
     * Muestra la información detallada del producto, incluyendo los datos del laboratorio, rubro, descripción,
     * costo, stock y valor del stock valorizado.
     */
    public void mostrar() {
        System.out.println("\n\nLaboratorio: " + this.getLaboratorio().getNombre());
        System.out.println("Domicilio: " + this.getLaboratorio().getDomicilio() + "    -Telefono: " + this.getLaboratorio().getTelefono());
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("Precio costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock());
        System.out.println("Stock valorizado: " + this.stockValorizado());
    }
}
