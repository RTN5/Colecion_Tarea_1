/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion_tarea_1;

/**
 *
 * @author User
 */
import java.util.Collection;
import java.util.ArrayList;
public class Coleccion_Tarea_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("    Universidad de las Fuerzas Armadas ESPE");
        System.out.println("Apellido y Nombre:Morales Esteban");
        System.out.println("NRC:7450\n");
        
        
        Collection ListaMaterialesProyecto = new ArrayList<String>();
        ListaMaterialesProyecto.add("Proto Board");
        ListaMaterialesProyecto.add("Pulsadores");
        ListaMaterialesProyecto.add("Circuitos Integrados");
        ListaMaterialesProyecto.add("Leds color rojos");
        ListaMaterialesProyecto.add("Bocina de audio");
        ListaMaterialesProyecto.add("Cables de timbre");
        ListaMaterialesProyecto.add("Bateria");
        ListaMaterialesProyecto.add("Interruptores");
        ListaMaterialesProyecto.add("Cinta adesiva");
        ListaMaterialesProyecto.add("Vaquelita");
        ListaMaterialesProyecto.add("Estaño");
        
        System.out.println(" Numero de Materailes para utilizar: "
                + "" + ListaMaterialesProyecto.size());
        System.out.println(" Los Materiales del Proyecto son:");
        System.out.println(ListaMaterialesProyecto.toString());
        
        ListaMaterialesProyecto.remove("Proto Board");
        ListaMaterialesProyecto.remove("Pulsadores");
        ListaMaterialesProyecto.remove("Circuitos Integrados");
        ListaMaterialesProyecto.remove("Leds color rojos");
        ListaMaterialesProyecto.remove("Bocina de audio");
        ListaMaterialesProyecto.remove("Cables de timbre");
        ListaMaterialesProyecto.remove("Bateria");
        
        
        System.out.println("\nMateriales ocupados en el proyecto son: Proto Board, pulsadores,"
                + "Circuitos Integrados, Leds color rojos, Bocina de audio, Cables de timbre"
                + "Bateria y Interruptores.\nTeniendo "+ListaMaterialesProyecto.size()+ ""
                + " materiales sin utilizar");
        System.out.println("Los Materiales no utilizados en el proyecto son:");
        System.out.println(ListaMaterialesProyecto.toString());
    }    
}
