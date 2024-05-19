package frazioni;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class frazioniSgallari {

    public static void main(String[] args) {
        Frazioni f1=new Frazioni(12,3);
        Frazioni f2=new Frazioni(1,5);
        
        System.out.println("frazione 1:");
        f1.definisci(12,3);
        f1.definisci(14,7);
        f1.e_intero();
        f1.stampa_fraz();
        System.out.println("frazione 2:");
        f2.definisci(1,3);
        f2.definisci(1,5);
        f2.e_intero();
        f2.stampa_fraz();
        
    }
    
}
