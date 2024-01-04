import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner MT  = new Scanner(System.in);
		int t = MT.nextInt();
		while(t-->0){
		  int x = MT.nextInt();
		  if(x%3 == 0){
		    System.out.println("NORMAL");
		  }
		  else if(x%3 == 1){
		    System.out.println("HUGE");
		  }
		  else{
		    System.out.println("SMALL");
		  }
		}

	}
}
