Given an array A[] of N elements. The task is to count number of even and odd elements in the array.

Example:

Input:
N = 5
A[] = 1 2 3 4 5
Output:
3 2
Explanation:
There are 3 odd elements (1, 3, 5)
and 2 even elements (2 and 4).
Your Task:
Your task is to complete the function countOddEven() which should print number of odd and number of even elements in a single line seperated by space.
Print a newline at the end of output.

Constraints:
1 <= N <= 106
1 <= Ai <= 106
class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        // Code here
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                c1++;
            }else{
                c2++;
            }
        }
        System.out.println(c2+" "+c1);
    }
}
