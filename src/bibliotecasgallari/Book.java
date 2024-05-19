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
public class Book extends Document {
    private String title;
    
    public Book(String title){
        this.title=title;
    }
    
    public String getTitle(){
       return title;
    }
    
    public String toString() {
        return  "il titolo del libro e' " + title;
    }
    
   
    
}

