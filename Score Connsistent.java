import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner SC  = new Scanner(System.in);
		int t = SC.nextInt();
		while(t-->0){
		  int A = SC.nextInt();
		  int B = SC.nextInt();
		  int C = SC.nextInt();
		  int D = SC.nextInt();
		  if(C>=A && D>=B){
		    System.out.println("POSSIBLE");
		  }
		  else{
		    System.out.println("IMPOSSIBLE");
		  }
		}

	}
}
