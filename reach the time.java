import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner S = new Scanner(System.in);
		int t = S.nextInt();
		while(t-->0){
		  int x = S.nextInt();
		  int y = S.nextInt();
		  int k = S.nextInt();
		  int z = Math.abs(x-y);
		  if(z%k==0){
		    System.out.println(z/k);
		  }
		  else{
		    System.out.println(z/k + 1);
		  }
		}

	}
}
