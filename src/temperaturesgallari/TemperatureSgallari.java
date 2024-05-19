/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturesgallari;

/**
 *
 * @author Utente
 */
public class TemperatureSgallari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        termometro t1=new termometro();
        termometro t2=new termometro();
        t1.setTemperatura(13);
        t1.setTemperatura(15);
        t1.setTemperatura(22);
        t1.setTemperatura(6);
        t1.setTemperatura(20);
        
        t2.setTemperatura(-2);
        t2.setTemperatura(-3);
        t2.setTemperatura(0);
        t2.setTemperatura(15.5f);
        t2.setTemperatura(14);
        
System.out.println("Il primo termometro ha temperatura attuale di: "+t1.getTemperatura()+", la temperatura massima registrata è: "+t1.getMax()+", la minima è: "+t1.getMin());
System.out.println("Il secondo termometro ha temperatura attuale di: "+t2.getTemperatura()+", la temperatura massima registrata è: "+t2.getMax()+", la minima è: "+t2.getMin());
    }
    
}
    
    

