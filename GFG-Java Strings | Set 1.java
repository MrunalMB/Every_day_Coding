Given two strings S1 and S2 as input. Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.

Example 1:

Input: S1 = "Geeks" , S2 = "forGeeks"
Output: "skeeGrofskeeG" 
Explanation: Concatenating S1 and S2 to 
get "GeeksforGeeks" then reversing it to 
"skeeGrofskeeG".
Example 2:

Input: S1 = "Practice" , S2 = "Geeks"
Output: "skeeGecitcarP"
Explanation: Concatenating S1 and S2 to
get "PracticeGeeks" then reversing it to
"skeegecitcarP".

Your Task:  
You dont need to read input or print anything. Complete the function conRevstr() which takes S1 and S2 as input parameter and returns the sting final_s after concatenating and reversing.

Expected Time Complexity: O(|S1| + |S2|)
Expected Auxiliary Space: O(|S1| + |S2|)

  
class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String str= S1 + S2;
        String  builder = "";
       // StringBuilder builder= new StringBuilder();
        for(int i = str.length()-1 ;i>=0 ;i--){
            
            builder= builder + str.charAt(i);
        }
        return (String) builder;
    }
}
