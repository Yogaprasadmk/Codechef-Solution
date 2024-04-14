import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner BJ = new Scanner(System.in);
		int t = BJ.nextInt();
    while(t-->0){
      int A = BJ.nextInt();
      int B = BJ.nextInt();
      int C = 21 - (A + B);
      if(C<11){
        System.out.println(C);
      }
      else{
        System.out.println(-1);
      }
    }
	}
}
