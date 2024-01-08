import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Weight = new Scanner(System.in);
		int t = Weight.nextInt();//test cases
		while(t-->0){
		  int w = Weight.nextInt();
		  int x = Weight.nextInt();
		  int y = Weight.nextInt();
		  int z = Weight.nextInt();
if((w == (x + y)) || (w == y) || (w == x) || (w == z) || (w == (x+z))||(w == (y+z))|| (w == (x + y + z)))
		  {
		    System.out.println("Yes");
		  }
		  else{
		    System.out.println("No");
		  }
		  
		}
		

	}
}
