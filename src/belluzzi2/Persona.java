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
public class Persona {
    public String nome;
    public String cognome;
    private String codiceFiscale;
    private String telefono;

    public Persona(String nome, String cognome, String codiceFiscale, String telefono){
        this.nome= nome;
        this.cognome= cognome;
        this.codiceFiscale= codiceFiscale;
        this.telefono= telefono;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public String getCodiceFiscale(){
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale){
        this.codiceFiscale = codiceFiscale;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String presentami(){
        return "Buongiorno, mi chiamo " + nome + " " + cognome;
    }
    
}
