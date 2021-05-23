/**
 * linearsearch
 */
public class linearsearch {

    public static void main(String[] args) {
        int[] arr={12,65,68,59,58,58,584,4};
        int ans=search(arr,100);
        System.out.print(ans);
    }
    public static int search(int[] arr,int i) {
        int ans=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==i){ 
               return j ;
            }
    

            
        }
        return -1;
        
        
        
    }
}