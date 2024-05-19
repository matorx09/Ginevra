package ereditarieta_componentiPC;

public abstract class Memoria extends Componente{
    int capacità;
    boolean volatil;

    public Memoria(int capacità, boolean volatil, String marca, String modello) {
        super(marca, modello);
        this.capacità = capacità;
        this.volatil = volatil;
    }
    
    public int getCapacità() {
        return capacità;
    }

    public boolean isVolatil() {
        return volatil;
    }
    
    @Override
    public void stampaSpecifiche(){
        System.out.println("Memoria. Capacità: "+capacità+"; volatilità: "+volatil);
        System.out.println("Marca: "+super.getMarca()+"; Modello: "+super.getModello());
    }
}

