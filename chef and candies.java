import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner cc = new Scanner(System.in);
		int t = cc.nextInt();
		while(t-->0){
		  int n = cc.nextInt();
		  int x = cc.nextInt();
		  int needed = Math.max(n - x,0);
		  int buy = (needed + 3)/4;
		  System.out.println(buy);
		}

	}
}
