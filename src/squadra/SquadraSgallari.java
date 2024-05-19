package squadra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class SquadraSgallari {

    public static void main(String[] args) {
        Squadra juve=new Squadra("Juventus",2,4,2);
        Squadra milan=new Squadra();
        
        milan.nomeSquadra="Milan";
        juve.aggiorna(2,7,4);
        milan.aggiorna(6,3,3);
        
        if(juve.punti()>milan.punti()){
            System.out.println("La squadra "+juve.nomeSquadra+" è in vantaggio con "+juve.punti()+" punti.");
        }
        if(juve.punti()<milan.punti()){
            System.out.println("La squadra "+milan.nomeSquadra+" è in vantaggio con "+milan.punti()+" punti.");
        }
        if(juve.punti()==milan.punti()){
            System.out.println("le squadre sono in pareggio!");
        }
        
        juve.inizioAnno();
        milan.inizioAnno();
    }
    
}

