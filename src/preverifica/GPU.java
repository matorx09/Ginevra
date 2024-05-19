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
public class GPU extends Periferica {

    public GPU(String tipoConnessione, String descrizione, String modello, String marca) {
        super(tipoConnessione, descrizione, modello, marca);
    }

    
    @Override
    public void stampaSpecifiche() {
        System.out.println("il tipo di connessione è "+tipoConnessione+", la descrizione è "+descrizione+", il modello è "+super.getModello()+
            "mentre la marca è "+super.getMarca());
    }
    
    
}
