
/**
 * Write a description of class practiceProb here.
 *
 * @author (Yousuf Borno)
 * @version (9/4/2024)
 */
public class practiceProb
{
    public static void main(String args[]){
    
     int[] arr = {3,5,8,15,19};
     int n = 16;
     System.out.println("lowerbound "+lowerbound(arr,n));
     System.out.println("Upperbound "+upperbound(arr,n));
     System.out.println("Search In position "+searchInPosition(arr,n));
    }
    
    public static int lowerbound(int [] arr, int n){
    
        int start = 0;
        int end = arr.length -1;
        
        
        while(start <= end){
        
            int mid = start + (end  - start )/2;
            if(arr[mid] == n){
               return mid;
            }
            else if(n > arr[mid]){
            start = mid+1;
            }else{
                end =mid -1;
            
            }
            
            
        
        }
    
        return start;
    
    }
    
    public static int upperbound(int[] arr, int n){
    
        int start = 0;
        int end = arr.length -1;
        
        while(start  <= end){
        int mid = start + (end -start)/2;
         
         if(n < arr[mid]){
            end = mid-1;
            }
            else{
            start = mid +1;
            }
        }
        return start;
    
    }
    
    public static int searchInPosition(int[] arr, int n){
    
    int start =0;
    int end = arr.length -1;
    
    while(start <=end){
    int mid = start + (end-start)/2;
    
        if(arr[mid] == n){
           return mid;
        }
        else if(n < arr[mid]){
            end = mid-1;
        }else{
        
          start = mid+1;
        }
    
    }
     return start;
    }
    
    
}
