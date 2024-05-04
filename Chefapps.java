import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CT = new Scanner(System.in);
		int t = CT.nextInt();
		while(t-->0){
		  int S = CT.nextInt();
		  int x = CT.nextInt();
		  int y = CT.nextInt();
		  int z = CT.nextInt();
		  int f = S - (x + y);
		  		
		  if(z<=f){
		    System.out.println(0);
		  }
		  else if(z<=f+ Math.max(x,y)){
		    System.out.println(1);
		  }
		  else{
		    System.out.println(2);
		  }
		}
		  		
	}
}
