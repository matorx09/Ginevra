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
public abstract class Componente {
     private String modello,marca;

    public Componente(String modello, String marca) {
        this.modello = modello;
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }
  
    public abstract void stampaSpecifiche();
}
    

