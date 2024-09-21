import java.util.*;

/**
 * Esta clase representa a un empleado con información básica del mismo.
 * Cuenta con métodos para calcular la antigüedad del empleado, calcular descuentos y adicionales, 
 * obtener el sueldo neto y mostrar información detallada y en formato de línea.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Empleado {
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
        
    /**
     * Constructor de la clase Empleado.
     * 
     * @param p_cuil     CUIL del empleado.
     * @param p_apellido Apellido del empleado.
     * @param p_nombre   Nombre del empleado.
     * @param p_importe  Sueldo básico del empleado.
     * @param p_anio     Año de ingreso del empleado.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApe(p_apellido);
        this.setNombre(p_nombre);
        this.setImporte(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    /**
     * Constructor de la clase Empleado.
     * 
     * @param p_cuil     CUIL del empleado.
     * @param p_apellido Apellido del empleado.
     * @param p_nombre   Nombre del empleado.
     * @param p_importe  Sueldo básico del empleado.
     * @param p_fecha    Fecha de ingreso del empleado.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApe(p_apellido);
        this.setNombre(p_nombre);
        this.setImporte(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    
    private void setApe(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setImporte(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    private void setAnioIngreso(int p_anio){
        this.fechaIngreso = Calendar.getInstance();
        this.fechaIngreso.set(p_anio, 1, 1);
    }
    
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    public long getCuil(){return this.cuil;}
    public String getApellido(){return this.apellido;}
    public String getNombre(){return this.nombre;}
    public double getSueldo(){return this.sueldoBasico;}
    public int getAnioIngreso(){return this.fechaIngreso.get(Calendar.YEAR);}    
    public Calendar getFechaIngreso(){return this.fechaIngreso;}
    
    /**
     * Calcula la antigüedad del empleado.
     * 
     * @return La antigüedad del empleado.
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioActual = fechaHoy.get(Calendar.YEAR);
        return anioActual - this.getAnioIngreso();
    }
    
    /**
     * Calcula el descuento que se le aplicara a sueldo del empleado.
     * 
     * @return El monto del descuento.
     */
    private double descuento(){
        return (this.getSueldo()*0.02) + 1500;
    }
    
    /**
     * Calcula un adicional a agregar al sueldo del empleado según su antigüedad.
     * 
     * @return El monto del adicional.
     */
    private double adicional(){
        int antiguedad = antiguedad();
        double sueldo = this.getSueldo();
        
        if(antiguedad < 2){
            return sueldo * 0.02;
        }
        else if(antiguedad >= 2 && antiguedad < 10){
            return sueldo * 0.04;
        }
        else{
            return sueldo * 0.06;
        }
    }
    
    /**
     * Calcula el sueldo neto del empleado después de aplicar descuentos y adicionales.
     * 
     * @return El sueldo neto del empleado.
     */
    public double sueldoNeto(){
        return (this.getSueldo() + adicional()) - descuento();
    }
    
    /**
     * Devuelve el nombre y apellido del empleado.
     * 
     * @return El nombre y apellido del empleado.
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Devuelve el apellido y nombre del empleado.
     * 
     * @return El apellido y nombre del empleado.
     */
    public String apeYNom(){
        return this.getApellido() + ", " + this.getNombre();
    }
    
    /**
     * Muestra información detallada del empleado: nombre, CUIL, antigüedad y sueldo neto.
     */
    public void mostrar(){
        System.out.print("\nNombre y Apellido: " + nomYApe() +
        "\nCUIL: " + this.getCuil() + " Antiguedad: " + antiguedad() + " años de servicio" +
        "\nSueldo Neto: $" + sueldoNeto());
    }
    
    /**
     * Devuelve una cadena con la información del empleado en formato de línea.
     * 
     * @return Información del empleado en formato de línea.
     */
    public String mostrarLinea(){
        return this.getCuil() + " " +apeYNom() + " …………… $" + sueldoNeto();
    }
    
    /**
     * Verifica si la fecha actual coincide con la fecha de ingreso del empleado,
     * lo que indicara si es su aniversario en la empresa.
     *
     * @return true si es el aniversario, false en caso contrario.
     */
    public boolean esAniversario(){ 
        Calendar fechaHoy = Calendar.getInstance();
        int diaHoy = fechaHoy.get(Calendar.DATE);
        int mesHoy = fechaHoy.get(Calendar.MONTH);
        int diaIngreso = this.getFechaIngreso().get(Calendar.DATE);
        int mesIngreso = this.getFechaIngreso().get(Calendar.MONTH)-1;
        
        return diaHoy == diaIngreso && mesHoy == mesIngreso;
    }
}