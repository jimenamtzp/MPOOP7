/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop7;

import actividad1.Empleado;
import actividad1.Gerente;
import actividad2.SerVivo;

/**
 *
 * @author alumno
 */
public class MPOOP7 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
    Empleado empleado = new Empleado();
    empleado.setNombre("Joaquin");
    empleado.setNumEmpleado(998877);
    empleado.setSueldo(10_000);
    System.out.println(empleado);
    System.out.println(empleado.toString());
    empleado.aumentarSueldo(30);
        System.out.println(empleado);
        
    Gerente gerente = new Gerente();
    gerente.setNombre("Paulina");
    gerente.setNumEmpleado(887766);
    gerente.setSueldo(30_000);
    gerente.setPresupuesto(100_000);
    System.out.println(gerente);
    gerente.aumentarSueldo(50);
    System.out.println(gerente);
    
    Gerente gerente2 = new Gerente(1_000_000,"Saul",113365,50_000);
    System.out.println(gerente2);
    
    SerVivo serVivo1 = new SerVivo("Nombre",3);
    System.out.println(serVivo1);
    serVivo1.respirar();
    }
}
