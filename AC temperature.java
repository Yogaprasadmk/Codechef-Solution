import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ACT = new Scanner(System.in);
		int t = ACT.nextInt();
		 while(t-->0){//test cases
		  int A = ACT.nextInt();//degree for Alice
		  int B = ACT.nextInt();//degree for bob
		  int C = ACT.nextInt();//degree for charlie
		  int D = Math.max(A,C);
		  if(D<=B){
		    System.out.println("Yes");
		  }
		  else{
		    System.out.println("No");
		  }
		}

	}
}
