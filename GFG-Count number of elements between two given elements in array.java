Given an unsorted array and two elements num1 and num2. The task is to count the number of elements occurs between the given elements (excluding num1 and num2). If there are multiple occurrences of num1 and num2, we need to consider leftmost occurrence of num1 and rightmost occurrence of num2.

 

Example 1:

Input : Arr[] = {4, 2, 1, 10, 6}
num1 = 4 and num2 = 6
Output : 3
Explanation:
We have an array [4, 2, 1, 10, 6] and 
num1 = 4 and num2 = 6. 
So, the left most index of num1 is 0 and 
rightmost index of num2 is 4. 
So, the total number of element between 
them is [2, 1, 10] So, function will return 
3 as an answer.

Example 2:

Input : Arr[] = {3, 2, 1, 4}
num1 = 2 and num2 = 4
Output : 1

Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function getCount() that takes an array (arr), sizeOfArray (n), integer num1, integer num2, and return the number of elements between these numbers. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
2 ≤ N ≤ 105
1 ≤ A[i], num1, num2 ≤ 105
