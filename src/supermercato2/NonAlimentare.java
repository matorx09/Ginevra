package supermercato2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Utente
 */
public class NonAlimentare extends Prodotto {
    private String materiale;
    

    public NonAlimentare(String materiale, String codice, String descrizione, float prezzo) {
        super(codice, descrizione, prezzo);
        this.materiale = materiale;
    }

    public String getMateriale() {
        return materiale;
    }
   
    @Override
    public String stampa(){
        return super.stampa()+" materiale:"+materiale+".";
    }
    
    @Override
    public float applicaSconto() {
        if(materiale=="carta"||materiale=="plastica"||materiale=="vetro"){
            int percentuale = 8;
            return (getPrezzo()*percentuale)/100;
        } else{
            return super.applicaSconto();
        }  
    }
}
