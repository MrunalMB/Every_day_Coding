Given an array of size N and you have to tell whether the array is perfect or not. An array is said to be perfect if its reverse array matches the original array. If the array is perfect then return True else return False.

Example 1:

Input : Arr[] = {1, 2, 3, 2, 1}
Output : PERFECT
Explanation:
Here we can see we have [1, 2, 3, 2, 1] 
if we reverse it we can find [1, 2, 3, 2, 1]
which is the same as before.
So, the answer is PERFECT.

Example 2:

Input : Arr[] = {1, 2, 3, 4, 5}
Output : NOT PERFECT

User Task:
The task is to complete the function IsPerfect(), which takes an array (a), size of the array (n), and returns the boolean value true if it is Perfect else false. The driver will print itself "PERFECT" or "NOT PERFECT" accordingly.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 2 * 105
1 ≤ ai ≤ 103
//{ Driver Code Starts
/*package whatever //do not write package name here */


import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    if(obj.IsPerfect(arr, n))
		        System.out.println("PERFECT");
		    else
		        System.out.println("NOT PERFECT");
		}
		
	}
}


// } Driver Code Ends


class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        int []org=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            org[j]=a[i];
            j++;
        }
        return Arrays.equals(org,a);
    }
    
}

or second approach is
  class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        boolean flage=false;
      int start=0;
      int end=a.length-1;
       while(start< end){
            if(a[start] != a[end]){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    
    
}
