import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CC  = new Scanner(System.in);
    int t = CC.nextInt();
    while(t-->0){
      int x = CC.nextInt();
      int y = CC.nextInt();
      System.out.println((x*y)/100);
    }
	}
}
