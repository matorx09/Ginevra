
package cifraturasgallari;
import java.util.Scanner;

public class CifraturaSgallari {

 public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int chiave, asciiIniziale[], asciiCifrato[];
    char lettereIniziali[], lettereCifrate[];
    String stringaIniziale, stringaCifrata;
    System.out.println("inserisci la chiave: ");
    chiave=input.nextInt();
    input.nextLine();
    System.out.println("inserisci la stringa: ");
    stringaIniziale=input.nextLine();
    System.out.println("Vuoi cifrare o decifrare? se vuoi cifrare digita 1 se vuoi decifrare digita 2: ");
    int cifratura=input.nextInt();
    stringaIniziale=stringaIniziale.toLowerCase();
        
    lettereIniziali=new char[stringaIniziale.length()];
    lettereCifrate=new char[stringaIniziale.length()];
    asciiIniziale=new int[stringaIniziale.length()];
    asciiCifrato=new int[stringaIniziale.length()];
        
    lettereIniziali=stringaIniziale.toCharArray();
        
    if(cifratura==1){
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
    else{
        for(int i=0; i<stringaIniziale.length(); i++){
        asciiIniziale[i]=(int)stringaIniziale.charAt(i);
    }
    for(int i=0; i<stringaIniziale.length(); i++){
        if(asciiIniziale[i]-chiave>=97){
            asciiCifrato[i]=asciiIniziale[i]-chiave;
        }else{
            asciiCifrato[i]=asciiIniziale[i]-chiave+26;
             }
    }
    for(int i=0; i<stringaIniziale.length(); i++){
        lettereCifrate[i]=(char)asciiCifrato[i];
    }
    stringaCifrata=String.valueOf(lettereCifrate);
    System.out.println("la stringa cifrata e': "+stringaCifrata);
    }
    }
}