# Finding the Highest Number in a Peak-Increasing-Decreasing Array

## Problem Statement
Given an array where elements are initially in increasing order and then after reaching a peak element, the elements are in decreasing order, find the highest element in the array.

### Example
Input:
11 <br>
1 2 3 4 5 6 5 4 3 2 1 <br>
Output: 6<br>
Explanation: The highest element is 6.


## Approach

The provided code employs a binary search-based approach to find the highest element in the given array, which follows an increasing-decreasing pattern. Here's the approach breakdown:
1. Initialize `start` as 0 and `end` as the last index of the array.
2. Perform a binary search on the array:
   - Calculate `mid` as the middle index between `start` and `end`.
   - Compare the element at index `mid` with its next element:
       - If the element at `mid` is greater than the next element, update `end` to `mid`.
       - Otherwise, update `start` to `mid + 1`.
3. Continue this process until `start` is less than `end`. At the end of the iteration, `end` holds the index of the highest element.
4. Return the element at index `end` as the highest element in the array.

## Complexity Analysis
Time Complexity: O(log n) - Due to the binary search approach used to find the peak element.<br>
Space Complexity: O(1) - Constant space is used for variables.
