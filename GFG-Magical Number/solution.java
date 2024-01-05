class Solution {
    public static int findMagicalNumber(int N, int[] arr) {
        
        int result=-1;
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==mid){
                result = mid; 
               end= mid - 1;
            }else if(arr[mid] > mid){
                 end= mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return result;    
    }
}
        
