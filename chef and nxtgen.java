import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CANG = new Scanner(System.in);
		// test cases
		int t = CANG.nextInt();
		while(t-->0){
		  // unit of power input 
		  int A = CANG.nextInt();
		  // Years for unit
		  int B = CANG.nextInt();
		  // Grams
		  int X = CANG.nextInt();
		  // grams units
		  int Y = CANG.nextInt();
		  // condition
		  if(A*B>X*Y){
		    System.out.println("NO");
		  }
		  else{
		    System.out.println("");
		  }
		}

	}
}
