package gestioneMatrici_ordinamenti;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
 *questo programma inizializza una matrice a 0 tranne la diagonale in cui memorizza il numero 1.
 * @author mdt
 */
public class gestione_matrici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int dim = 5;
        int i,j;
        Scanner dim_input = new Scanner(System.in);
        dim = dim_input.nextInt();
                
        int[][] arr = new int[dim][dim];

        System.out.println("La matrice e': ");
      
        for(i = 0; i < dim; i++){
            for(j = 0; j < dim; j++){
                if(i == j){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
           
        }
        */
        
        for(int i6 = 0; i6<= 9; i6++){
            for(int i5=0; i5<= 9; i5++){
                for(int i4=0; i4<= 9; i4++){
                    for(int i3=0; i3<= 9; i3++){
                        for(int i2=0; i2<= 9; i2++){
                            for(int i1=0; i1<= 9; i1++){
                                System.out.print(i1 + " ");
                            }
                        }
                    }
                }
                
            }
        }
    }
    
}
/*
scrivi i cicli for per gestire questi conteggi:
000000
000001
000009
000010
000011
0   0  0  0  0  0
i6 i5 i4 i3 i2 i1

int [] contaKM ->  0[9]1[9]2[9]3[9]4[9]5[9]

000000
000001
000002
000003
000004
.
.
.
000009
000010
000011
000012
.
.
.
0123456
0123456
0123456
0123456


compro macchina con 0km
ogni volta che percorre strada i km aumentano
finché non ariva a 999999 numero max
ogni cifra è un visualizzatore che può contare solo da 0 a 9
sono 6 visualizzatori, 5 dispositivi che contano da 0 a 9


000000
000001
000002
000003
000008
000009
000010


abc matrice 6x3
009


hai una matrice 2x10, scrivi il ciclo per inizializzare gli elementi 


[][]
[][]
[][]
[][]
[][]
[][]
[][]
[][]
[][]
[][]


*/