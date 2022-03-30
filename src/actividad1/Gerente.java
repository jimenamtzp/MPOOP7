/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

    /**
     * Clase que hereda datos de la clase empleado y almacena datos del gerente.
     * @author Jimena Martínez
     */
    public class Gerente extends Empleado{
    private int presupuesto;
    /**
     * Constructor vacío
     */
    public Gerente() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param i1
     * @param i2
     * @param nombre
     * @param sueldo 
     */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);//super hace referencia al padre es un constructor
        this.presupuesto = presupuesto;
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param presupuesto 
     */
    public void asignarPresupuesto(int presupuesto){
    this.presupuesto = presupuesto;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return 
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param presupuesto 
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return super.toString()+"gerente{" + "presupuesto=" + presupuesto + '}';
    }

}
