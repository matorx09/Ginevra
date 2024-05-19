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
public class RAM extends Memoria {

    public RAM(double capacità, String modello, String marca,boolean isVolatile) {
        super(capacità, modello, marca,isVolatile);
    }

    @Override
    public void stampaSpecifiche() {
        System.out.println("il modello è "+super.getModello()+ " mentre la marca è "+super.getMarca()+", la capacità è "+capacità+
                "infine è volatile: "+isVolatile); 
    }
    
}
