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
public class DipendenteImpiegato extends Personale {
    String codFiscale;
    double retribuzioneMensile,bonus;
    
    public DipendenteImpiegato(String nome, String cognome, String indirizzo, int telefono, String codFiscale, double retribuzioneMensile,double bonus) {
        super(nome, cognome, indirizzo, telefono);
        this.codFiscale=codFiscale;
        this.retribuzioneMensile=retribuzioneMensile;
        this.bonus=bonus; 
    }
    
    public double gratifica(double x){
        bonus=bonus+x;
        return bonus;
    }

    @Override
    public String stampaDati() {
        return super.stampaDati()+", codice fiscale: "+codFiscale+", retribuzione mensile: "+
                retribuzioneMensile+" con "+bonus+" di bonus"; 
    }
    
    @Override
     public double paga(){
        double retribuzioneTot=0;
        retribuzioneTot=retribuzioneMensile+bonus;
        bonus=0;
        return retribuzioneTot;
    }
}
