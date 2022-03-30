/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de mascota que hereda datos a perro y a gato.
 * @author Jimena Martínez
 */
public class Mascota extends SerVivo{
    private String color;
    private String raza;
    private String colorOjos;
    /**
     * Constructor vacío
     */
    public Mascota() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param string
     * @param string1
     * @param raza
     * @param string3
     * @param colorOjos
     * @param nombre
     * @param i
     * @param edad 
     */
    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return raza
     */
    public String getRaza() {
        return raza;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param raza 
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return colorOjos
     */
    public String getColorOjos() {
        return colorOjos;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param colorOjos 
     */
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    /**
     * Método que indica que la mascota está durmiendo.
     */
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
    /**
     * Método que indica que la mascota está brincando.
     */
    public void saltar(){
        System.out.println("Estoy saltando");
    }
    /**
     * Método que indica que la mascota está jugando.
     */
    public void jugar(){
        System.out.println("Estoy jugando");
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return "Mascota{" + "color=" + color + ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }

}
