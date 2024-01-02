import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner MCR = new Scanner(System.in);
		int t = MCR.nextInt();
		while(t-->0)
		{
		  int n = MCR.nextInt();
		  if(n%4==0)
		  {
		  System.out.println(n / 4);
		  }
		  else
		  {
		    System.out.println((n / 4) + 1);
		  }
		}
	}

	
}
