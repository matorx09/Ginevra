/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preverifica;

/**
 *
 * @author Utente
 */
public abstract class Periferica extends Componente {
    String tipoConnessione,descrizione;

    public Periferica(String tipoConnessione, String descrizione, String modello, String marca) {
        super(modello, marca);
        this.tipoConnessione = tipoConnessione;
        this.descrizione = descrizione;
    }
    
    @Override
    public abstract void stampaSpecifiche();

}
