Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
Your Task:
You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.

Expected Time Complexity: O(Length of S)
Expected Auxiliary Space: O(1)

  
class Solution {
    int isPalindrome(String S) {
        // code here
         if(S == null || S.length() ==0){
            return 1;
        }
      //1st approach
      /*  int start=0;
        int end = S.length()-1;
        while(start <= end){
            if(S.charAt(start) == S.charAt(end)){
                start++;
                end--;
            }else{
                return 0;
          
            }
        }
        */
       
       //second approach 
        for(int i=0 ; i < S.length() / 2 ;i++ ){
            char s = S.charAt(i);
            char e = S.charAt(S.length()-1 -i);
            if(s != e){
                return 0;
            }
        }
        return 1;
        
    }
};
