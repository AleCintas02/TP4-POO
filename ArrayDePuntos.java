import java.util.Scanner;

/**
 * La clase ArrayDePuntos permite al usuario ingresar un conjunto de puntos
 * en un plano bidimensional, mostrando sus coordenadas y calculando las distancias 
 * entre puntos consecutivos.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class ArrayDePuntos {

    /**
     * Método principal que ejecuta el programa. Solicita al usuario ingresar las 
     * coordenadas de 6 puntos, luego muestra las coordenadas ingresadas y calcula 
     * las distancias entre puntos consecutivos.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Punto[] puntos = new Punto[6];
        Scanner scanner = new Scanner(System.in);

        // Solicita las coordenadas de los 6 puntos
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Ingrese las coordenadas del punto " + (i + 1) + ":");
            System.out.print("Coordenada X: ");
            double x = scanner.nextDouble();
            System.out.print("Coordenada Y: ");
            double y = scanner.nextDouble();
            
            puntos[i] = new Punto(x, y);
        }

        // Muestra las coordenadas de los puntos ingresados
        System.out.println("\nCoordenadas de los puntos:");
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Punto " + (i + 1) + ": " + puntos[i].coordenadas());
        }

        // Calcula y muestra las distancias entre puntos consecutivos
        System.out.println("\nDistancias entre puntos consecutivos:");
        for (int i = 0; i < puntos.length - 1; i++) {
            double distancia = calcularDistancia(puntos[i], puntos[i + 1]);
            System.out.println("Distancia entre Punto " + (i + 1) + " y Punto " + (i + 2) + ": " + distancia);
        }

        scanner.close();
    }

    /**
     * Calcula la distancia entre dos puntos en un plano bidimensional.
     * 
     * @param p1 El primer punto.
     * @param p2 El segundo punto.
     * @return La distancia entre los dos puntos.
     */
    public static double calcularDistancia(Punto p1, Punto p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
