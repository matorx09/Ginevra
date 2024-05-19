/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belluzzi2;
import java.util.Scanner;
/**
 *
 * @author Utente
 */
public class Belluzzi2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dim=1,dim2=1;
        Studente[] studenti= new Studente[dim];
        for (int i= 0; i < dim; i++){
            System.out.println("Inserisci i dati dello studente " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome= input.nextLine();
            System.out.print("Cognome: ");
            String cognome= input.nextLine();
            System.out.print("Codice Fiscale: ");
            String codiceFiscale= input.nextLine();
            System.out.print("Telefono: ");
            String telefono= input.nextLine();
            System.out.print("Email: ");
            String email= input.nextLine();
            System.out.print("Matricola: ");
            String matricola= input.nextLine();
            System.out.print("Classe: ");
            String classe= input.nextLine();
            System.out.print("Corso: ");
            String corso= input.nextLine();

            studenti[i]= new Studente(nome, cognome, codiceFiscale, telefono, email, matricola, classe, corso);
            System.out.println(studenti[i].presentami());
        }

        Insegnante[] insegnanti= new Insegnante[dim2];
        for (int i= 0; i < dim2; i++) {
            System.out.println("Inserisci i dati dell'insegnante "+(i + 1)+":");
            System.out.print("Nome: ");
            String nome= input.nextLine();
            System.out.print("Cognome: ");
            String cognome= input.nextLine();
            System.out.print("Codice Fiscale: ");
            String codiceFiscale= input.nextLine();
            System.out.print("Telefono: ");
            String telefono= input.nextLine();
            System.out.print("Email: ");
            String email= input.nextLine();
            System.out.print("Materia: ");
            String materia= input.nextLine();

            insegnanti[i]= new Insegnante(nome, cognome, codiceFiscale, telefono, email, materia);
            System.out.println(insegnanti[i].presentami());
        }
        
        StudenteErasmus[] studentiErasmus= new StudenteErasmus[dim2];
        for (int i= 0; i < dim2; i++) {
            System.out.println("Inserisci i dati dello studente Erasmus " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome= input.nextLine();
            System.out.print("Cognome: ");
            String cognome= input.nextLine();
            System.out.print("Codice Fiscale: ");
            String codiceFiscale= input.nextLine();
            System.out.print("Telefono: ");
            String telefono= input.nextLine();
            System.out.print("Email: ");
            String email= input.nextLine();
            System.out.print("Matricola: ");
            String matricola= input.nextLine();
            System.out.print("Classe: ");
            String classe= input.nextLine();
            System.out.print("Corso: ");
            String corso= input.nextLine();
            System.out.print("Nazione: ");
            String nazione= input.nextLine();
            System.out.print("Durata (in mesi): ");
            int durata= input.nextInt();
            input.nextLine();

            studentiErasmus[i] = new StudenteErasmus(nome, cognome, codiceFiscale, telefono, email, matricola, classe, corso, nazione, durata);
            System.out.println(studentiErasmus[i].presentami());
        }
    }
}
    

