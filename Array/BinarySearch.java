
/**
 * Write a description of class BinarySearch here.
 *
 * @author (Yousuf Borna)
 * @version (8/27/2024)
 */
public class BinarySearch
{
    public static void main(String args[]){
     int[] arr = {12,14,16,22,25};
     int target = 22;
     
     int answer = binarySearch(arr,target);
     System.out.println("Binary Search address");
     System.out.println(answer);
    }
    
    public static int binarySearch(int arr[], int target){
    
        int start=0;
        int end = arr.length -1;
        
        while(start <= end){
        
            int mid = start + (end -start)/2;
            
            if(target > arr[mid]){
            
                start = mid+1;
            }
            else if(target < arr[mid]){
            
                end = mid-1;
            
            }else{
                return mid;
            }
            
        }
    
        return -1;
    }
}
