Given a sorted array consisting 0s and 1s. The task is to find the index of first 1 in the given array.

 

Example 1:

Input : 
arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
Output : 
6
Explanation:
The index of first 1 in the array is 6.


Example 2:
Input : 
arr[] = {0, 0, 0, 0}
Output : 
-1
Explanation:
1's are not present in the array.
 
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function firstIndex() which takes the array A[] and its size N as inputs and returns the index of first 1. If 1 is not present in the array then return -1.


Expected Time Complexity: O(Log (N))
Expected Auxiliary Space: O(1)
  class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}
