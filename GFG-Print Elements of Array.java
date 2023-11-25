Given an array Arr of size N, print all its elements.

Example 1:

Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 1 2 3 4 5
Example 2:

Input:
N = 4
Arr[] = {2, 3, 5, 5}
Output: 2 3 5 5
Your Task:
Complete the function printArray() which takes an array arr, single integer n, as input parameters and prints the value of the array space separated.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 105
1 <= Arr[i] <= 105

  //{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            new Solution().printArray(arr, n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    //Just print the space seperated array elements
    void printArray(int arr[], int n) {
        //   code here
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
