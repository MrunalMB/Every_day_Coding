A and B are good friend and programmers. They are always in a healthy competition with each other. They decide to judge the best among them by competing. They do so by comparing their three skills as per their values. Please help them doing so as they are busy.

Set for A are like [a1, a2, a3]
Set for B are like [b1, b2, b3]

Compare ith skill of A with ith skill of B
if a[i] > b[i] , A's score increases by 1
if a[i] < b[i] , B's score increases by 1
if a[i] = b[i] , nothing happens

 

Example 1:

Input : 
A = {4, 2, 7}
B = {5, 6, 3}
Output : 
1 2

Example 2:

Input : 
A = {4, 2, 7}
B = {5, 2, 8}
Output : 
0 2
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function scores() which takes the array A[], B[] as inputs and two reference variables ca and cb to store the final answer. Store the score of A in ca and score of B in cb.


Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 

Constraints :
1 ≤ a[i] ≤ 1017
1 ≤ b[i] ≤ 1017

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static long ca=0, cb=0;
    
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = 3;
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            obj.scores(a, b);
            System.out.println(ca + " " + cb);
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {

    public void scores(long a[], long b[]) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here
        long ca1=0,cb1=0;
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                ca1=ca1+1;
            }else if (a[i]<b[i]){
                cb1=cb1+1;
            }
        }
        GFG.ca=ca1;
         GFG.cb=cb1;
    }
}
