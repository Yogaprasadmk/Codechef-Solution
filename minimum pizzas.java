import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner MP = new Scanner(System.in);
		int t = MP.nextInt();
		while(t-->0){
		  int N = MP.nextInt();
		  int X = MP.nextInt();
		  int Y = N * X;
		  if(Y%4==0){
		  System.out.println(Y/4);
		  }
		  else{
		    System.out.println((Y/4) + 1);
		  }
		}
	}
}
