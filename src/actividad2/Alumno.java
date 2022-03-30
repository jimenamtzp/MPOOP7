/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de alumno que hereda datos de persona
 * @author Jimena Martínez
 */
public class Alumno extends Persona{
    private String carrera;
    private int semestre;
    /**
     * 
     */
    public Alumno() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param carrera
     * @param semestre
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public Alumno(String carrera, int semestre, actividad2.Mascota Mascota, String nombre, int edad) {
        super(Mascota, nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return carrera
     */
    public String getCarrera() {
        return carrera;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param carrera 
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return semestre
     */
    public int getSemestre() {
        return semestre;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param semestre 
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
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
     * Método que indica que el alumno está aprendiendo.
     */
    public void aprender(){
        System.out.println("Estoy aprendiendo");
    }
    /**
     * Método que indica que el alumno está estudiando.
     */
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    /**
     * Método que indica que el alumno está dándose de baja.
     */
    public void darseDeBaja(){
        System.out.println("Se antoja darse de baja");
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return "Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
}
