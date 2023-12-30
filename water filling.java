import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner WF = new Scanner(System.in);
		int t = WF.nextInt();
		while(t-->0){
		  int B1 = WF.nextInt();
		  int B2 = WF.nextInt();
		  int B3 = WF.nextInt();
		  if((B1==0 &&B2==0)||(B1==0&&B3==0)||(B2==0&&B3==0)){
		    System.out.println("Water filling time");
		  }
		  else{
		   System.out.println("Not now"); 
		  }
		}

	}
}
