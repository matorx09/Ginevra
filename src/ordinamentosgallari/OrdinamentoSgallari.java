
package ordinamentosgallari;

public class OrdinamentoSgallari {

    public static void main(String[] args) {
        System.out.println("esercizio temperature:");
        double [] array={7, 11, 5, 30, 2, 35};
        temperatura(array);
        System.out.println(" ");
        System.out.println("esercizio voti:");
        double [] voti={5, 4, 9, 7, 6, 2};
        voti(voti);
    }
    
    static void temperatura(double vett[]){
        double max=vett[0], contenitore=0;
        for (int i = 0; i < vett.length; i++) {
            for (int j = 0; j < vett.length-1 ; j++) {
                if (vett[j]>vett[j+1]) {
                    contenitore=vett[j+1];
                    vett[j+1]=vett[j];
                    vett[j]=contenitore;
                }
            }
        }
        stampa(vett);
        System.out.println("La temperatura massima è: "+vett[vett.length-1]);
        
    }
    
    static void voti(double vett[]){
        double contenitore=0;
        for (int i = 0; i < vett.length; i++) {
            for (int j = 0; j < vett.length-1; j++) {
                if (vett[j]>vett[j+1]) {
                    contenitore=vett[j+1];
                    vett[j+1]=vett[j];
                    vett[j]=contenitore;
                }
            }
        }
        stampa(vett);
        int migliori = vett.length;
        System.out.println("I tre componenti maggiori sono: " + vett[migliori-1] + ", " + vett[migliori-2] + ", " + vett[migliori-3]);
    }
    
    public static void stampa(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            System.out.println();
        }
    }
}