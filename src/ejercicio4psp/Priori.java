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
public class Priori extends Thread{
    String nombre;
    
    public Priori(String nombre){
        super(nombre);
        this.nombre=nombre;
    }
    
    @Override
    public void run(){
        if("F1".equals(nombre)){  
            int suma=0;
            for (int i = 0; i < 1000; i++) {
                if(i%2==0){
                  suma=suma+i;  
            }
                
                
            }System.out.println(getName()+":"+suma);
        }else if("F2".equals(nombre)){
            int numero=0;
            for (int i = 1; i <=1000; i++) {
                if(i%2!=0)
                    numero=numero+i;
            
            }System.out.println(getName()+":"+numero);
        }else{
            int numero=0;
            for (int i = 0; i < 1000; i++) {
                if(i%10==2 || i%10==3)
                    numero=numero+i;
                
            }System.out.println(getName()+":"+numero);
            }}
    }

