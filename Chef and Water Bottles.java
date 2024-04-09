import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CW = new Scanner(System.in);
		int t = CW.nextInt();
		while(t-->0){
		  int N = CW.nextInt();
		  int X = CW.nextInt();
		  int K = CW.nextInt();
		  int Total = N*X;
		  int Min = Math.min(Total,K);
		  int fill  = Min/X;
		  System.out.println(fill);
		}

	}
}
