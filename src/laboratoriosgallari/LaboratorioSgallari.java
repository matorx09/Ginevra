/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriosgallari;
import java.util.Scanner;
/**
 *
 * @author studente
 */
public class LaboratorioSgallari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    DNAsequencer DNA=new DNAsequencer("aatccagtatacgcagtatatgcgcgat"); 
    DNA.lunghezza();
    DNA.esiste("cagt");
    System.out.println("Inserire la sequenza da aggiungere");
    Scanner input=new Scanner(System.in);
    String seqDaAgg=input.nextLine();
    System.out.println("In che posizione vuoi applicarla?");
    int posizione2=input.nextInt();
    if(DNA.inserisci(seqDaAgg,posizione2)==true){
        System.out.println("Inserimento corretto");
    }else{
        System.out.println("Inserimento non corretto");
    }

    if(DNA.valida()==true){
        System.out.println("La sequenza è corretta");
    }else{
        System.out.println("La sequenza non è corretto");
    }
    }
}
    
