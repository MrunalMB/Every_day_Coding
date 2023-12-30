# Closest Value to Target in Sorted Array

## Problem Statement
Given a sorted array of integers, find the value in the array that is closest to a given target number. If there are multiple values with the same closest difference, return the larger value among them.

### Example
Input : Arr[] = {1, 3, 6, 7} and K = 4, 
Output : 3 <br>
Explanation:
The closest number to 4 in the array [1, 3, 6, 7] is 3.

Input : Arr[] = {1, 2, 3, 5, 6, 8, 9}, K = 4, 
Output : 5<br>
Explanation:
The closest number to 4 in the array [1, 2, 3, 5, 6, 8, 9] is 5.

## Approach

The solution employs a binary search algorithm to find the closest value to the given target in the sorted array. Here are the steps:
1. Initialize variables for indices (`ind1`, `ind2`) and differences (`diff1`, `diff2`) to keep track of the closest values and their differences from the target.
2. Implement a binary search algorithm to find the closest values to the target:
    - Compare the target with the middle element of the array.
    - Update indices and differences based on the comparisons and adjust the search space accordingly.
3. After the binary search, handle scenarios where the differences are equal:
    - Check the values at `ind1` and `ind2`.
    - Return the larger value among them.

## Complexity Analysis
Time Complexity: O(log N) - Due to the binary search algorithm used.<br>
Space Complexity: O(1) - Constant space is used.
