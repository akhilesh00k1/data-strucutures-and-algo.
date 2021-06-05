/**
 * binarysearch
 */
public class binarysearch {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,31};
        System.out.print(bsearch(arr, 4));
        
    }
    public static int bsearch(int[] arr,int item) {
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if(arr[mid]<item){
                start=mid+1;

            }
           else{
                end=mid-1;
            }
            
        }
        return -1;

        
    }
}

