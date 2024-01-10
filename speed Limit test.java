import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Slt   = new Scanner(System.in);
		int t  = Slt.nextInt();
		while(t-->0){
		  int A = Slt.nextInt();//kilometer by alice
		  int x = Slt.nextInt();//hours by alice
		  int B = Slt.nextInt();//kilometer by bob
		  int y = Slt.nextInt();//hours by bob
		  int x1 = A*y;
		  int y1 = B*x;
		  if(x1<y1){
		    System.out.println("Bob");
		  }
		  else if (x1>y1){
		    System.out.println("ALice");
		  }
		  else{
		    System.out.println("Equal");
		  }
		}

	}
}
