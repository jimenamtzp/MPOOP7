/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de profesor que hereda datos de empleado.
 * @author Jimena Martínez
 */
public class Profesor extends Empleado{
    private int numAlumnos;
    /**
     * Constructor vacío
     */
    public Profesor() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param numAlumnos
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public Profesor(int numAlumnos, float salario, int horaEntrada, int horaSalida, actividad2.Mascota Mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, Mascota, nombre, edad);
        this.numAlumnos = numAlumnos;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return numAlumnos
     */
    public int getNumAlumnos() {
        return numAlumnos;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param numAlumnos 
     */
    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
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
     * Método que indica que el profesor está reprobando a un alumno.
     */
    public void reprobar(){
        System.out.println("Estas reprobado");
    }
    /**
     * Método que indica que el profesor está pasando a un alumno.
     */
    public void pasarAlumnos(){
        System.out.println("¡Pasaste!");
    }
    /**
     * Método que indica que el profesor está explicándole a un alumno.
     */
    public void explicar(){
        System.out.println("Estoy explicando");
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return "Profesor{" + "numAlumnos=" + numAlumnos + '}';
    }
}
