/**
 * La clase Punto representa un punto en un plano bidimensional con coordenadas X e Y.
 * Proporciona métodos para mover el punto, obtener sus coordenadas y mostrar su información.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Punto {
    
    private double x;
    private double y;
    
    /**
     * Constructor por defecto que inicializa el punto en el origen (X=0, Y=0).
     */
    public Punto() {
        this.setX(0.0);
        this.setY(0.0);
    }
    
    /**
     * Constructor que inicializa el punto con coordenadas específicas.
     * 
     * @param p_x La coordenada X del punto.
     * @param p_y La coordenada Y del punto.
     */
    public Punto(double p_x, double p_y) {
        this.setX(p_x);
        this.setY(p_y);
    }
    
    /**
     * Establece la coordenada X del punto.
     * 
     * @param p_x La nueva coordenada X.
     */
    private void setX(double p_x) {
        this.x = p_x;
    }
    
    /**
     * Establece la coordenada Y del punto.
     * 
     * @param p_y La nueva coordenada Y.
     */
    private void setY(double p_y) {
        this.y = p_y;
    }
    
    /**
     * Obtiene la coordenada X del punto.
     * 
     * @return La coordenada X del punto.
     */
    public double getX() {
        return this.x;
    }
    
    /**
     * Obtiene la coordenada Y del punto.
     * 
     * @return La coordenada Y del punto.
     */
    public double getY() {
        return this.y;
    }
    
    /**
     * Desplaza el punto en el plano sumando dx a la coordenada X y dy a la coordenada Y.
     * 
     * @param p_dx La cantidad a sumar a la coordenada X.
     * @param p_dy La cantidad a sumar a la coordenada Y.
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * Obtiene una cadena que representa las coordenadas del punto en el formato "(X, Y)".
     * 
     * @return Una cadena con el formato "(X, Y)".
     */
    public String coordenadas() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
    
    /**
     * Muestra la información del punto en la consola en el formato "Punto. X: X, Y: Y".
     */
    public void mostrar() {
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }
}
