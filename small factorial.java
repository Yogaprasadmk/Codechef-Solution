import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner SF = new Scanner(System.in);
		int t = SF.nextInt();
		while(t-->0){
		  int n = SF.nextInt();
		  int fact = 1; 
		  for(int i = 1;i<=n;i++){
		    fact = fact * i;
		  }
		  System.out.println(fact);
		}

	}
}
