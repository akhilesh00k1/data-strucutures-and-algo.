//package recursion;
import java.util.Scanner;
public class OddEvenUsingBothBeforeCallAdAfter {
    public static void main(String[] Args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        pdiskip(n);
    }
    public static void pdiskip(int n){
        //base case
        if(n==0){
            return;
        }
        //firstprint odd n dec order
        if(n%2==1){
            System.out.println(n);
        }
        //call
        pdiskip(n-1);
        //whiele poping chaeck for even number inc order 
        if(n%2==0){
            System.out.println(n);

        }
    }
    
}