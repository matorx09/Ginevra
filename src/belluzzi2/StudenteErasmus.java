/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belluzzi2;


public class StudenteErasmus extends Studente{
    private String nazione;
    private int durata;

    public StudenteErasmus(String nome, String cognome, String codiceFiscale, String telefono, String email, String matricola, String classe, String corso, String nazione, int durata){
        super(nome, cognome, codiceFiscale, telefono, email, matricola, classe, corso);
        this.nazione= nazione;
        this.durata= durata;
    }

    public String getNazione(){
        return nazione;
    }

    public void setNazione(String nazione){
        this.nazione= nazione;
    }

    public int getDurata(){
        return durata;
    }

    public void setDurata(int durata){
        this.durata= durata;
    }

    @Override
    public String presentami() {
        return "Good morning I'm "+super.nome+" "+super.cognome+", I'm from  "+nazione+ "and my exchange will last "+durata
                +" month/s."; 
    }
    
}
