public class insertionsort {
    public static void main( String[] args) {
        final int[] arr = { 2, 7, 4, 1, 5, 3, 0 };
        for ( int i : arr) {
            System.out.print(i + " , ");
        }
        insertsort(arr);
        System.out.println("");
        for (int i : arr) {
            System.out.print(i + " , ");
        }

    }

    public static void insertsort(int[]arr) {
        for(int pass=1;pass<arr.length-1;pass++){
            int val=arr[pass];
            int rpass=pass-1;
            while(rpass >=0 && arr[rpass]>val){
                arr[rpass+1]=arr[rpass];
                rpass--;


            }
            

            arr[rpass+1]=val;
            
                
            


        }
        

        
    }
    
    }
