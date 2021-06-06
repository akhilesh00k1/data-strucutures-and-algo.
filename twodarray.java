 
import java.util.Scanner;
public class twodarray{
    public static void main(String[] args) {
        int[][]array=takein();
    

        
    }
    
    public static int[][] takein() {
        int[][]arr;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int rows=scan.nextInt();
        
        arr=new int[rows][];
        for(int row=0;row<=rows;row++){
            System.out.println("enter the no of cols in row"+row);
            int cols=scan.nextInt();
            arr[row]=new int[cols];
            for (int col=0;col<=cols;col++){
                System.out.println("enter the valuer for row"+row+"column"+col);
                arr[row][col]=scan.nextInt();

            }
        }
        scan.close();
        return arr;


        
    }

    
} 
