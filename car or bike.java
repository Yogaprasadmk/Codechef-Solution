import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CB = new Scanner(System.in);
		int t = CB.nextInt();
		while(t-->0){
		  int x = CB.nextInt();
		  int y = CB.nextInt();
		  if(x<y){
		    System.out.println("BIKe");
		    
		  }
		  else if(x>y){
		    System.out.println("CAR");
		  }
		  else{
		    System.out.println("SAme");
		  }
		}
	}
}
