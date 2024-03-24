/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneMatrici_ordinamenti;

/**
 *
 * @author mdt
 */
public class esStringhe {
    
    public static void main(String[] args) {
        System.out.println("ESERCIZIO 1");
        int[] array1 = {-1,4,-10,5};
        somma(array1);
        System.out.println("");
        System.out.println("ESERCIZIO 2");
        int[] array2primo = {1,5,7,3,6};
        int[] array2secondo = {2,8,4,9};
        ordineCrescente(array2primo,array2secondo);
        System.out.println("\n");
        System.out.println("ESERCIZIO 3");
        String[] array3 = {"ugo","rita","luca","ugo","pippo"};
        duplicati(array3);
        System.out.println("\nESERCIZIO 4");
        int[][] array4 = {{0, 1, 2, 50},{-1, -34, 3, 2},{6, 1, 2, 5}};
        matrice(array4);
        System.out.println("\nESERCIZIO 5");
        String[]array5nomi={"Emanuele","Carlo","Alex","Alessandro","Davide"};
        int[][]array5voti={{5,7,8,4,6},{3,9,7,6,6},{4,5,6,7,6},{7,7,8,6,6},{6,9,6,7,5}};
        studenti(array5nomi,array5voti);
    }
    static void somma(int [] array){
        int sommaPositiva=0,sommaNegativa=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                sommaNegativa+=array[i];
            }
            else{
                sommaPositiva+=array[i];
            }
        }
        System.out.println("La somma delle componenti positive è: "+sommaPositiva);
        System.out.println("La somma dellecomponenti negative è: "+sommaNegativa);
    }
    
    static int[] ordineCrescente(int[] arrayA,int[] arrayB){
        int[] terzoArray= new int[arrayA.length+arrayB.length];
        for(int i=0;i<arrayA.length;i++){
            terzoArray[i]=arrayA[i];
        }
        for(int j=0;j<arrayB.length;j++){
            terzoArray[arrayA.length+j]=arrayB[j];
        }
        int c;
        for(int i=0;i<terzoArray.length;i++){
            for(int j=0;j<terzoArray.length;j++){
                if(terzoArray[i]<terzoArray[j] && i!=j){
                    c=terzoArray[i];
                    terzoArray[i]=terzoArray[j];
                    terzoArray[j]=c;
                }
            }
        }
        System.out.println("L'array in ordine crescente è: ");
        for(int j=0;j<terzoArray.length;j++){
            System.out.print(terzoArray[j]+" ");
        }
        return terzoArray;
    }
    
    static void duplicati(String[] nomi){
        String[] ordine= new String[nomi.length];
        boolean ripetuto;
        int c=0;
        for(int i=0;i<nomi.length;i++){
            ripetuto=false;
            for(int j=0;j<nomi.length;j++){
                if(nomi[i]==nomi[j] && i!=j){
                    ripetuto=true;
                }
            }
            if(ripetuto==false){
                ordine[c]=nomi[i];
                c++;
            }
        }
        System.out.println("L'array senza nomi duplicati è: ");
        for(int i=0;i<ordine.length;i++){
            System.out.println(ordine[i]);
        }
    }
    
    
    
    static void matrice(int[][] dati){
        int maxNumero = dati[0][0];
        int minNumero= dati[0][0];
        int colonna_max=0, riga_max=0, colonna_min=0, riga_min=0;;
        for (int i=0; i<dati.length; i++) {
            for (int j=0; j<dati[i].length; j++) {
                if (dati[i][j]>maxNumero) {
                    maxNumero=dati[i][j];
                    colonna_max=j;
                    riga_max=i;
                }
                else{
                    if(dati[i][j]<minNumero){
                        minNumero=dati[i][j];
                        colonna_min=j;
                        riga_min=i;
                    }
                }
            }
        }
        System.out.println("Il numero più alto si trova nella riga "+riga_max+" colonna "+colonna_max+" ed è il numero "+maxNumero);
        System.out.println("Il numero più basso si trova nella riga "+riga_min+" colonna "+colonna_min+" ed è il numero "+minNumero);
    }
    
    static void studenti(String[] nomi,int[][] voti){
        double[] media = new double[nomi.length];
    	for (int i=0; i<nomi.length; i++){
        	double somma=0;
        	for (int j=0; j<5; j++){
            	somma+=voti[i][j];
        	}
        	media[i]=somma/nomi.length;
        	System.out.println("La media dello studente "+nomi[i]+" è: "+media[i]);
    	}
        
    	double mediatot=0;
    	for (int i=0; i<nomi.length; i++) {
        	mediatot+=media[i];
    	}
    	mediatot/=nomi.length;
    	System.out.println("La media tot degli studenti è "+mediatot);
   	
    	System.out.println("Nome dello studente\tMedia\t\tGiudizio");
    	String giudizio="";
    	for (int i = 0; i < nomi.length; i++) {
        	if(media[i]>=1 && media[i]<=3){
            	giudizio="Gravemente insufficiente";
        	}
        	if(media[i]>=4 && media[i]<=5){
            	giudizio="Insufficiente";
        	}
        	if(media[i]==6){
            	giudizio="Sufficiente";
        	}
        	if(media[i]==7){
            	giudizio="Discreto";
        	}
                if(media[i]==8){
            	giudizio="Buono";
        	}
                if(media[i]==9){
            	giudizio="Ottimo";
        	}
        	if(media[i]==10){
            	giudizio="Eccellente";
        	}
        	System.out.println(nomi[i] + "\t\t\t" + media[i] + "\t\t" + giudizio);
    	}
    }


}
