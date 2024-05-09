package supermercato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;


    
public class Alimentare extends Prodotto {
    private GregorianCalendar dataOggi = new GregorianCalendar();
    private GregorianCalendar scadenza = new GregorianCalendar();
    long giorni; 
    /*deve essere dichiarata qui per diventare globale, quindi può essere vista
   sia dal metodo giorniAllaScadenza() e sia dal metodo applicaSconto()*/
    
    public Alimentare(GregorianCalendar scadenza, String codice, String descrizione, float prezzo) {
        super(codice, descrizione, prezzo);
        this.scadenza = scadenza;
    }
    
    
        
    public GregorianCalendar getScadenza() {
        return scadenza;
    }
    
    public long giorniAllaScadenza(GregorianCalendar dataAttuale){
        
        
        long milliseconds1 = dataAttuale.getTimeInMillis();
        long milliseconds2 = scadenza.getTimeInMillis();
        long diff = milliseconds2 - milliseconds1;
        giorni = (diff / (24 * 60 * 60 * 1000))*(-1);
        
        return giorni;
        
        //un risultato con numero negativo vuol dire che è il prodotto non è ancora scaduto,
        //quindi il segno va modificato in positivo per essere coerente alla logica di applicazione dello sconto
        //prevista nel metodo applicaSconto sovrascritto qui di seguito
    }
    
   
    @Override
    public String stampa(){
       return super.stampa()+" scadenza:"+scadenza+".";
    } 

    
   
    @Override
    public float applicaSconto() {
        if(giorni <= 4){
            int percentuale = 10;
            return (getPrezzo()*percentuale)/100;
        } else{
            return super.applicaSconto();
        }
        
    }

    
    
    
}
