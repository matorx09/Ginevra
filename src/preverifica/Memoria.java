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
public abstract class Memoria extends Componente {
    double capacità;
    boolean isVolatile=true;

    public Memoria(double capacità, String modello, String marca,boolean isVolatile) {
        super(modello, marca);
        this.capacità = capacità;
        this.isVolatile=isVolatile;
    }
    

    public double getCapacità() {
        return capacità;
    }
    
    public boolean isVolatile(){
        return isVolatile;
    }

    @Override
    public abstract void stampaSpecifiche();
    
}
