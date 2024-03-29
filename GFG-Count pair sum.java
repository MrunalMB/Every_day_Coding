Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements. Given a value Sum. The problem is to count all pairs from both arrays whose sum is equal to Sum.
Note: The pair has an element from each array.


Example 1:

Input:
M=4, N=4 , Sum = 10
arr1[] = {1, 3, 5, 7}
arr2[] = {2, 3, 5, 8} 
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).  
 

Example 2:

Input:
N=4, M=4, sum=5 
arr1[] = {1, 2, 3, 4}
arr2[] = {5, 6, 7, 8}
Output: 0
 

Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function countPairs() that takes array arr1, array arr2, integer M, integer N and integer x as parameters and return the count of all pairs from both arrays whose sum is equal to x.

 

Expected Time Complexity: O(M+N).
Expected Auxiliary Space: O(1).
  class Solution
{ 
    static int countPairs(int arr1[],int arr2[], int m, int n, int x) 
    { 
        //code here.
        int count=0;
        //the commented code not work for all test cases as its TC is high
        /*if(arr1[0]>=x || arr2[0]>x){
            return 0;
        }else{
            for(int i=0 ; i < m ;i++){
                for(int j=0; j < n ;j++){
                    if(arr1[i] + arr2[j]==x){
                        count++;
                    }
                }
            }
        }*/
        int i=0, j=n-1;
        while(i<m && j>=0){
            if(arr1[i] +arr2[j]==x){
                i++;
                j++;
                count++;
            }else if(arr1[i] + arr2[j] < x){
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
}
