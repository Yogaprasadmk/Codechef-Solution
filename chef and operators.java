import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CO = new Scanner(System.in);
		int t = CO.nextInt();
		while(t-->0){
		  int A = CO.nextInt();
		  int B = CO.nextInt();
		  if(A<B){
		    System.out.println("<");
		  }
		  else if(A>B){
		    System.out.println(">");
		  }
		  else{
		    System.out.println("=");
		  }
		}

	}
}
