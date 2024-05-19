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
public class Volontario extends Personale {

    public Volontario(String nome, String cognome, String indirizzo, int telefono) {
        super(nome, cognome, indirizzo, telefono);
    }
    
    @Override
    public double paga(){
        return 0;
    }
    
}