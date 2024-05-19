package preverifica;


import preverifica.Processore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class CPU extends Processore {

    public CPU(double frequenza, int numeroCore, String modello, String marca) {
        super(frequenza, numeroCore, modello, marca);
    }


    @Override
    public void stampaSpecifiche() {
        System.out.println("il modello è "+super.getModello()+"mentre la marca è "+super.getMarca()+", la frequenza è "+super.getFrequenza()+" mentre numeroCore "
                + super.getNumeroCore());
    }
    
    
}
