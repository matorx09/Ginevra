/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belluzzi2;

/**
 *
 * @author Utente
 */
public class Studente extends Persona{
    private String email;
    private String matricola;
    private String classe;
    private String corso;

    public Studente(String nome, String cognome, String codiceFiscale, String telefono, String email, String matricola, String classe, String corso){
        super(nome, cognome, codiceFiscale, telefono);
        this.email= email;
        this.matricola= matricola;
        this.classe= classe;
        this.corso= corso;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email= email;
    }

    public String getMatricola(){
        return matricola;
    }

    public void setMatricola(String matricola){
        this.matricola= matricola;
    }

    public String getClasse(){
        return classe;
    }

    public void setClasse(String classe){
        this.classe= classe;
    }

    public String getCorso(){
        return corso;
    }

    public void setCorso(String corso){
        this.corso= corso;
    }

    @Override
    public String presentami() {
        return super.presentami()+", la mia mail è "+email+", frequento la classe "+classe+" del corso "+corso+" e la "
            + "mia matricola è "+matricola+"."; 
    }
    
}
