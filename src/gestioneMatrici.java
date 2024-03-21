/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrici;

import java.util.Scanner;

public class gestioneMatrici {

    public static void main(String[] args) { 
    
    //generaArray(6);
    
    
    
    //#############################################
    /*
    dichiara dim intera
    stampa "utente che dimensione matrice quadrata?"
    input int dell'utente con scanner
    oggetto scanner inizializza dim //dim è dimensione della matrice quadrata
    */
    int dim = 0;
    int i =0;
    int j = 0;
    
    Scanner input = new Scanner(System.in);
    Scanner element = new Scanner(System.in);
    System.out.println("inserisci la dimensione della matrice quadrata");
    dim = input.nextInt();
    int [][] dati = new int [dim][dim];
    
        System.out.println("stampa della matrice vuota");
        System.out.print(dati[i][j]+ " ");
    for( i = 0; i < dim; i++){
        for( j = 0; j < dim; j++){
            System.out.print(dati[i][j]+ " ");
        }
        System.out.println("");
    }
    
    for(int rig = 0; rig < dim; rig++){
        for(int col = 0; col < dim; col++){
            System.out.println("utente inserisci il contenuto dell'elemento alla riga" + rig + "colonna" + col);
            dati[rig][col]=element.nextInt();
        }
    }
    stampaMaggiore(dati);
    }
       
/*
confronto gli elementi di SommeRighe per sapere quale sia la riga con somma maggiore
confronto gli elementi di SommeColonne per sapere quale sia la riga con somma maggiore
confronto i due elementi finale per sapere il maggiori risultante
stampare ultimo messaggio all'utente'           
  */  
//###############################################################

    
    
    
public static void generaArray(int d){
    int[][] matrice1=new int[d][d];
    for(int i=0; i<d; i++){
        for(int j=0; j<d; j++){
            if(i==j||j<i)
                matrice1[i][j]=1;
            else{
                matrice1[i][j]=0;
            }
        }
    }
    for (int i = 0; i < matrice1.length; i++) {
        for (int j = 0; j < matrice1[i].length; j++) {
            System.out.print(matrice1[i][j] + " ");
        }
            System.out.println();
        }
}

public static void stampaMaggiore(int[][] dati){
    int [] sommeRighe = new int [dati.length];
    int [] sommeColonne = new int [dati.length];
       
    
//essendo dim righe serve un array di dimensione dim o dati.length                  
    for(int i=0; i < dati.length; i++){
        for (int j = 0; j < dati.length; j++) {
            sommeRighe[i] += dati[i][j];
            sommeColonne[i] += dati[j][i];
        }
    
        }     

        int maxRighe = 0;
        int maxCol = 0;
        int posMaxRighe= 0;
        int posMaxColonne= 0;
        for(int i=0; i < sommeRighe.length; i++){
            if(maxRighe < sommeRighe[i]){
                maxRighe = sommeRighe[i];
                posMaxRighe=i;
            }
            if(maxCol < sommeColonne[i]){
                maxCol = sommeColonne[i];
                posMaxColonne=i;
            }
        }
        if(maxRighe > maxCol){
            System.out.println("il massimo e' " + maxRighe +" alla riga "+posMaxRighe);
        }else{
            System.out.println("il massimo e' " +maxCol+" alla colonna "+posMaxColonne);
        }
    }

} // chiude la classe