import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner JA= new Scanner(System.in);
		int t = JA.nextInt();
		while(t-->0){
		  int x = JA.nextInt();
		  if((x + 3)<=10)
		  System.out.println("Yes");
		  else
		  System.out.println("No");
		}
	}
}
