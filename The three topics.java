import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner TT = new Scanner(System.in);
		  int a = TT.nextInt();
		  int b = TT.nextInt();
		  int c = TT.nextInt();
		  int x = TT.nextInt();
		  if(((a!=b)&&(a!=c)&&(a!=x))&&((b!=a)&&(b!=c)&&(b!=x))&&((c!=a)&&(c!=b)&&(c!=x))&&((x!=a)&&(x!=b)&&(x!=c))){
		    System.out.println("NO");
		  }
		  else{
		    System.out.println("YES");
		  }
	}
}
