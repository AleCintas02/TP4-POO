/**
 * La clase AplicacionBanco contiene el método principal que simula el funcionamiento de un banco,
 * creando empleados, localidades, personas, cuentas bancarias y un banco.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class AplicacionBanco {
   /**
    * El método main es el punto de entrada de la aplicación. Crea instancias de empleados,
    * localidades, personas, cuentas bancarias y un banco, y luego muestra la información del banco.
    * 
    * @param args Argumentos de línea de comandos (no utilizados en esta aplicación).
    */
   public static void main(String [] args) {
       Empleado empleado1 = new Empleado(20445420205L, "Cintas", "Alejandro", 100000.0, 2018);
       Empleado empleado2 = new Empleado(27267504235L, "Perez", "Lorena", 50000.0, 2020);
       
       Localidad localidad1 = new Localidad("Corrientes", "Corrientes");
       
       Persona persona1 = new Persona(44542020, "Jose", "Gonzales", 1993);
       Persona persona2 = new Persona(41667921, "Julia", "Lopez", 1983);
       Persona persona3 = new Persona(32423423, "Pepe", "Gomez", 1996);
       
       CuentaBancaria cuenta1 = new CuentaBancaria(1, persona1);
       CuentaBancaria cuenta2 = new CuentaBancaria(2, persona2, 10000.0);
       CuentaBancaria cuenta3 = new CuentaBancaria(1, persona3);
       
       Banco banco1 = new Banco("HSBC", localidad1, 1, empleado1);
       
       banco1.agregarEmpleado(empleado2);
       banco1.agregarCuentaBancaria(cuenta1);
       banco1.agregarCuentaBancaria(cuenta2);
       banco1.agregarCuentaBancaria(cuenta3);
       banco1.mostrar();
   }
}
