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
    private int dim=5;
    private Prodotto[] prodotti;
    private int numProdotti;
    private String scontrino;
    
    public ListaSpesa() {
        this.dim = dim;
        prodotti = new Prodotto[dim];
        int numProdotti = 0;
    }

    public String creaScontrino(){
        for (int i = 0; i < dim; i++) {
            prodotti[i].stampa();
            scontrino = scontrino.concat(prodotti[i].stampa())+"\n";
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
    
    public void aggiungiProdotto(Prodotto p) {
        if (numProdotti < prodotti.length) {
            prodotti[numProdotti] = p;
            numProdotti++;
        } else {
            System.out.println("La lista della spesa è piena, impossibile aggiungere altri prodotti.");
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
