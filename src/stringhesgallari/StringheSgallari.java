/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringhesgallari;
import java.util.Scanner;
/**
 *
 * @author Utente
 */
public class StringheSgallari {

public static void main(String[] args) {
Scanner input=new Scanner(System.in);
    String frase, frase2, frase3;
    double percentuale_vocali=0, percentuale_spazi=0, lunghezzatot=0, lunghezzamedia=0;
    int numero_vocali=0, numero_spazi=0, contatore = 0, carattere_presente=0;
    System.out.print("Inserisci una frase: ");
    frase=input.nextLine();
    contatore = 0;

    for (int i = 0; i<frase.length(); i++){
        char carattere= frase.charAt(i);
        if (carattere=='a' || carattere=='e' || carattere=='i' || carattere=='o' || carattere=='u' || carattere=='A' || carattere=='E' || carattere=='I' || carattere=='O' || carattere=='U'){
            contatore++;
            numero_vocali=contatore;
        }
    }
    System.out.println("il numero di vocali è "+numero_vocali);
        
    contatore=0;
    for (int i = 0; i<frase.length(); i++){
        char carattere= frase.charAt(i);
        if (carattere==' '){
            contatore++;
            numero_spazi=contatore;
        }
    }
    System.out.println("il numero di spazi è "+numero_spazi);
    percentuale_vocali=(double)numero_vocali/frase.length()*100;
    percentuale_spazi=(double)numero_spazi/frase.length()*100;
        
    System.out.println("Frequenza delle vocali: "+percentuale_vocali+"%");
    System.out.println("Frequenza degli spazi bianchi: "+percentuale_spazi+"%");
        
    String minuscolo;
    minuscolo= frase.toLowerCase();
    System.out.println("frase in minuscolo: "+minuscolo);

    String frase_senza_spazi= frase.replace(" ", "");
    System.out.println("Frase originale: "+frase);
    System.out.println("Nuova frase senza spazi: "+frase_senza_spazi);
    System.out.println("inserisci il char da verificarne la prenenza nella stringa");
        
    char char_da_cercare=input.next().charAt(0);
    for (int i = 0; i<frase.length(); i++){
        char c= frase.charAt(i);
        if (c==char_da_cercare){
            carattere_presente++;
        }
    }
        if(carattere_presente!=0){
            System.out.println("Il carattere che hai scelto è presente ");
        }
        else{
            System.out.println("Il carattere che hai scelto non è presente");
        }
        
    System.out.print("Inserisci la seconda frase: ");
    frase2=input.nextLine();
    System.out.println(" ");
    System.out.print("Inserisci la terza frase: ");
    frase3=input.nextLine();
    lunghezzatot=frase.length()+frase2.length()+frase3.length();
    lunghezzamedia=lunghezzatot/3;
    System.out.println("la lunghezza media delle stringhe è: "+lunghezzamedia);
    }
    
}
    

