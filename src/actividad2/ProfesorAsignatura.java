/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de profesor de asigantura que hereda datos de profesor.
 * @author Jimena Martínez
 */
public class ProfesorAsignatura extends Profesor{
    private String nomAsignatura;
    /**
     * Constructor vacío
     */
    public ProfesorAsignatura() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param nomAsignatura
     * @param numAlumnos
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public ProfesorAsignatura(String nomAsignatura, int numAlumnos, float salario, int horaEntrada, int horaSalida, actividad2.Mascota Mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, Mascota, nombre, edad);
        this.nomAsignatura = nomAsignatura;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return nomAsignatura
     */
    public String getNomAsignatura() {
        return nomAsignatura;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param nomAsignatura 
     */
    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return Mascota
     */
    public actividad2.Mascota getMascota() {
        return Mascota;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param Mascota 
     */
    public void setMascota(actividad2.Mascota Mascota) {
        this.Mascota = Mascota;
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return "ProfesorAsignatura{" + "nomAsignatura=" + nomAsignatura + '}';
    }
    
}
