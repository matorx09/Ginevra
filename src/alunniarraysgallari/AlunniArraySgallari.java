
package alunniarraysgallari;
import java.util.Scanner;

public class AlunniArraySgallari {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=0;
        System.out.print("Inserisci il numero di studenti: ");
        n = input.nextInt();
        String[] nomi=new String[n];
        int[][] voti=new int[n][5];
 
        for (int i = 0; i<n; i++) {
            System.out.print("Inserisci il nome dello studente "+ (i+1) +": ");
            nomi[i]=input.nextLine(); 
        }
        
        for (int i=0; i<n; i++) {
            System.out.println("*****Studente " +nomi[i]+ "*****: ");
            for (int j=0; j<5; j++) {
                System.out.println("Inserisci il voto " +(j+1)+ " per lo studente " +(i+1)+ ": ");
                voti[i][j] = input.nextInt();
            }       
        }
        
        double[] media = new double[n];
        for (int i=0; i<n; i++){
            double somma=0;
            for (int j=0; j<5; j++){
                somma+=voti[i][j];
            }
            media[i]=somma/5;
            System.out.println("La media dello studente "+nomi[i]+" è: "+media[i]);
        }
        
        double mediatot=0;
        for (int i=0; i<n; i++) {
            mediatot+=media[i];
        }
        mediatot/=n;
        System.out.println("La media tot degli studenti è "+mediatot);
        
        //5 giudizio
        System.out.println("Nome dello studente\tMedia\tGiudizio");
        String giudizio="";
        for (int i = 0; i < n; i++) {
            
            if(media[i]>=0 && media[i]<3){
                giudizio="Gravemente insufficiente";
            }
            if(media[i]>=3 && media[i]<5){
                giudizio="Insufficiente";
            }
            if(media[i]>=5 && media[i]<6){
                giudizio="Lievemente insufficiente";
            }
            if(media[i]>=6 && media[i]<7){
                giudizio="Sufficiente";
            }
            if(media[i]>=7 && media[i]<8){
                giudizio="Buono";
            }
            if(media[i]>=8 && media[i]<10){
                giudizio="Eccellente";
            }
            System.out.println(nomi[i] + "\t\t\t" + media[i] + "\t\t" + giudizio);
        }
        
        double maxMedia = media[0];
        String nomeMaxMedia = nomi[0];
        for (int i=1; i<n; i++) {
            if (media[i]>maxMedia) {
                maxMedia=media[i];
                nomeMaxMedia=nomi[i];
            }
        }
        System.out.println("Lo studente "+ nomeMaxMedia +" ha la media più alta con: " + maxMedia);
        
        int maxVoto = voti[0][0];
        String nomeMaxVoto = nomi[0];
        for (int i=0; i<n; i++) {
            for (int j=0; j<5; j++) {
                if (voti[i][j]>maxVoto) {
                    maxVoto=voti[i][j];
                    nomeMaxVoto=nomi[i];
                }
            }
        }
        System.out.println("Lo studente "+ nomeMaxVoto +" ha il voto più alta con: " + maxVoto);
    }
    }