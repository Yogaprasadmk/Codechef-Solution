import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner NE  = new Scanner(System.in);
		int t = NE.nextInt();
		while(t-->0){
		  int x = NE.nextInt();
		  if(x<51){
		    System.out.println("left");
		  }
		  else{
		    System.out.println("right");
		  }
		}

	}
}
