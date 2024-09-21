/**
 * La clase Carrera contiene el método principal que simula el funcionamiento de un curso,
 * inscribiendo alumnos, mostrando información sobre ellos y gestionando su inscripción.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Carrera {
    /**
     * El método main es el punto de entrada de la aplicación. Crea un curso y alumnos, inscribe
     * a los alumnos en el curso y muestra información sobre la inscripción y los alumnos.
     * 
     * @param args Argumentos de línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String [] args) {
        Curso curso1 = new Curso("Programacion");
        
        Alumno alumno1 = new Alumno(1, "Pedro", "Gomez");
        alumno1.setNota1(7.0);
        alumno1.setNota2(8.0);
        
        Alumno alumno2 = new Alumno(2, "Maria", "Vasquez");
        alumno2.setNota1(6.0);
        alumno2.setNota2(9.0);
        
        Alumno alumno3 = new Alumno(3, "Juan", "Perez");
        alumno3.setNota1(10.0);
        alumno3.setNota2(10.0);
           
        curso1.inscribirAlumno(alumno1);
        curso1.inscribirAlumno(alumno2);
        curso1.inscribirAlumno(alumno3);
        
        System.out.println("****-- Cantidad de inscriptos: " + curso1.cantidadDeAlumnos());
        curso1.mostrarInscriptos();
        
        System.out.println("****-- Se da de baja a " + curso1.quitarAlumno(alumno1).nomYApe() + " porque abandona el curso --****" );
        System.out.println("Esta inscripto " + alumno1.nomYApe() + "?? --> " + curso1.estaInscripto(alumno1));
        
        System.out.println("\n");
        System.out.println("****-- Cantidad de inscriptos: " + curso1.cantidadDeAlumnos());
        curso1.mostrarInscriptos();
        
        System.out.println("\n");
        System.out.println("****-- Busca y muestra el alumno con numero de libreta 2 --****");
        System.out.println("Apellido y nombre: " + curso1.buscarAlumno(2).nomYApe());
        System.out.println("LU: " + curso1.buscarAlumno(2).getLu());
        System.out.println("Notas: " + curso1.buscarAlumno(2).getNota1() + ", " + curso1.buscarAlumno(2).getNota2());
        System.out.println("Promedio: " + curso1.buscarAlumno(2).promedio());
        
        System.out.println("\n");
        System.out.println("****-- Mostrar promedio del alumno " + alumno3.getLu() +  "--****");
        System.out.println("Promedio: " + curso1.buscarAlumno(3).promedio());
    }
}
