Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms) 

Example 1:

Input:
N = 1
Output: 1
Explanation: For n = 1, sum will be 1.
Example 2:

Input:
N = 5
Output: 15
Explanation: For n = 5, sum will be 15.
1 + 2 + 3 + 4 + 5 = 15.
Your Task:
Complete the function seriesSum() which takes single integer n, as input parameters and returns an integer denoting the answer. You don't need to print the answer or take inputs.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105

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

            long ans = new Solution().seriesSum(n);

            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // function to return sum of  1, 2, ... n
    long  seriesSum(int n) {
	    // code here
	    long n1=n;// Casting 'n' from int to long
	    long sum=(n1*(n1+1))/2;
	    
	    return sum;
	}
}
