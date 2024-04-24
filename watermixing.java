import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner WM = new Scanner(System.in);
		int t = WM.nextInt();
		while(t-->0){
		  int A = WM.nextInt();
		  int B = WM.nextInt();
		  int X = WM.nextInt();
		  int Y = WM.nextInt();
		  if(A<=B && (B - A)<=X){
		    System.out.println("Yes");
		  }
		  else if(A>=B && (A - B)<=Y){
		    System.out.println("YES");
		  }
		  else{
		    System.out.println("NO");
		  }
		}
		
		

	}
}
