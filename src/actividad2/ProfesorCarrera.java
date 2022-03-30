/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de profesor de carrera que hereda datos de profesor.
 * @author Jimena Martínez
 */
public class ProfesorCarrera extends Profesor{
    private int numAsigantura;
    private int grupos;
    /**
     * Constructor vacío.
     */
    public ProfesorCarrera() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param numAsigantura
     * @param grupos
     * @param numAlumnos
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public ProfesorCarrera(int numAsigantura, int grupos, int numAlumnos, float salario, int horaEntrada, int horaSalida, actividad2.Mascota Mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, Mascota, nombre, edad);
        this.numAsigantura = numAsigantura;
        this.grupos = grupos;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return numAsignatura
     */
    public int getNumAsigantura() {
        return numAsigantura;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param numAsigantura 
     */
    public void setNumAsigantura(int numAsigantura) {
        this.numAsigantura = numAsigantura;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return grupos
     */
    public int getGrupos() {
        return grupos;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param grupos 
     */
    public void setGrupos(int grupos) {
        this.grupos = grupos;
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
        return "ProfesorCarrera{" + "numAsigantura=" + numAsigantura + ", grupos=" + grupos + '}';
    }
    
}
