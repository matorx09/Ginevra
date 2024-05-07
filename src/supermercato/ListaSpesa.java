/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercato;

/**
 *
 * @author Utente
 */
public class ListaSpesa {
    int dim=5;
    Prodotto[] prodotti = new Prodotto[dim];
    private String scontrino;
    
    public String creaScontrino(){
        for (int i = 0; i < dim; i++) {
            prodotti[i].stampa();
            scontrino=scontrino.concat(prodotti[i].stampa())+"\n";
        }
    return scontrino;
    }
    
    public float calcolaTotale(boolean sconto){
    float prezzoTot=0; 
        for(int i=0;i<dim;i++){
            if(sconto==false){
            prezzoTot=prezzoTot+prodotti[i].getPrezzo();
            }
            else{
            prezzoTot=prezzoTot+prodotti[i].applicaSconto();   
            }
        }
    return prezzoTot;   
    }
    
    public void aggiungiProdotto(Prodotto p){
    Prodotto[] prodottiNuovi = new Prodotto [dim+1];
        for (int i = 0; i < prodotti.length; i++) {
            if(i==prodotti.length){
                prodotti[i]=p;
            }
        }
    }
    
    public String letturaNome(String nomeProdotto){
    String risultato=null;
        for (int i = 0; i < prodotti.length; i++) {
            if(nomeProdotto==prodotti[i].getDescrizione()){
            return risultato="il prodotto "+prodotti[i].getDescrizione()+" costa: "+prodotti[i].getPrezzo()+
                    "mentre scontato: "+prodotti[i].applicaSconto();
            }else {
            return risultato= "prodotto non presente";
            }
        }
    return risultato;
    }
}
