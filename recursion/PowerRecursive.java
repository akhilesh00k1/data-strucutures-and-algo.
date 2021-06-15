//package recursion;
import java.util.Scanner;
public class PowerRecursive {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int n=scan.nextInt();
        int ans=pow(x,n);
        System.out.println(ans);

    }
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }
    
}