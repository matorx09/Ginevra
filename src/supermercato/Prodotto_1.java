/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercato;

/**
 *
 * @author Utente
 */
public class Prodotto {
    private String codice;
    private String descrizione;
    private float prezzo;
    private float percentuale=5;

    public Prodotto(String codice, String descrizione, float prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }
    
    public float applicaSconto(){
        prezzo=(prezzo*percentuale)/100;
        return prezzo;
    }
    public String stampa(){
        return "descrizione:"+descrizione+" codice: "+codice+" prezzo:"+prezzo+".";
    }
    
}
