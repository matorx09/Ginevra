/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalesgallari;

/**

 *

 
  * creo un array di tipo personale di 6 posizioni
 * 2 volontari (nome cognome indirizzo telefono)
 * 2 dipgiorn nome cognome indirizzo telefono cf 50 
 * 2 dipmimpiegati nome cognome indirizzo telefono cf 1800 BONUS
 * 
 * sommo i metodi paga di ogni ogni oggetto per stampare al somma complessiva delle paghe
 * 
 * 
 * 
 * 
 */
public class PersonaleSgallari {

    public static void main(String[] args) {
        Personale[] staff= new Personale[6];
        double pagheTot=0;
        staff[0]= new Volontario ("marino","torsello","torsello.marino@gmail.com",6345278);
        staff[1]= new Volontario ("gin","sgalla","sga.gin@gmail.com",374932);
        staff[2]= new DipendenteGiornaliero ("rita","mar","mar.rita@gmail.com",374932,"hdfjd839jekf",23,3);
        staff[3]= new DipendenteGiornaliero ("ludo","luccio","luccio.ludo@gmail.com",84022,"bwur43893",30,7);
        staff[4]= new DipendenteImpiegato ("john","torres","torres.john@gmail.com",349332,"935thfcnic4",900,10);
        staff[5]= new DipendenteImpiegato ("luca","coll","coll.luca@gmail.com",184532,"4d893dm43",2000,90);
        
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].paga());
            staff[i].stampaDati();
            pagheTot += staff[i].paga();
        }
        
        System.out.println("la paga totale è: "+pagheTot+" euro");
        
    }
    
}