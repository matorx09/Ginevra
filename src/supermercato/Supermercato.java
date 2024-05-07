package supermercato;

//creare una ListaSpesa, inserire al suo interno dei prodotti (numero variabile tra 5 e 10, istanze di tutte le classi create

public class Supermercato {

   	 public static void main(String[] args) {
        ListaSpesa lista_mamma = new ListaSpesa ();
        Prodotto p1 = new Prodotto("1f2e3y4", "carne_bovina", 7);
        lista_mamma.aggiungiProdotto(p1);
        NonAlimentare p2 = new NonAlimentare("legno","587", "libreria", 100);
        lista_mamma.aggiungiProdotto(p2);
        Prodotto p3 = new Prodotto("2345", "carne_equina", 8);					
        lista_mamma.aggiungiProdotto(p3);
	Prodotto p4 = new Prodotto("587", "sarago", 10);
        lista_mamma.aggiungiProdotto(p4);
        
        GregorianCalendar scadenza = new GregorianCalendar(2024,11,12);
        Alimentare p5 = new Alimentare (scadenza, "587", "pesce", 10);
        lista_mamma.aggiungiProdotto(p5);

        lista_mamma.creaScontrino();
        
        
        System.out.println("Il prezzo senza sconti e' " + lista_mamma.calcolaTotale(false));
        p1.applicaSconto();
        p2.applicaSconto();
        p3.applicaSconto();
        p4.applicaSconto();
        p5.applicaSconto();
        
        System.out.println("Il prezzo senza sconti e' " + lista_mamma.calcolaTotale(true));
        
    }
}

