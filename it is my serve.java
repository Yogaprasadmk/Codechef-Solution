import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner MS  = new Scanner(System.in);
		int t = MS.nextInt();
		while(t-->0){
		  int p = MS.nextInt();
		  int q = MS.nextInt();
		  if((p+q)%4==0 || (p+q)%4==1){
		    System.out.println("Alice");
		  }
		  else{
		    System.out.println("BOB");
		  }
		}

	}
}
