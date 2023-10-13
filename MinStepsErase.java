
public class MinStepsErase{
	public static int minSteps(String str) {
	  int c=1;
         char a=str.charAt(0);
         for(int i=1;i<str.length();i++)
         {
                  if(a!=str.charAt(i))
                  {
                      c++;
                      a=str.charAt(i);
                  }
         }
         return c/2+1;
}

// Function to find minimum steps
// to make the String empty
// static void minSteps(String S)
// {
	
// 	// Stores the modified String
// 	String new_str = "";

// 	// Size of String
// 	int N = S.length();

// 	int i = 0;

// 	while (i < N)
// 	{
// 		new_str += S.charAt(i);
		
// 		// Removing subString of same
// 		// character from modified String
// 		int j = i;
// 		while (i < N && S.charAt(i) == S.charAt(j))
// 			++i;
// 	}

// 	// Print the minimum steps required
// 	System.out.print((int)Math.ceil(
// 		(new_str.length() + 1) / 2.0));
// }

// Driver Code
public static void main(String[] args)
{
	
	// Given String S
	String S = "abababa";

	// Function Call
	minSteps(S);
}
}


