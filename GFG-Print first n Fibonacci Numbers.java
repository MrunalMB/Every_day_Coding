Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5
Example 2:

Input:
N = 7
Output: 1 1 2 3 5 8 13
Your Task:
Your task is to complete printFibb() which takes single argument N and returns a list of first N Fibonacci numbers.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Note: This space is used to store and return the answer for printing purpose.

  
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long fs = 0 ,st = 1, ns;
        long ans[]= new long[n];
        //ans[0] = fs;
        ans[0] = st;
        for(int i=1 ; i < n; i++){
            //System.out.println(fs);
            ns = fs + st;
            ans[i] = ns;
            fs = st;
            st = ns;
        }
        return ans;
    }
}
