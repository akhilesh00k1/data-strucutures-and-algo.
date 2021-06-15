//package recursion;
import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        int n=scan.nextInt();
        int ans=Fact(n);
        System.out.println(ans);
    }
    public static int Fact(int n){
        if(n==1){
            return 1;
        }
        return n*Fact(n-1);
    }
    
}