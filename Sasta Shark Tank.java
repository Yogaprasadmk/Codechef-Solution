import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner SSS = new Scanner(System.in);
		int T = SSS.nextInt();
		while(T-->0){
		  int a = SSS.nextInt();
		  int b= SSS.nextInt();
		  int c = (a/10)*100;
		  int d = (b/20)*100;
		  if(c>d){
		    System.out.println("FIRST");
		  }
		  else if(d>c){
		    System.out.println("SECOND");
		  }
		  else{
		    System.out.println("ANY");
		  }
		}
	}
}
