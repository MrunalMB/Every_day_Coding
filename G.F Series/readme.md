## G.F Series

Siddhant made a special series and named it as G.F Series. The series follows this trend `Tn = (Tn-2)^2 - (Tn-1)` in which the first and the second term are 0 and 1 respectively. Help Siddhant to find the first N terms of the series.

### Problem Statement
Given an integer N, you are required to find the first N terms of the G.F Series and print them with a space after each integer and a newline character after every test case.

### Intuition
The problem requires generating the first N terms of a series defined by a recurrence relation. We can solve this problem recursively or iteratively. Since the series follows a specific pattern, we can use recursion to generate the terms efficiently.

### Example
Input:<br>
N = 3<br>
Output:<br>
0 1 -1<br>
Explanation:<br>
First-term is given as 0 and the second <br>
term is 1. So the T3 = (T3-2)2 - (T3-1) <br>
= T12 - T2 = 02 - 1 = -1<br>

Input:<br>
N = 6<br>
Output:<br>
0 1 -1 2 -1 5  <br>
Explanation:<br>
T1 : 0<br>
T2 : 1<br>
T3 : -1<br>
T4 = (1)2 - (-1) = 2 <br>
T5 = (-1)2 - (2) = 1 - 2 = -1<br>
T6 = (2)2 - (-1) = 4 + 1 = 5 <br>

### Approach
1. Define a recursive function `findGF` that takes an integer `N` as input and returns the Nth term of the series.
2. In the `findGF` function, handle the base cases where `N` is 1 or 2. For these cases, return `N - 1`, as the first term is 0 and the second term is 1.
3. For `N > 2`, calculate the Nth term using the given recurrence relation `Tn = (Tn-2)^2 - (Tn-1)`.
4. Define a function `gfSeries` that takes an integer `N` as input and prints the first N terms of the series.
5. Iterate from 1 to N and print the result of the `findGF` function for each value of `i`, separated by a space.
6. After printing all the terms, print a newline character to move to the next test case.

### Complexity Analysis
- Time Complexity: O(N) for generating the first N terms of the series.
- Space Complexity: O(1) as we are using constant space for storing variables.

### Java Implementation
```java
class Solution{
    static long findGF(long N){
        if(N==1 || N==2){
            return N-1;
        }
        return (long) (Math.pow(findGF(N-2), 2) - findGF(N-1));
    }
    
    static void gfSeries(int N){
        for(int i = 1; i <= N; i++){
            System.out.print(findGF(i) + " ");
        }
        System.out.println();
    }
}
