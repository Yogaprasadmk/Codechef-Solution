import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner X = new Scanner(System.in);
		int t = X.nextInt();
		while(t-->0){
		  int x = X.nextInt();
		  int y = X.nextInt();
		  System.out.println(x/y + x%y);
		}

	}
}
