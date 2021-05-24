public class Selectionsort{
     public static void main(String[] args) {
       
        int[] arr={2,7,4,1,5,3,0};
        for(int i: arr ){
            System.out.print(i+" , ");
        } 
        selectsort(arr);
        
        System.out.println("");
        for(int i: arr ){
            System.out.print(i+" , ");



        }
        
    }
    public static void selectsort(int[]arr) {
       
        
        //passes
        for(int pass =0 ;pass<=arr.length-2;pass++){
            //find minimum
            int minindex=pass;
            for(int current=pass+1;current<=arr.length-1;current++){
                if (arr[current]<arr[minindex]){
                   
                    minindex = current;
                }   
            }
            //replace with  wanted index
            int temp=arr[pass];
            arr[pass]=arr[minindex];
            arr[minindex]=temp;
            

                                                                                    


        }

        
    }
}