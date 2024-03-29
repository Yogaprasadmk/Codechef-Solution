import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
  Scanner FC = new Scanner(System.in);
  int test  = FC.nextInt();
  while(test-->0){
    int n = FC.nextInt();
    int x = FC.nextInt();
    System.out.println(Math.min(x,n-x));
    }
	}
}
