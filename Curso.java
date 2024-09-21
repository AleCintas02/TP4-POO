import java.util.*;

/**
 * La clase Curso representa un curso que puede inscribir alumnos y gestionar su información.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Curso {
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;
    
    /**
     * Constructor que inicializa el curso con un nombre y una lista vacía de alumnos.
     * 
     * @param p_nombre El nombre del curso.
     */
    public Curso(String p_nombre) {
       this.setNombre(p_nombre);
       this.setAlumnos(new HashMap<>());
    }

    /**
     * Constructor que inicializa el curso con un nombre y una lista de alumnos.
     * 
     * @param p_nombre El nombre del curso.
     * @param p_alumnos Un mapa de alumnos inscritos en el curso.
     */
    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos) {
         this.setNombre(p_nombre);
         this.setAlumnos(p_alumnos);
    }
    
    /**
     * Establece el nombre del curso.
     * 
     * @param p_nombre El nuevo nombre del curso.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Establece el mapa de alumnos inscritos en el curso.
     * 
     * @param p_alumnos El nuevo mapa de alumnos.
     */
    private void setAlumnos(HashMap<Integer, Alumno> p_alumnos) {
        this.alumnos = p_alumnos;
    }
    
    /**
     * Obtiene el mapa de alumnos inscritos en el curso.
     * 
     * @return El mapa de alumnos.
     */
    public HashMap<Integer, Alumno> getAlumnos() {
        return this.alumnos;
    }
    
    /**
     * Inscribe a un alumno en el curso.
     * 
     * @param p_alumno El alumno a inscribir.
     */
    public void inscribirAlumno(Alumno p_alumno) {
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }
    
    /**
     * Quita a un alumno del curso.
     * 
     * @param p_alumno El alumno a quitar.
     * @return El alumno que fue quitado.
     */
    public Alumno quitarAlumno(Alumno p_alumno) {
        this.getAlumnos().remove(p_alumno.getLu(), p_alumno);
        return p_alumno;
    }
    
    /**
     * Verifica si un alumno está inscrito en el curso mediante su LU.
     * 
     * @param p_lu El LU del alumno.
     * @return Verdadero si el alumno está inscrito, falso en caso contrario.
     */
    public boolean estaInscripto(int p_lu) {
        return this.getAlumnos().containsKey(p_lu);
    }
    
    /**
     * Verifica si un alumno está inscrito en el curso.
     * 
     * @param p_alumno El alumno a verificar.
     * @return Verdadero si el alumno está inscrito, falso en caso contrario.
     */
    public boolean estaInscripto(Alumno p_alumno) {
        return this.getAlumnos().containsValue(p_alumno);
    }
    
    /**
     * Busca un alumno en el curso mediante su LU.
     * 
     * @param p_lu El LU del alumno a buscar.
     * @return El alumno encontrado, o null si no está inscrito.
     */
    public Alumno buscarAlumno(int p_lu) {
        return this.getAlumnos().get(p_lu);
    }
    
    /**
     * Obtiene la cantidad de alumnos inscritos en el curso.
     * 
     * @return El número de alumnos inscritos.
     */
    public int cantidadDeAlumnos() {
        int contadorAlumnos = 0;
        for (Map.Entry<Integer, Alumno> e : this.getAlumnos().entrySet()) {
            contadorAlumnos++;
        }
        return contadorAlumnos;
    }
    
    /**
     * Muestra en la consola la lista de alumnos inscritos en el curso.
     */
    public void mostrarInscriptos() {
        for (Map.Entry<Integer, Alumno> e : this.getAlumnos().entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue().getNombre());
        }
    }
}
