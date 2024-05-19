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
public class Insegnante extends Persona{

    private String email;
    private String materia;

    public Insegnante(String nome, String cognome, String codiceFiscale, String telefono, String email, String materia) {
        super(nome, cognome, codiceFiscale, telefono);
        this.email= email;
        this.materia= materia;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email= email;
    }

    public String getMateria(){
        return materia;
    }

    public void setMateria(String materia){
        this.materia= materia;
    }

    @Override
    public String presentami() {
        return super.presentami()+" la mia mail è "+email+"ed insegno "+materia+"."; 
    }
}

