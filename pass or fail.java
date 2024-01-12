import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CQ = new Scanner(System.in);
		int t = CQ.nextInt();
		while(t-->0){
		  int A = CQ.nextInt();
		  int B = CQ.nextInt();
		  int C = CQ.nextInt();
		  int D = CQ.nextInt();
		  if((A + C == 180) && (B + D == 180)){
		    System.out.println("YEs");
		  } 
		  else{
		    System.out.println("NO");
		  }
		}

	}
}
