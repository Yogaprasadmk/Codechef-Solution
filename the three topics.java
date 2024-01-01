import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner MP = new Scanner(System.in);
		int t = MP.nextInt();
		
		while(t-->0){// test cases
		  
		  int p  = MP.nextInt();//a company
		  int q  = MP.nextInt();//b company
		  int r  = MP.nextInt();//c company
		  int s  = MP.nextInt();//d company
		  if((p+q+r<s)||(p+q+s<r)||(p+r+s<q)||(q+r+s<p)){
		    System.out.println("Yes");
		  }
		  else{
		    System.out.println("No");
		  }
		}

	}
}
