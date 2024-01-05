# Problem Statement

Your friend needs a "Magical number" from a sorted array of distinct integers. A magical number is defined as an element `arr[i]` such that `arr[i] = i` (0-based indexing). You are tasked to find the leftmost magical number present in the array `arr`. If there's no magical number in the array, return -1.

# Approach and Complexity Analysis

## Approach

The `findMagicalNumber` function uses a binary search approach to find the leftmost magical number in a sorted array of distinct integers.

1. **Initialization**:
   - Initialize `start` as 0 (beginning of the array) and `end` as `arr.length - 1` (end of the array).
   - Initialize `result` as -1, which will hold the leftmost magical number found.

2. **Binary Search**:
   - Using a while loop, perform binary search within the range `[start, end]`.
   - Calculate the `mid` index as the middle value of the range.
   - Check if `arr[mid]` is equal to `mid`:
     - If true, update the `result` to `mid` as this index contains a magical number.
     - Adjust `end = mid - 1` to find the leftmost magical number.
     - If `arr[mid] > mid`, update `end = mid - 1` to search in the left half.
     - If `arr[mid] < mid`, update `start = mid + 1` to search in the right half.

3. **Result**:
   - Return the `result` found (the leftmost magical number) or -1 if no magical number is present in the array.

## Time Complexity

The time complexity of the binary search approach is O(log N), where N represents the number of elements in the input array. This efficiency arises from dividing the search space in half in each iteration.

## Space Complexity

The space complexity is O(1) as the algorithm utilizes a constant amount of extra space regardless of the input size. The space used is minimal, maintaining only a few variables (`start`, `end`, `mid`, `result`) during the search process.

