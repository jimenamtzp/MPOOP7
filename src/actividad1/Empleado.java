/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que almacena datos de empleado que heredará la clase gerente
 * @author Jimena Martínez
 */
public class Empleado { //extends Object
    private String nombre;
    private int numEmpleado, sueldo;

/**
 * Constructor vacio
 */
public Empleado() {
    }

/**
 * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
 * @param nombre
 * @param numEmpleado
 * @param sueldo 
 */
public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    /**
    * Método que muestra el valor del atributo.
    * @return 
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
     * @return 
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param numEmpleado 
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return 
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param sueldo 
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * Método que aumenta el sueldo del empleado que suma al ya preestablecido el aumento.
     * @param porcentaje 
     */
    public void aumentarSueldo(int porcentaje){
        sueldo += sueldo * porcentaje /100;
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio. 
     */
    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}
