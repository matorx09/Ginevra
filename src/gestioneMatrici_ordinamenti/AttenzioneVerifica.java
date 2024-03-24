
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
    
    //main ******************************************************************************************
    public static void main(String[] args) {
        Scanner continua = new Scanner(System.in);
        int inizia = 1;
        
        do{     
            System.out.println("Caro utente scegli quale degli esercizi vuoi eseguire: ");
            System.out.println("1 per visualizzare le somme di neg e pos");
            System.out.println("2 per ordinamento con Bubble Sort");

            int metodo;
            Scanner inputUtente = new Scanner(System.in);
            metodo = inputUtente.nextInt();

            switch(metodo) {
                case 1:
                sommeNegPos();
                  break;
                case 2:
                unioneOrdinataArray();

                break;
                default:
                    System.out.println("scelta non valida, ciao!");
              }
            System.out.println("");
            System.out.println("");
            System.out.println("Vuoi continuare, 0 per uscire o 1 per continuare ?");
            inizia  = continua.nextInt();
        }while(inizia == 1);
    }
    
    
    
    /*
  * Realizzare e testare in un main i metodi che consentono di risolvere i seguenti problemi relativi agli array:

• Dato un array numerico di N posizioni determinare e comunicare 
la somma delle componenti positive e quella delle componenti negative.

*/
    //visuallizza le somme di positivi e negativi ******************************************************************************************
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
    
    
 /*   • Dati due array numerici  A(N), B(M) ordinarli in modo crescente e costruire un terzo array
che contenga gli elementi di contenuti in A,B sempre ordinati in modo crescente. 
Stampare a video il terzo output.
(due array iniziali devono essere uniti in un terzo, conservando la crescenza dei valori dopo essere stati uniti)
 */
    
    //metodo di unione di due array ******************************************************************************************
    public static void unioneOrdinataArray(){
        int n,m;
        
        /*
        assegnazione casuale
        
        int min = 10;
        int max = 100;
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
         */
        
        
        
        Scanner inputUtente = new Scanner(System.in);
        System.out.println("Caro utente inserisce la dimensione del primo array: ");
        n = inputUtente.nextInt();
        System.out.println("Inserisce la dimensione del secondo array");
        m = inputUtente.nextInt();
        
        int [] A = new int [n];
        int [] B = new int [m];
        
        inizializzaArray(A);
        System.out.println("Ecco l'array A stampato: ");
        stampaArray(A);
        
        
        System.out.println("Ecco l'array A ordinato: ");
        bubble(A);
        stampaArray(A);
        
        
        inizializzaArray(B);
        System.out.println("Ecco l'array B stampato: ");
        stampaArray(B);
        
        System.out.println("Ecco l'array B ordinato: ");
        bubble(B);
        stampaArray(B);
        
        int [] C = new int [n+m];
        unioneDueArray(A,B,C);
        System.out.println("Ecco l'unione dei due arrey");
        stampaArray(C);
        bubble(C);
        System.out.println("Ecco l'array C ordinato: ");
        stampaArray(C);
        
        
        /*
        //inizializzazione manuale
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
        */
        
            
                
                
    }
    
    
    // unione di due array qualsiasi ******************************************************************************************
    public static void unioneDueArray(int []a, int []b,int []c){
        //array c, ha come dimensione la somma delle dimensioni di a e b
        
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++){
            c[j+a.length] = b[j];
        }        
    }
    
    
    //inizializzazione di due array qualsiasi ******************************************************************************************
    public static int[] inizializzaArray(int []array){
            //inizializzazione di array + stampa
        int min = 10;
        int max = 100;
        
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * (max - min + 1)) + min;
            //System.out.print(" " + array[i]);
        }
        return array;
    }
    
    //stampa di un array qualsiasi ******************************************************************************************
    public static void stampaArray(int []array){
        
        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println("");
    }
    
    //metodo di ordinamento Bubble Sort ******************************************************************************************
    public static int[] bubble(int []array){
        int temp;
        for(int iter = 0; iter < array.length-1; iter++){
            for(int i = 0; i < array.length-1; i++){
                 if(array[i] > array[i+1]){
                     temp = array[i];
                     array[i] = array[i+1];
                     array[i+1] = temp;
                 }
            }
        }
        
        return array;
    }
    
   /* • Dato quindi un array Nomi(M) contenente N nomi ottenere un altro array 
    nel quale siano stati eliminati I nomi  duplicati, e con i nomi rimanenti 
    ordinanti come nell’array originale 
*/
     public static void arrayStringhe() {
        String[] nomi = {"Mario", "Luigi", "Mario", "Peach", "Luigi", "Yoshi", "Mario"};
        String[] nomiSenzaDuplicati = rimuoviDuplicatiEMantieniOrdine(nomi);
        
        for (String nome : nomiSenzaDuplicati) {
            System.out.println(nome);
        }
    }

    public static String[] rimuoviDuplicatiEMantieniOrdine(String[] nomi) {
        List<String> nomiList = Arrays.asList(nomi);
        LinkedHashSet<String> set = new LinkedHashSet<>(nomiList); // Utilizziamo LinkedHashSet per mantenere l'ordine di inserimento

        return set.toArray(new String[0]);
    }
    
    
}