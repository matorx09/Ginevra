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
public class DipendenteGiornaliero extends Personale{
    String codFiscale;
    double retribuzioneGiornaliera;
    int giorni=0;
    
    public DipendenteGiornaliero(String nome, String cognome, String indirizzo, int telefono, String codFiscale, double retribuzione, int giorni) {
        super(nome, cognome, indirizzo, telefono);
        this.codFiscale=codFiscale;
        this.retribuzioneGiornaliera=retribuzioneGiornaliera;
        this.giorni=giorni; 
    }

    public int giorni(int n){
        this.giorni=giorni+n;
        return giorni;
    }

    @Override
    public String stampaDati() {
        return super.stampaDati()+", codice fiscale: "+codFiscale+", retribuzione giornaliera: "+
                retribuzioneGiornaliera+" per "+giorni+" giorni."; 
    }
    
    @Override
    public double paga(){
        double retribuzioneTot=0;
        retribuzioneTot=retribuzioneGiornaliera*giorni;
        giorni=0;
        return retribuzioneTot;
    }
    
}