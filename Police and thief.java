import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner BW = new Scanner(System.in);
		int t = BW.nextInt();
		while(t-->0){
		  int x = BW.nextInt();
		  int y = BW.nextInt();
		  if(x < (y*2)){
		    System.out.println(0);
		  }
		  else{
		    System.out.println(x/(y*2));
		  }
		}

	}
}
