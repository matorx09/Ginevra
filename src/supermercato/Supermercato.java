/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercato;

import java.util.GregorianCalendar;


public class Supermercato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSpesa lista_mamma = new ListaSpesa ();
        Prodotto p1 = new Prodotto("1f2e3y4", "carne_bovina", 7);
        System.out.println(p1.stampa());
        lista_mamma.aggiungiProdotto(p1);
        NonAlimentare p2 = new NonAlimentare("legno","587", "libreria", 100);
        System.out.println(p2.stampa());
        lista_mamma.aggiungiProdotto(p2);
        Prodotto p3 = new Prodotto("2345", "carne_equina", 8);
        System.out.println(p3.stampa());
        lista_mamma.aggiungiProdotto(p3);
	Prodotto p4 = new Prodotto("587", "sarago", 10);
        System.out.println(p4.stampa());
        lista_mamma.aggiungiProdotto(p4);
        GregorianCalendar scadenza2 = new GregorianCalendar(2024,05,4);
        Alimentare p5 = new Alimentare (scadenza2, "587", "pesce", 10);
        System.out.println(p5.stampa());
        lista_mamma.aggiungiProdotto(p5);
        System.out.println(lista_mamma.creaScontrino());

        System.out.println("Il prezzo senza sconti e' " + lista_mamma.calcolaTotale(false));
        p1.applicaSconto();
        p2.applicaSconto();
        p3.applicaSconto();
        p4.applicaSconto();
        p5.applicaSconto();
        
        System.out.println("Il prezzo con sconti e' " + lista_mamma.calcolaTotale(true));
        
    }
    
}
