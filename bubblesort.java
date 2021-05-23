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
        for (int pass = 0; pass < arr.length-1; pass++) {
            int flag=0;
            for (int current = 0; current < arr.length-1-pass; current++) {
                if(arr[current]>arr[current+1]){
                    swap(arr, current, current+1);
                    flag=1;
                    
                }
                
            }
            if (flag==0){
                break;
            }
        }
        
    }

    
}