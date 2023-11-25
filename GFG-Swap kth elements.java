Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.

Example 1:

Input:
N = 8, K = 3
Arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
Output: 1 2 6 4 5 3 7 8
Explanation: Kth element from beginning is
3 and from end is 6.
Example 2:

Input:
N = 5, K = 2
Arr[] = {5, 3, 6, 1, 2}
Output: 5 1 6 3 2
Explanation: Kth element from beginning is
3 and from end is 1.
Your Task:
You don't need to read input or print anything. Your task is to complete the function swapKth() which takes the array of integers arr, n and k as parameters and returns void. You have to modify the array itself.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ K ≤ N ≤ 105
1 ≤ Arr[i] ≤ 103
 //{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine=br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k=Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().swapKth(arr, n, k);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    void swapKth(int arr[], int n, int k) {
        // code here
        for(int i=0;i<n;i++){
            if(i+1==k){
                int temp=arr[i];
                arr[i]=arr[n-k];
                arr[n-k]=temp;
            }
        }
    }

}
