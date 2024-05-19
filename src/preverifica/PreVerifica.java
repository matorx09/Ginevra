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
public class PreVerifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Componente[] componenti=new Componente[5];
       componenti[0]=new RAM(12,"ciao","ciao",true);
       componenti[1]=new GPU("WIRED","bella","ciao2","ciao2");
       componenti[2]=new CPU(23,3,"ciao2","ciao2");
       componenti[3]=new SolidStateDisk(11,"ciao3","ciao3",true);
       componenti[1]=new GPU("WIRED","brutto","ciao5","ciao5");
       
        for (int i = 0; i < componenti.length; i++) {
            componenti[i].stampaSpecifiche();
        }
    }
    
}
