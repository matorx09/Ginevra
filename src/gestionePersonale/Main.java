/*
 Realizzare un progetto chiamato PersonaleCognomeStudente relativo alla gestione del personale di
un’associazione:
- Il Personale è caratterizzato dagli attributi:


* nome
* cognome
* indirizzo
* telefono

e, oltre al costruttore, contiene:
il metodo void stampaDati()

il metodo astratto double paga(), che consentirà di calcolare e restituire la paga dei collaboratori.
Il personale è costituito da volontari o dipendenti.

- la classe Volontario è caratterizzata dagli stessi attributi di Personale e, oltre al costruttore, 
ridefinisce il metodo paga() che restituirà sempre il valore 0.
- la classe DipendenteGiornaliero è caratterizzata dagli stessi attributi di Personale e dagli attributi:


* codFiscale
* retribuzioneGiornaliera → che corrisponde all’importo della retribuzione giornaliera
* giorni → che corrisponde al numero di giorni lavorati (inizialmente pari a 0)

e, oltre al costruttore, contiene:

•  il metodo void giorni(int n) che consente di incrementare il numero di giorni lavorati
* il metodo stampaDati(), che stampa tutte le informazioni
* il metodo double paga() che restituirà la retribuzione giornaliera moltiplicata per i giorni 
e che azzererà il numero di giorni lavorati dal dipendente

- la classe DipendenteImpiegato è caratterizzata dagli stessi attributi di Personale e dall’attributo:


* codFiscale
* retribuzioneMensile → che corrisponde alla retribuzione mensile
* bonus → che corrisponde al valore dei bonus corrisposti al dipendente

e, oltre al costruttore contiene


* il metodo gratifica(double x) che consente di incrementare eventuali bonus corrisposti
al dipendente del valore x
* il metodo stampaDati(), che stampa tutte le informazioni
* il metodo paga() che restituirà la retribuzione mensile più l’importo delle gratifiche 
e che azzererà l’importo delle gratifiche

Nel main costruire istanze che consentano di testare tutte le classi (2 oggetti per ogni classe ) 
e simulare un mese di paga del personale(N.B. utilizzare tutti i metodi creati nei punti precedenti).

Extra: creare nel main un array di Personale chiamato staff con gli oggetti creati in precedenza
e calcolare l'ammontare complessivo delle paghe. mostrare a video il risultato.
 */
package gestionePersonale;

/**
 *
 * @author mdt
 */
public class Main {
    
}
