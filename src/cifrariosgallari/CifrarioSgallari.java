/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrariosgallari;
import java.util.Scanner;
/**
 *
 * @author studente
 */
public class CifrarioSgallari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chiave, asciiIniziale[], asciiCifrato[];
        char lettereIniziali[], lettereCifrate[];
        String stringaIniziale, stringaCifrata;
        System.out.println("inserisci la chiave: ");
        chiave=input.nextInt();
        
        System.out.println("inserisci la stringa: ");
        stringaIniziale=input.nextLine();
        
        stringaIniziale=stringaIniziale.toLowerCase();

        lettereIniziali = new char[stringaIniziale.length()];
        lettereCifrate = new char[stringaIniziale.length()];
        asciiIniziale = new int[stringaIniziale.length()];
        asciiCifrato=new int[stringaIniziale.length()];
        
        lettereIniziali = stringaIniziale.toCharArray();
        

        for(int i=0; i<stringaIniziale.length(); i++){
            asciiIniziale[i]=(int)stringaIniziale.charAt(i);
        }
        
        for(int i=0; i<stringaIniziale.length(); i++){
            if(asciiIniziale[i]+chiave<=122){
                asciiCifrato[i]=asciiIniziale[i]+chiave;
            }else{
                asciiCifrato[i]=asciiIniziale[i]+chiave-26;
            }
        }
        for(int i=0; i<stringaIniziale.length(); i++){
                lettereCifrate[i]=(char)asciiCifrato[i];
        }
        stringaCifrata=String.valueOf(lettereCifrate);
        System.out.println("la stringa cifrata e': "+stringaCifrata);
    }
    
}

