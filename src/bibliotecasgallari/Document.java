/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecasgallari;
import java.util.GregorianCalendar;
/**
 *
 * @author Utente
 */
public class Document {
    private String [] authors;
    private GregorianCalendar data = new GregorianCalendar(2024, 01, 18);

    int anno = data.get(GregorianCalendar.YEAR);
    int mese = data.get(GregorianCalendar.MONTH) + 1;
    int giorno = data.get(GregorianCalendar.DATE);
    
    public Document(){
        
    }
  
    public Document(String [] authors){
        this.authors = authors;     
    }

    public String[] getAuthors(){
        return authors;
    }
    
    public void addAuthors(String name){
       /* String [] authorsMod = new String[authors.length + 1];
        
        for (int i = 0; i < authors.length; i++) {
            authorsMod[i] = authors[i];
            
        }
        authorsMod[authors.length] =  name;
*/
    }
    
    public GregorianCalendar getDate(){
        return data;
    }
    
    
    public String toString() {
        return  "gli autori del libro sono " + authors+ " ed è stato pubblicato il: "+ anno + " " + mese + " " + giorno;
    }
    

    
}
