Given an array arr[] of N integers, calculate the median.

NOTE: Return the floor value of the median.
 

Example 1:

Input: N = 5
arr[] = 90 100 78 89 67
Output: 89
Explanation: After sorting the array 
middle element is the median 

Example 2:

Input: N = 4
arr[] = 56 67 30 79
Output: 61
Explanation: In case of even number of 
elements, average of two middle elements 
is the median.

 

Your Task:
You don't need to read or print anything. Your task is to complete the function find_median() which takes the array as input parameter and return the floor value of the median.
 

Expected Time Complexity: O(n * log(n))
Expected Space Complexity: O(1)
  
class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        int x= v.length;
        Arrays.sort(v);
        if(v.length % 2 !=0){
            return v[(x /2 )]; 
        }else{
           return (v[x/2 -1 ] + v[x/2])/2;
        }
    }
}
