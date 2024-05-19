/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecasgallari;

/**
 *
 * @author Utente
 */
public class BibliotecaSgallari {

    public static void main(String[] args) {
        String [] authors = {"Marino", "Ginevra"};
        String [] to= {"John","Rita"};
        
        Document doc1 = new Document();
        Document doc2  = new Document(authors);
        
        Book book1 = new Book("piccole donne");
        Book book2 = new Book("interstellar");
        
        Email EM1 = new Email();
        Email EM2 = new Email("scuola",to);
        
        System.out.println(doc1.toString());
        System.out.println(book1.toString()); 
        System.out.println(EM1.toString()); 
    }
    
}
