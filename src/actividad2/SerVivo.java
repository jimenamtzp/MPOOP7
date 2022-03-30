/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de ser vivo de la que se heredan atributos y métodos a las demás clases existentes.
 * @author Jimena Martínez
 */
public class SerVivo {
    private String nombre;
    private int edad;
    /**
     * Constructor vacío.
     */
    public SerVivo() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param nombre
     * @param edad 
     */
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Método que indica que el ser vivo está respirando.
     */
    public void respirar(){
        System.out.println("Estoy respirando");
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return "serVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
