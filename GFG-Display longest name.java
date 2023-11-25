Given a list of names, display the longest name.


Example:

Input:
N = 5
names[] = { "Geek", "Geeks", "Geeksfor",
  "GeeksforGeek", "GeeksforGeeks" }

Output:
GeeksforGeeks
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function longest() which takes the array names[] and its size N as inputs and returns the Longest name in the list of names.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 100
1 <= |length of name| <= 1000
  

class GFG {
    String longest(String names[], int n) {
        String ans="";
        for(int i=0;i<n;i++){
            if(names[i].length()>ans.length())
            {
                ans=names[i];
            }
        }
        return ans;
    }
}
