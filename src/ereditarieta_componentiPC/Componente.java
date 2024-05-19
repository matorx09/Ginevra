package ereditarieta_componentiPC;

public abstract class Componente {
    String marca;
    String modello;

    public Componente(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }
    
    public abstract void stampaSpecifiche();
}




