//package recursion;
import java.util.Scanner;
public class RecAfterBuilding{
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        pd(n);

    }
    public static void pd(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pd(n-1);
        System.out.println(n);
    }
}