/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercato;
import java.util.GregorianCalendar;
/**
 *
 * @author Utente
 */
public class Alimentare extends Prodotto {
    private GregorianCalendar dataOggi=new GregorianCalendar();
    private GregorianCalendar scadenza;
    
    
    public Alimentare(GregorianCalendar scadenza, String codice, String descrizione, float prezzo) {
        super(codice, descrizione, prezzo);
        this.scadenza = scadenza;
    }

    public GregorianCalendar getScadenza() {
        return scadenza;
    }
    
    long milliseconds1 = dataOggi.getTimeInMillis();
    long milliseconds2 = scadenza.getTimeInMillis();
    long diff = milliseconds1 - milliseconds2;
    long diffDays = diff / (24 * 60 * 60 * 1000);
    
    @Override
    public String stampa(){
       return super.stampa()+" scadenza:"+scadenza+".";
    } 

    
   
    @Override
    public float applicaSconto() {
        if(diffDays <= 4){
            int percentuale = 10;
            return (getPrezzo()*percentuale)/100;
        } else{
            return super.applicaSconto();
        }
        
    }

    
    
    
}
