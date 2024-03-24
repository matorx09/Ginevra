/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneMatrici_ordinamenti;
import java.util.*;

public class esempioStringhe{
     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String p,stringa2,stringa3;
            double lunghezzaTot, lunghezzaMedia;
            int nVocali=0, nSpazi=0, nChar=0;
            System.out.println("Inserire la String con cui si andrà a lavorare: ");
            p = input.nextLine();
            System.out.println("Inserire la seconda String con cui si andrà a lavorare: ");
            stringa2=input.nextLine();
            System.out.println("Inserire la terza String con cui si andrà a lavorare: ");
            stringa3=input.nextLine();
            lunghezzaTot=p.length()+stringa2.length()+stringa3.length();
            lunghezzaMedia=lunghezzaTot/3;

            for (int i=0; i<p.length(); i++) {
                    char c=p.toLowerCase().charAt(i);
                    if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                    nVocali++;
                    }
            }
            System.out.println("Il numero di vocali nella frase è: "+nVocali);

            for (int i=0; i<p.length(); i++) {
                    char c=p.charAt(i);
                    if (c==' ') {
                    nSpazi++;
                    }
            }
            System.out.println("Il numero di spazi bianchi nella frase è: " + nSpazi);

            double frequenzaVocali=(double)nVocali/p.length()*100;
            System.out.println("La frequenza di vocali è del "+frequenzaVocali+"%.");

            double frequenzaSpazi=(double)nSpazi/p.length()*100;
            System.out.println("La frequenza di spazi è del "+frequenzaSpazi+"%.");

            System.out.println("La frase tutta al minuscolo è "+p.toLowerCase());

            String copiaFrase=p.replace(" ", "");
            System.out.println("La frase senza spazi è: "+copiaFrase);

            System.out.println("Scegli il carattere da cercare: ");
            char carCercare=input.next().charAt(0);
            for (int i=0; i<p.length(); i++) {
                    char c=p.charAt(i);
                    if (c==carCercare) {
                    nChar++;
                    }
            }
            if(nChar!=0){
                    System.out.println("Il carattere ("+carCercare+") che hai scelto di cercare è presente.");
            }
            else{
                    System.out.println("Il carattere("+carCercare+") che hai scelto di cercapresre non è ente.");
            }

            System.out.println("La lunghezza media tra le 3 stringhe è: "+lunghezzaMedia);
    }


}
   