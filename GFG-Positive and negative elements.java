Given an array arr[ ] containing equal number of positive and negative elements, arrange the array such that every positive element is followed by a negative element.
Note- The relative order of positive and negative numbers should be maintained.

Example 1:

Input:
N = 6
arr[] = {-1, 2, -3, 4, -5, 6}
Output:  
2 -1 4 -3 6 -5
Explanation: Positive numbers in order 
are 2, 4 and 6. Negative numbers in order 
are -1, -3 and -5. So the arrangement we 
get is 2, -1, 4, -3, 6 and -5.
Example 2:

Input:
N = 4
arr[] = {-3, 2, -4, 1}
Output:  
2 -3 1 -4 
Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function arranged() that takes array arr[ ] and its size integer N as parameters and returns the required array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 106
1 ≤ arr[i] ≤ 109

class Solution
{
    ArrayList<Long> arranged(long arr[], int n)
    {
         ArrayList <Long> pos = new ArrayList <>();
        ArrayList <Long> neg = new ArrayList <>();

        for(int i = 0; i < n; i++) {

            if(arr[i] < 0)
                neg.add(arr[i]);
            else 
                pos.add(arr[i]);
        }
    
        int j = 0, k = 0;

        ArrayList <Long> res = new ArrayList <>(n);
        for(int i = 0; i < n-1; i+=2) {
            
            res.add(pos.get(j++));
            res.add(neg.get(k++));
        }
        return res;
    }
}
