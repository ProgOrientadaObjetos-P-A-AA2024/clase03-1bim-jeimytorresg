/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author reroes
 */
public class Ejecutable02 {
    
    public static void main(String[] args) {
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        h1.establecerNombre("Vaca Ortíz");
        h2.establecerNombre("Militar");
        h3.establecerNombre("Manuel IM");
        /*
        El System.out.printf esta imprimiendo los valores de los atributos que
        se han asignado mediante los metodos. En este caso solo esta siendo
        llamado el metodo establecerNombre, por tanto solo el atributo nombre
        tendra un valor. En la ejecucion del codigo, numeroCamas y presupuesto
        no tienen ningun valor asignado, por lo cual el programa imprimira los 
        valores de esas variables que se asignan por default (en este caso, 0)
        
        */
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        /*
        h1.establecerNombre("Hospital Vaca Ortíz");
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        
        System.out.println("------------------");
        
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        */
        
    }
}
