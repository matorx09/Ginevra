/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalesgallari;

/**
 *
 * @author Utente
 */
public abstract class Personale {
    String nome,cognome,indirizzo;
    int telefono;

    public Personale(String nome, String cognome, String indirizzo, int telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }
    
    public String stampaDati(){
        return "il nome è: "+nome+" il cognome è:"+cognome+" l'indirizzo è:"+indirizzo+" mentre il telefono è:"+telefono;
    }
    
    public abstract double paga();
    
}
