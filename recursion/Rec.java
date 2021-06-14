

import java.util.Scanner;

public class Rec {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        pd(n);
    }
    public static void pd(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        pd(n-1);
        
    }
    
}