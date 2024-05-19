/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriosgallari;

/**
 *
 * @author studente
 */
public class DNAsequencer {
    String sequenzaDiRiferimento;

public DNAsequencer(String sequenza){
    sequenzaDiRiferimento=sequenza;
}
public int lunghezza(){
    int lunghezza=sequenzaDiRiferimento.length();
    System.out.println("la sequenza "+sequenzaDiRiferimento+" possiede "+lunghezza+" lettere");
    return lunghezza;
}
public boolean esiste(String sottoseq){
    if(sequenzaDiRiferimento.contains(sottoseq)){
        System.out.println("la sequenza "+sottoseq+" è presente");
        return true;
    }
    else{
        System.out.println("la sequenza "+sottoseq+" non è presente");
        return false;
    }
}
public boolean inserisci(String sottoseq,int posizione){
    String sottoseq1,sottoseq2 = null,sottoseqMezza,sottoseqFinale;
    if(posizione<=sequenzaDiRiferimento.length()){
        sottoseq1=sequenzaDiRiferimento.substring(0, posizione);
        sottoseq1=sequenzaDiRiferimento.substring(0, sequenzaDiRiferimento.length());
        sottoseqMezza=sottoseq1.concat(sottoseq);
        sequenzaDiRiferimento=sottoseqMezza.concat(sottoseq2);
        System.out.println("La sequenza modificata è:"+sequenzaDiRiferimento);
        return true;
    }else{
        return false;
    }
}
public boolean valida(){
    for(int i=0;i<sequenzaDiRiferimento.length();i++){
    char carattere=sequenzaDiRiferimento.charAt(i);
    if(!(carattere=='a'||carattere=='c'||carattere=='g'||carattere=='t'||carattere=='A'||
       carattere=='G'||carattere=='T'||carattere=='C')){
    return false;
    }
}
    return true;
}
}


