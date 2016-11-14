/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4psp;

/**
 *
 * @author Señor Manel
 */
public class Ejercicio4PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Priori Fio1= new Priori("F1"); 
        Priori Fio2= new Priori("F2"); 
        Priori Fio3=new Priori("F3");
        Fio1.setPriority(10);
        Fio2.setPriority(5);
        Fio3.setPriority(1);
        Fio3.start();
        Fio2.start();
        Fio1.start();
        
    }
    
}

}