/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricisgallari;

public class MatriciSgallari {

public static void main(String[] args) {
    int[][] matrice1=new int[5][5];
    int[][] matrice2 = {{0,1,2,3,4,5}, {0,1,2,3,4,5}, {0,1,2,3,4,5}, {0,1,2,3,4,5}, {0,1,2,3,4,5}, {0,1,2,3,4,5}};
    int[][] matrice3 = {{0,1,2,3},{0,1,2,3},{0,1,2,3},{0,1,2,3}};
    int[][] matrice4 = {{0,1,2,3},{0,1,2,3},{0,1,2,3},{0,1,2,3}};
    
System.out.println("metodo 1:");
diagonale(matrice1);
System.out.println("metodo 2:");
System.out.println("Ecco il risultato del palindromo: " + palindromo(matrice2));
System.out.println("metodo 3:");
somma(matrice3,matrice4);

}
public static void diagonale(int [][] a ) {
    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            if(i==j)
                a[i][j]=1;
            else{
                a[i][j]=0;
            }
        }
    }
stampa(a);
}
public static boolean palindromo(int [][] a){
//int[] array=new int[6];
int [] array = {0,0,0,0,0,0};
boolean palindromo=true;
    for(int i=0;i<array.length;i++){ //e' sufficiente confrontare la priam meta dell'array con la sua seconda meta
        for(int j=0; j<array.length; j++){
            array[i]=array[i]+a[i][j];    
        }
    }
    
    for(int i=0; i<=2;i++){
        if (array[i]==array[5-i]){
            System.out.println("confronto "+i+" e' positivo");
            palindromo=true;
        }
        else{
            System.out.println("confronto "+i+" e' negativo, il ciclo termina con break. Ciao!");
            palindromo=false;
            break;
        }
        System.out.print(array[i]);
        System.out.println("");
    }
System.out.println("stampa del metodo palindromo" + palindromo);
return palindromo;
}

public static void somma(int [][] a, int [][] b){
int risultato[][]=new int [a.length][a.length];
    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            risultato[i][j]=a[i][j]+b[i][j];
        }
    }
stampa(risultato);
}
public static void stampa(int[][] a) {
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j] + " ");
        }
            System.out.println();
        }
}
}
