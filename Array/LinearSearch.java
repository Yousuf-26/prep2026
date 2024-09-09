
/**
 * Linear search practice problems.
 *
 * @author (Yousuf Borno)
 * @version (8/26/2024)
 */
public class LinearSearch
{
   public static void main(String args[]){
    
       System.out.println("linear search for name");
       String name = "Sadia Ferdous";
       char ch ='s';
       System.out.println(SearchChar(name,ch));
       
       System.out.println("Find the minimum number in the array");
       int arrayOne[] = {14,15,200,202};
       System.out.println(min(arrayOne));
       System.out.println("2D array search");
       System.out.println("Print 2D array");
       //int[][] 2dArray ={{1,2},{3,4}};
       int[][] arr = { { 1, 2 }, { 3, 4 } };
       twoDarray(arr);
       
    }
    
    public static boolean SearchChar(String name, char target){
    
        if(name.length() ==0){
         return false;
        }
        
        for(int i=0; i< name.length(); i++ ){
        
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    
    public static int min (int arr[]){
    
        int min = arr[0];
        
        for(int i=1; i<arr.length;i++){
            if(min > arr[i]){
               min = arr[i];
            }
         
        }
        
        return min;
    
    }
    
    public static int twoDarray(int arr[][]){
    
        for(int i=0; i< arr.length; i++){
        
            for(int j=0; j< arr[i].length; j++){
              System.out.println(arr[i][j]);
            }
        }
    
        return 0;
    }
    
}
    
    
        
      
