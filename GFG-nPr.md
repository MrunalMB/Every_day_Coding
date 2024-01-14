# Problem Statement 
Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.

## Example 1:

Input: n = 2, r = 1
Output: 2
Explaination: 2!/(2-1)! = 2!/1! = (2*1)/1 = 2.
## Example 2:

Input: n = 3, r = 3
Output: 6
Explaination: 3!/(3-3)! = 3!/0! = 6/1 = 6.
## Your Task:
You do not need to read input or print anything. Your task is to complete the function nPr() which takes n and r as input parameters and returns nPr .

## Expected Time Complexity: O(n)
## Expected Auxiliary Space: O(1)
 # Problem Statement 
Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.

## Example 1:

Input: n = 2, r = 1
Output: 2
Explaination: 2!/(2-1)! = 2!/1! = (2*1)/1 = 2.
## Example 2:

Input: n = 3, r = 3
Output: 6
Explaination: 3!/(3-3)! = 3!/0! = 6/1 = 6.
## Your Task:
You do not need to read input or print anything. Your task is to complete the function nPr() which takes n and r as input parameters and returns nPr .

## Expected Time Complexity: O(n)
## Expected Auxiliary Space: O(1)
 ```java
class Solution{
    static long nPr(long n, long r){
        // code here
        if( r==1){
            return n;
        }else if(n==r){
            return factorial(n);
        }else{
            long ans= factorial(n) / factorial(n-r);
            return ans;
        }
    }
    
    public static long factorial(long num){
        long fact=1;
        for(int i=1; i<=num ;i++){
            fact = fact *i;
        }
        return fact;
    }
}
        return fact;
    }
}
