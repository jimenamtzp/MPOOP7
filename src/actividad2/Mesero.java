/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de mascota que hereda datos a perro y a gato.
 * @author Jimena Martínez
 */
public class Mesero extends Empleado{
    private String restaurant;
    private int numMesas;
    private String colorUniforme;
    /**
     * Constructor vacío
     */
    public Mesero() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param restaurant
     * @param numMesas
     * @param colorUniforme
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public Mesero(String restaurant, int numMesas, String colorUniforme, float salario, int horaEntrada, int horaSalida, actividad2.Mascota Mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, Mascota, nombre, edad);
        this.restaurant = restaurant;
        this.numMesas = numMesas;
        this.colorUniforme = colorUniforme;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return restaurant
     */
    public String getRestaurant() {
        return restaurant;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param restaurant 
     */
    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return numMesas
     */
    public int getNumMesas() {
        return numMesas;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param numMesas 
     */
    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return colorUniforme
     */
    public String getColorUniforme() {
        return colorUniforme;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param colorUniforme 
     */
    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
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
     * Método que indica que el mesero está recibinedo el pedido.
     */
    public void recibirPedido(){
        System.out.println("Le tomo su orden");
    }
    /**
     * Método que indica que el mesero está entregando la orden.
     */
    public void darPedido(){
        System.out.println("Le entrego su orden");
    }
    /**
     * Método que indica que el mesero está recibinedo propina.
     */
    public void recibirpropina(){
        System.out.println("Estoy recibiendo propina");
    }
    /**
     * Método que indica que el mesero está descansando.
     */
    public void tomarDescanso(){
        System.out.println("¡Por fin estoy descansando!");
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return "Mesero{" + "restaurant=" + restaurant + ", numMesas=" + numMesas + ", colorUniforme=" + colorUniforme + '}';
    }
}
