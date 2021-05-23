/**
 * bubble sort
 */
public class bubblesort {
    public static void main(String[] args) {
        int[] array ={1,22,0,-1,100,1000,22};
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println("");
        sort(array);
        for (int i : array) {
            System.out.print(i+" ");
            
        }
        
    }
    public static void swap(int[] arr,int i ,int j ) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    public static void sort(int[]arr) {
        for (int k = 0; k < arr.length-1; k++) {
            for (int i = 0; i < arr.length-1-k; i++) {
                if(arr[i]>arr[i+1]){
                    swap(arr, i, i+1);
                    
                }
                
            }
        }
        
    }

    
}