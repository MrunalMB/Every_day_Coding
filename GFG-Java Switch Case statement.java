Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
If the user's choice is 1, calculate the area of the circle having the given radius(R).  
Else if the choice is 2, calculate the area of the rectangle with the given length(L) and breadth(B).

Example 1:

Input: 
choice = 1, 
R = 5
Output: 78.53981633974483
Explaination: The choice is 1. 
So we have to calculate the area of the circle.
Example 2:

Input: 
choice = 2, 
L = 5, B = 10
Output: 50
Explaination: Here we have to calculate the 
area of the rectangle.
Your Task:
You do not need to read input or print anything. Your task is to complete the function switchCase() which takes choice and a list arr[], containing the single value R or the two values L and B, as input parameters. It should return the area of the desired geometrical figure.

Note: Use Math.PI for the value of pi.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)
  class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
          double x=0;
        double y=0;
        switch(choice){
            case 1:
                x= (Math.PI*arr.get(0)*arr.get(0));
                break;
            case 2:
                y=(arr.get(0)*arr.get(1)) ;
                break;
            default:
                System.out.println("Invalide Number");
                break;
        }
        if(choice==1){
            return x;
        }
        else{
            return y;
        }
    }
}
