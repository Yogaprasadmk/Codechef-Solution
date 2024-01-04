import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner MB = new Scanner (System.in);
		int t = MB.nextInt();
		while(t-->0){
		  int x = MB.nextInt();
		  int y = MB.nextInt();
		  int z = MB.nextInt();
		  int z1 = y/x;
		  if(z1<z){
		    System.out.println(z - z1);
		  }
		  else{
		    System.out.println(0);
		  }
		}

	}
}
