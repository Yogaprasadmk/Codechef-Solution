import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner gp = new Scanner(System.in);
		int t = gp.nextInt();
		while(t-->0){
		  int n = gp.nextInt();
		  if(n%4==0){
		    System.out.println("Good");
		  }
		  else{
		    System.out.println("Not Good");
		  }
		}

	}
}
