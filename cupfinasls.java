import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CF = new Scanner(System.in);
		int t = CF.nextInt();
		while(t-->0){
		  int x = CF.nextInt();
		  int y = CF.nextInt();
		  int d = CF.nextInt();
		  if(d>=(Math.abs(x - y))){
		    System.out.println("YEs");
		  }
		  else{
		    System.out.println("NO");
		  }
		}

	}
}
