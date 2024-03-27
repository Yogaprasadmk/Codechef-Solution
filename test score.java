import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner TS = new Scanner(System.in);
		int t = TS.nextInt();
		while(t-->0){
		  int n = TS.nextInt();
		  int x  = TS.nextInt();
		  int y = TS.nextInt();
		  if(y%x==0) System.out.println("Yes");
		  else System.out.println("NO");
		}

	}
}
