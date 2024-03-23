/*
  * Realizzare e testare in un main i metodi che consentono di risolvere i seguenti problemi relativi agli array:

• Dato un array numerico di N posizioni determinare e comunicare 
la somma delle componenti positive e quella delle componenti negative.

• Dati due array numerici  A(N), B(M) ordinarli in modo crescente e costruire un terzo array
che contenga gli elementi di contenuti in A,B sempre ordinati in modo crescente. 
Stampare a video il terzo output.
(due array iniziali devono essere uniti in un terzo, conservando la crescenza dei valori dopo essere stati uniti)
 */
package gestioneMatrici_ordinamenti;
import java.util.*;

/**
 *
 * @author Utente
 */
public class AttenzioneVerifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("metodo 1:");
        sommeNegPos();
    }
    public static void sommeNegPos(){
        int N = 0;
        int sommePos=0;
        int sommeNeg=0;
        Scanner inputUtente = new Scanner(System.in);
        System.out.println("Caro utente inserisce la dimensione dell'array: ");
        N = inputUtente.nextInt();
        int [] array = new int [N];
        System.out.println("lunghezza dell'array con length: " + array.length);
        
        for(int i = 0; i < array.length; i++){
            System.out.println("inserisci sti cacchio di numeri ");
            array[i] = inputUtente.nextInt();
            
            if(array[i] > 0){
                sommePos = sommePos + array[i];
            } else if (array[i] < 0){
                sommeNeg = sommeNeg+array[i];
            }
        }
    System.out.println("la somma dei numeri positivi è "+sommePos); 
    System.out.println("la somma dei numeri negativi è "+sommeNeg);
    }
    
    public static void unioneOrdinataArray(){
        int n,m, temp;
        Scanner inputUtente = new Scanner(System.in);
        System.out.println("Caro utente inserisce la dimensione dell'array: ");
        n= inputUtente.nextInt();
        int [] A = new int [n];
        
        System.out.println("Caro utente inserisce la dimensione del secondo array: ");
        m= inputUtente.nextInt();
        int [] B = new int [m];
        int [] C= new int [n+m];
        
        System.out.println("inserisci sti cacchio di numeri " + n + " volte");
        for(int i = 0; i < A.length; i++){            
            A[i] = inputUtente.nextInt();
        }
        
        System.out.println("inserisci sti cacchio di numeri per il secondo array" + m + " volte");
        for(int i = 0; i < B.length; i++){     
            B[i] = inputUtente.nextInt();
        }
        
        for(int iter = 0; iter < A.length-1; iter++){
            for(int i = 0; i < A.length-1; i++){
                 if(A[i] > A[i+1]){
                     temp = A[i];
                     A[i] = A[i+1];
                     A[i+1] = temp;
                 }
            }
        }
            
                
                
    }
    
    public static int[] bubble(int []array){
        return 
    }
    
}
      

