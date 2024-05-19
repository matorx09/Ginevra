package squadra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class Squadra {
    String nomeSquadra;
    int partiteVinte,partitePerse,pareggi;

    public Squadra(String nomeSquadra, int partiteVinte, int partitePerse, int pareggi) {
        this.nomeSquadra=nomeSquadra;
        this.partiteVinte=partiteVinte;
        this.partitePerse=partitePerse;
        this.pareggi=pareggi;
    }
    
    public Squadra(){
    }
    
    int punti(){
        int punti=(this.partiteVinte*3)+this.pareggi;
        return punti;
    }
    
    void aggiorna(int pv,int pp,int p){
        partiteVinte=pv;
        partitePerse=pp;
        pareggi=p;
    }
    
    void inizioAnno(){
        partiteVinte=0;
        partitePerse=0;
        pareggi=0;
    }
}

