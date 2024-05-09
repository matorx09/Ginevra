package supermercato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

    
public class Supermercato {

    /**
     * @param args the command line arguments
     */

     
    
    public static void main(String[] args) {
        ListaSpesa lista_mamma = new ListaSpesa ();
        Prodotto p1 = new Prodotto("1f2e3y4", "carne_bovina", 7);
        lista_mamma.aggiungiProdotto(p1);
        NonAlimentare p2 = new NonAlimentare("legno","587", "libreria", 100);
        lista_mamma.aggiungiProdotto(p2);
        Prodotto p3 = new Prodotto("2345", "carne_equina", 8);					
        lista_mamma.aggiungiProdotto(p3);
	Prodotto p4 = new Prodotto("587", "sarago", 10);
        lista_mamma.aggiungiProdotto(p4);
       /*
        Prodotto p5 = new Prodotto("587", "sarago", 10);
        lista_mamma.aggiungiProdotto(p4);
        */
        
        
        GregorianCalendar scadenza2 = new GregorianCalendar();
        scadenza2.set(2024, 8, 25);
        
        Alimentare p5 = new Alimentare (scadenza2 , "587", "pesce", 10);
        lista_mamma.aggiungiProdotto(p5);

        System.out.println("La lista completa degli acquisti e' : " );
        System.out.println(lista_mamma.creaScontrino());
       
        System.out.println("Il prezzo senza sconti e' " + lista_mamma.calcolaTotale(false));

        lista_mamma.applicaScontiTot();
        /*
         p1.applicaSconto();
         p2.applicaSconto();
         p3.applicaSconto();
         p4.applicaSconto();
         p5.applicaSconto();

 */
        System.out.println("Il prezzo con sconti e' " + lista_mamma.calcolaTotale(true));


        System.out.println(lista_mamma.letturaNome("carne_bovina"));
       
        /*
        GregorianCalendar data1 = new GregorianCalendar(2007, 11, 8);
        GregorianCalendar data2 = new GregorianCalendar(2007, 11, 10);
        long milliseconds1 = data1.getTimeInMillis();
        long milliseconds2 = data2.getTimeInMillis();
        long diff = milliseconds2 - milliseconds1;
        //long diffSeconds = diff / 1000; //differenza in secondi
        //long diffMinutes = diff / (60 * 1000); //differenza in minuti
        //long diffHours = diff / (60 * 60 * 1000); //differenza in ore
        long diffDays = diff / (24 * 60 * 60 * 1000); //differenza in giorni
        
       
        // Output del numero di giorni tra le due date
        System.out.println("Numero di giorni tra le due date: " + diffDays);
        */
        
        //è necessario formatta l'oggetto gregorianCalendar prima di stamparlo
        //System.out.println("la scadenza di p5 e' il "+ p5.getScadenza() );
        
        SimpleDateFormat dataParsed =  new SimpleDateFormat("dd/MM/yyyy");
        System.out.println( "la scadenza di p5 e' il "+dataParsed.format( p5.getScadenza().getTime() ) );
        
        GregorianCalendar dataOggi = new GregorianCalendar();
        dataOggi.set(2024, 11, 25);
        
        
        //SimpleDateFormat dataOggiParsed =  new SimpleDateFormat("dd/MM/yyyy");
        //uso lo stesso oggetto dataOggiParsed per non crearne un altro e risparmiare memoria
        //tanto mi serve solo per aggiustare il formato data
        System.out.println("La data di oggi e' " + dataParsed.format(dataOggi.getTime()));
        
        System.out.println("i giorni mancanti alla scandenza di p5 sono " + p5.giorniAllaScadenza(dataOggi));

    }
    
}