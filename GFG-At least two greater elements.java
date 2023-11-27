Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.


Example 1:

Input : 
a[] = {2, 8, 7, 1, 5}
Output :
1 2 5 
Explanation :
The output three elements have two or
more greater elements.   
Example 2:

Input :
a[] = {7, -2, 3, 4, 9, -1}
Output :
-2 -1 3 4

Your Task:  
You don't need to read input or print anything. Your task is to complete the function findElements() which takes the array A[] and its size N as inputs and return the vector sorted values denoting the elements in array which have at-least two greater elements than themselves.

Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(N)

Constraints:
3 ≤ N ≤ 105
-106 ≤ Ai ≤ 106
class Solution {
    public long[] findElements( long a[], long n)
    {
        long ans[]=new long[(int)n-2];
        for(int i=0;i<n;i++){
            int start=0;
            int lastInd= (int)n-i-1;
            int maxind=0;
            for(int j=0;j<=lastInd;j++){
                if(a[maxind]<a[j]){
                    maxind=j;
                }
            }
           long temp=a[maxind];
           a[maxind]=a[lastInd];
           a[lastInd]=temp;
        }
        for(int i=0;i<n-2;i++){
            ans[i]=a[i];
        }
        return ans ;
}
}
but the above solution has more time complexity, so all cases are not passed, but this code uses the selection sort technique.
  
class Solution {
    public long[] findElements( long a[], long n)
    {
      long ans[]=new long[(int)n-2];
      Arrays.sort(a);
        for(int i=0;i<n-2;i++){
            ans[i]=a[i];

        }
         return ans ;
    }
}
this code accepts for all cases.
