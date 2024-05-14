import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner MNC = new Scanner(System.in);
		int T = MNC.nextInt();
		while(T-->0){
		  int X = MNC.nextInt();
		  if(X%5==0 && X%10==0){
		    System.out.println(Math.min(X/5,X/10));
		  }
		  else if(X%5==0 && X%10==5){
		    System.out.println(Math.min(X/5,X/10) + 1);
		  }
		  else{
		    System.out.println(-1);
		  }
		}
		}
}
