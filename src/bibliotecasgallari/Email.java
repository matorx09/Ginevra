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
public class Email extends Document {
    private String subject;
    private String [] to; 
    
    public Email(){
        
    }
    
    public Email(String subject,String [] to ){
        this.subject=subject;
        this.to=to;
    }
        
    public String getSubject(){
        return subject;
    }
    
    public String [] getTo(){
        return to;
    }
    
    public String toString() {
        return  "l'oggetto della Email è " + subject+ " mentre i destinatari sono "+to;
    }
}
