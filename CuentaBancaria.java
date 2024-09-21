/**
 * La clase CuentaBancaria representa una cuenta bancaria básica con operaciones para depositar y extraer fondos.
 * Mantiene información sobre el número de cuenta, saldo y el titular de la cuenta.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Constructor para la clase CuentaBancaria.
     * Inicializa el número de cuenta, el titular y establece el saldo a 0.0.
     * 
     * @param p_nroCuenta Número de cuenta de la cuenta bancaria.
     * @param p_titular Persona titular de la cuenta.
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    /**
     * Constructor para la clase CuentaBancaria con saldo inicial.
     * Inicializa el número de cuenta, el titular y el saldo.
     * 
     * @param p_nroCuenta Número de cuenta de la cuenta bancaria.
     * @param p_titular Persona titular de la cuenta.
     * @param p_saldo Saldo inicial de la cuenta.
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo)
    {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    /**
     * Establece el número de cuenta.
     * 
     * @param p_nroCuenta Número de cuenta de la cuenta bancaria.
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Establece el titular de la cuenta.
     * 
     * @param p_titular Persona titular de la cuenta.
     */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    /**
     * Establece el saldo de la cuenta.
     * 
     * @param p_saldo Saldo de la cuenta.
     */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    /**
     * Obtiene el número de cuenta.
     * 
     * @return Número de cuenta de la cuenta bancaria.
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    /**
     * Obtiene el saldo de la cuenta.
     * 
     * @return Saldo de la cuenta.
     */
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
     * Obtiene el titular de la cuenta.
     * 
     * @return Persona titular de la cuenta.
     */
    public Persona getTitular(){
        return this.titular;
    }
    
    /**
     * Deposita una cantidad en la cuenta y devuelve el saldo actualizado.
     * 
     * @param p_importe Importe a depositar en la cuenta.
     * @return Saldo actualizado de la cuenta.
     */
    public double depositar(double p_importe){
        double aumentarSaldo = this.getSaldo() + p_importe;
        this.setSaldo(aumentarSaldo);
        return this.getSaldo();
    }
    
    /**
     * Extrae una cantidad de la cuenta y devuelve el saldo actualizado.
     * 
     * @param p_importe Importe a extraer de la cuenta.
     * @return Saldo actualizado de la cuenta.
     */
    public double extraer(double p_importe){
        double disminuirSaldo = this.getSaldo() - p_importe;
        this.setSaldo(disminuirSaldo);
        return this.getSaldo();
    }
    
    /**
     * Muestra la información de la cuenta bancaria, incluyendo el titular y el saldo.
     */
    public void mostrar(){
        System.out.println("- Cuenta Bancaria -");
        System.out.println("Titular: " + this.getTitular().getNombre() + " (" + this.getTitular().edad() + " años)");
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    /**
     * Devuelve una representación en cadena de la cuenta bancaria.
     * 
     * @return Representación en cadena de la cuenta bancaria.
     */
    public String toString(){
        return this.getNroCuenta() + "\t" + this.getTitular().getNombre() + " " + this.getTitular().getApellido() + "\t" + this.getSaldo();
    }
}
