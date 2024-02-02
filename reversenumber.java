import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner RN = new Scanner(System.in);
		int t = RN.nextInt();
		while(t-->0){
		  int n = RN.nextInt();
		  int rev = 0;
		  while(n>0){
		  int lastdigit = n % 10;
		  rev = (rev * 10) + lastdigit;
		  n = n/10;
		  }
		  System.out.println(rev);
		}
	}
}
