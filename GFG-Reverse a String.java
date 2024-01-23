Given a String S , print the reverse of the string as output.

Example 1:

Input: S = "GeeksforGeeks"
Output: "skeeGrofskeeG" 
Explanation: Element at first is at last and
last is at first, second is at second last and 
second last is at second position and so on .
Example 2:

Input: S = "ReversE"
Output: "EsreveR"
Explanation: "E" at first and "R" at last and
"e" at second last and "s" at second and
so on .

Your Task:  
You dont need to read input or print anything. Complete the function revStr() which takes S as input parameter and returns the reversed string .

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

class Solution {
    static String revStr(String S) {
        // Convert the string to a StringBuilder
        StringBuilder sb = new StringBuilder(S);

        // Iterate over the first half of the string and swap characters
        for (int i = 0; i < sb.length() / 2; i++) {
            swap(sb, i, (sb.length() - 1 - i));
        }

        // Convert the StringBuilder back to a String and return
        return sb.toString();
    }

    public static void swap(StringBuilder sb, int ch1, int ch2) {
        char temp = sb.charAt(ch1);
        sb.setCharAt(ch1, sb.charAt(ch2));
        sb.setCharAt(ch2, temp);
    }
}
