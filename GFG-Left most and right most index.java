Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element X in the given array.

Note: If the element is not present in the array return {-1,-1} as pair.

 

Example 1:

Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of first occurrence of 5 is 2
and index of last occurrence of 5 is 5.
Example 2:

Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 7, 123, 125}
X = 7
Output:
6 6
  class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        long first = solve(v, x, true);
        long second = solve(v, x, false);
        pair obj = new pair(first, second);
        return obj;
    }
    public long solve(long[] nums, long target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        int mid;

        while(start<=end) {
            mid = start + (end-start)/2;
            if(nums[mid]==target) {
                ans = mid;
                if(findStartIndex) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if(nums[mid]<target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return (long)ans;
    }
}
