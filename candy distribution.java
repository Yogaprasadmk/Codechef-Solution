import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner CD = new Scanner(System.in);
		int t = CD.nextInt();
		while(t-->0){
		  int x = CD.nextInt();
		  int y = CD.nextInt();
		  int z = x/y;
		  if((x%y==0)&&(z%2==0)){
		    System.out.println("yes");
		  }
		  else{
		    System.out.println("No");
		  }
		}

	}
}
