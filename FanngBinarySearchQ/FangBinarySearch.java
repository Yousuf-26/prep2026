
/**
 * Write a description of class FangBinarySearch here.
 *
 * @author (Yousuf Borna)
 * @version (8/29/2024)
 */
public class FangBinarySearch
{
    public static void main(String args[]){
    int[] arr = {19,23,56,61,72,88,92};
    System.out.println("Ceiling:");
    System.out.println(binarySearchCeiling(arr,89));
    System.out.println("Floor:");
    System.out.println(floorBinarySearch(arr,89));
    boolean compare = 'a'< 'c';
    System.out.println("a < c"+ compare);
    System.out.println("Find the smallest letter greater than the target");
    char[] letters = {'a','a','b','b','c','c','d','d','e','e','f'};
    char[] lettersTwo = {'c','f','j'};
    char targetLetter ='g';
    System.out.println(binarySearchSmallestChar(lettersTwo,targetLetter));
    }
    
    
    public static int binarySearchCeiling(int arr[],int target){
    
        int start = 0;
        int end = arr.length -1;
        
        while( start <= end){
        
            int mid = start +(end- start)/2;
            
            if(target == arr[mid]){
              
              return arr[mid];
            
            }
            else if(target < arr[mid]){
                    end = mid -1;
            }
            
            else {
            
               start= mid +1;
            }
        
        }
        
        
        
        return arr[start];
        
    }
    
    public static int floorBinarySearch(int [] arr, int target){
    
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
        
           int mid = start + (end - start)/2;
           
           if(target == arr[mid]){
            
               return arr[mid];
            }
            else if (target < arr[mid]){
                end = mid -1;
            }else{
                start = mid+1;
            }
        
        }
        
        return arr[end];
    }
    
    //NOTE THAT IF WE COMPARE LETTERS , THEN IT IS COMPARED BASED ON ASCII VALUES
    //a < c , so its true in this case because the ASCII value a is 97 and ASCII value c is 99
    public static char binarySearchSmallestChar(char[] characters, char target){
    
        int start = 0;
        int end = characters.length -1;
        
        while(start <= end){
          int mid = start +(end - start)/2;
          
          if( target < characters[mid]){
             end = mid-1;
            }
            else{
             start = mid+1;
            }
        
        }
        
        return characters[start];
        
        
    }
    
    //QUESTION FIST AND LAST INDEX OF THE TARGET DIGIT
    
    public static void firstAndLastIndexTarget(int[] arr, int target){
    
      int start =0;
      int end = arr.length -1;
      boolean firstOccurence=false;
      int firstIndex = -1;
      int count =0;
      while(start <=end){
            
          int mid = start + (end - start)/2;
          
          if(target == arr[mid]){
              
            }
            else if(target < arr[mid]){
               end = mid -1;
            }
            else{
               start = mid+1;
            }
        }
      
    
       
    }
}
