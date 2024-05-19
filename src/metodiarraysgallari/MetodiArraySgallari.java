
package metodiarraysgallari;
import java.util.Scanner;
/**
 *
 * @author studente
 */
public class MetodiArraySgallari {
    
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int palindromo[]={1,2,1}, ripetuti[]={1,2,3,4,1,2};
        System.out.println("è palindromo? "+palindromo(palindromo));
        stampaNonRipetuti(ripetuti);
        System.out.println(" ");
        crivello(19);
    }
    
    static boolean palindromo(int array[]){
        int array_inverso[];
        int c=0;
        boolean palindromo=true;
        array_inverso=new int[array.length];
        for (int i =array.length-1; i >=0; i--) {
            array_inverso[c]=array[i];
            c++;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=array_inverso[i]){
                palindromo=false;
            }  
        }
    return palindromo;
    }
    
    static void stampaNonRipetuti(int[] array){
        boolean nonRipetuto=true;
        for (int i = 0; i < array.length; i++) {
            nonRipetuto=true;
            for (int j = 0; j < array.length; j++) {
                if(array[i]==array[j] && i!=j){
                    nonRipetuto=false;
                }
            }
            if(nonRipetuto==true){
                System.out.print(array[i]+", ");  
            }
        }
    }
    static void crivello(int n){
    int[] array_crivello;
        array_crivello=new int[n];
        int c=1;
        for (int i=0; i<=n-1; i++){
        array_crivello[i]=c;
        c++;
        }
        for (int j = 2; j < n-1; j++) {
            if(array_crivello[j]!=0){
            for (int i=0; i<n+1; i++) {
                if(array_crivello[i]%j==0 && array_crivello[i]!=j){
                   array_crivello[i]=0;
                }   
            }
            }
        }
        for (int i = 0; i <n-1; i++) {
            if (array_crivello[i]!=0) {
                System.out.println("i numeri primi tra "+n+" e 1 sono: "+array_crivello[i]);
            }
        }
    }
}    
