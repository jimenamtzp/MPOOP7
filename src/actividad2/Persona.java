/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de persona que hereda datos de serVivo.
 * @author Jimena Martínez
 */
public class Persona extends SerVivo{
    Mascota Mascota;
    /**
     * Constructor vacío.
     */
    public Persona() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param Mascota
     * @param string
     * @param edad 
     */
    public Persona(Mascota Mascota, String nombre, int edad) {
        super(nombre, edad);
        this.Mascota = Mascota;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return Mascota
     */
    public Mascota getMascota() {
        return Mascota;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param Mascota 
     */
    public void setMascota(Mascota Mascota) {
        this.Mascota = Mascota;
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return "Persona{" + "Mascota=" + Mascota + '}';
    } 
}
