Given an array of distinct elements which was initially sorted. This array may be rotated at some unknown point. The task is to find the minimum element in the given sorted and rotated array. 

Example 1:

Input:
N = 10
arr[] = {2,3,4,5,6,7,8,9,10,1}
Output: 1
Explanation: The array is rotated 
once anti-clockwise. So minimum 
element is at last index (n-1) 
which is 1.
Example 2:

Input:
N = 5
arr[] = {3,4,5,1,2}
Output: 1
Explanation: The array is rotated 
and the minimum element present is
at index (n-2) which is 1.
Your Task:
The task is to complete the function minNumber() which takes the array arr[] and its starting and ending indices (low and high) as inputs and returns the minimum element in the given sorted and rotated array.

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(LogN).

Constraints:
1 <= N <= 107
1 <= arr[i] <= 107
  class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        if(arr.length==1){
            return arr[0];
        }else if(arr[low]<arr[high]){
            return arr[0];
        }
        else{
            int ans=pick(arr);
           // System.out.println(ans);
            return  arr[ans + 1];
        }
        
    }
    static int pick(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end &&arr[mid]>arr[mid+1]){
                return mid;
            }if( mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
    
}
