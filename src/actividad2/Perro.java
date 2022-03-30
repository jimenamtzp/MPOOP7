/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de perro que hereda datos de mascota.
 * @author Jimena Martínez
 */
public class Perro extends Mascota{
    private boolean colaCortada;
    /**
     * Constructor vacío.
     */
    public Perro() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param colaCortada
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Perro(boolean colaCortada, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }
    /**
     * Es método sirve para indicar si un objeto es igual a otro
     * @return colaCortada
     */
    public boolean isColaCortada() {
        return colaCortada;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param colaCortada 
     */
    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    /**
     * Método que indica que el perro está corriendo.
     */
    public void correr(){
        System.out.println("Estoy corriendo");
    }
    /**
     * Método que indica que el perro está correteando.
     */
    public void corretear(){
        System.out.println("Estoy corretetando");
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return "Perro{" + "colaCortada=" + colaCortada + '}';
    }
}
