import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner FS = new Scanner(System.in);
		int t= FS.nextInt();
		while(t-->0){
		  int N = FS.nextInt();
		  int M = FS.nextInt();
		   int extraShoes = N + Math.max(0, N - M);
		    System.out.println(extraShoes);
		}

	}
}
