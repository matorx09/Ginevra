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
public abstract class Processore extends Componente {
    double frequenza;
    int numeroCore;

    public Processore(double frequenza, int numeroCore, String modello, String marca) {
        super(modello, marca);
        this.frequenza = frequenza;
        this.numeroCore = numeroCore;
    }
    
    public double getFrequenza() {
        return frequenza;
    }

    public int getNumeroCore() {
        return numeroCore;
    }

    @Override
    public abstract void stampaSpecifiche() ; 
    
    
}
