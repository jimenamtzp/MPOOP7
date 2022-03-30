/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que almacena datos de empleado que hereda datos de persona
 * @author Jimena Martínez
 */
public class Empleado extends Persona{
    private float salario;
    private int horaEntrada;
    private int horaSalida;
    /**
     * Constructor vacío
     */
    public Empleado() {
    }
    /**
     * Método cuyo identificador coincide con el de la clase correspondiente y que tiene por objetivo obligar a controlar cómo se inicializa una instancia de una determinada clase.
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param Mascota
     * @param nombre
     * @param edad 
     */
    public Empleado(float salario, int horaEntrada, int horaSalida, actividad2.Mascota Mascota, String nombre, int edad) {
        super(Mascota, nombre, edad);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return salario
     */
    public float getSalario() {
        return salario;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param salario 
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return horaEntrada
     */
    public int getHoraEntrada() {
        return horaEntrada;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param horaEntrada 
     */
    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    /**
     * Método que muestra el valor del atributo.
     * @return horaSalida
     */
    public int getHoraSalida() {
        return horaSalida;
    }
    /**
     * Método que modifica el valor del atributo.
     * @param horaSalida 
     */
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
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
     * Método que indica que el empleado está aclarando dudas.
     */
    public void aclararDudas(){
        System.out.println("Hora de aclarar dudas");
    }
    /**
     * Convierte a String (es decir, a una cadena de texto) cualquier objeto.
     * @return Devuelve todas la variables que añadimos al principio.
     */
    @Override
    public String toString() {
        return "Empleado{" + "salario=" + salario + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }
      
}
