Given an unsorted array arr of size N, rearrange the elements of array such that number at the odd index is greater than the number at the previous even index. The task is to complete the function formatArray() which will return formatted array.

NOTE:
If the returned array formed is according to rules, 1 will be printed else 0 will be printed.

Example 1:

Input:
n = 5
arr[] = {5, 4, 3, 2, 1}

Output:
1
Explanation:
The given array after modification
will be as such: 4 5 2 3 1.

Example 2:

Input:
n = 4
arr[] = {4, 3, 2, 1}

Output:
1
User task:
Since this is a functional problem you don't have to worry about the input, you just have to complete the function formatArray(), which accepts array arr and its size 

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= arr[i] <= 100
  class GfG
{
	public int[] formatArray(int[] a,int n)
        {
        // add code here.
        int org[]=a;
        for(int i=0;i<n-1;i=i+2){
            if(org[i]>org[i+1]){
               // int temp=org[i];
                a[i]=org[i+1];
                a[i+1]=org[i];
            }
        }
        return a;
	}
}
