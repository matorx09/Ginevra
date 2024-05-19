package frazioni;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utente
 */
public class Frazioni {
    int numeratore,denominatore;
    
public Frazioni(int numeratore,int denominatore){
    this.numeratore=numeratore;
    this.denominatore=denominatore;
}

void definisci(int n,int d){
    numeratore=n;
        if(d!=0) {
            denominatore=d;
        }else{
            System.out.println("il programma non può continuare, denominatore uguale a 0");
        }
}

void definisci(Frazioni f){
    this.numeratore=f.numeratore;
    this.denominatore=f.denominatore;
}

public boolean e_intero(){
    boolean apparente;
    if(this.numeratore==this.denominatore||this.numeratore%this.denominatore==0){
        apparente=true;
        System.out.println("la frazione è apparente");
    }
    else{
        apparente=false;
        System.out.println("la frazione non è apparente");
    }
    return apparente;
}

public void stampa_fraz(){
    if(this.denominatore==1){
        System.out.println(this.numeratore);
    }
    else{
        System.out.println(this.numeratore+"/"+this.denominatore);
    }
    
}
}
