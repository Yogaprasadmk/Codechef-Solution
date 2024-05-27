import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner AL  = new Scanner(System.in);
		int t = AL.nextInt();
		while(t-->0){
		  int X = AL.nextInt();
		  int N = AL.nextInt();
		  if(X*100 >= N)
		  System.out.println(0);
		  else{
		    int remain = N - (X * 100);
		    int add = (remain + 99)/ 100;
		    System.out.println(add);
		  }
		}
	}
}
