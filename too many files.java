import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    Scanner TM = new Scanner(System.in);
    int t = TM.nextInt();
    while(t-->0){
      int  N = TM.nextInt();
      if(N%10 == 0){
        System.out.println(N/10);
        
      }
      else{
        System.out.println((N + 10)/10);
      }
    }
	}
}
