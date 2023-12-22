Given a English alphabet c, Write a program to check whether a character is a vowel or not.

Example 1:

Input:
c = 'a'
Output:
YES
Explanation:
'a' is a vowel.

Example 2:

Input:
c = 'Z'
Output:
NO
Explanation:
'Z' is not a vowel.
  
  class Solution{
    String isVowel(char c){
        // code here
        /*if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' ){
            return "YES";
        }
        else{
            return "NO";
        }*/
        return "aeiouAEIOU".contains(String.valueOf(c))?"YES":"NO";
    }
}
