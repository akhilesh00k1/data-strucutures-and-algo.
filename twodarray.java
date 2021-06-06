 
import java.util.Scanner;
public class twodarray{
    public static void main(String[] args) {
        int[][]array=takein();
        display(array);
    

        
    }
    public static void display(int[][] arr) {
        for (int row=0;row<=arr.length-1;row++){
            for(int col=0;col<=arr[row].length-1;col++){
                System.out.print(arr[row][col]+" ");

            }
            System.out.println("");
        }
        
    }
    
    public static int[][] takein() {
        int[][]arr;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int rows=scan.nextInt();
        
        arr=new int[rows][];
        for(int row=0;row<=rows-1;row++){
            System.out.println("enter the no of cols in row"+row);
            int cols=scan.nextInt();
            arr[row]=new int[cols];
            for (int col=0;col<=cols-1;col++){
                System.out.println("enter the valuer for row"+row+"column"+col);
                arr[row][col]=scan.nextInt();

            }
        }
        scan.close();
        return arr;


        
    }


    
} 
