import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner RI  = new Scanner(System.in); 
    int N = RI.nextInt();
    if(N%4==0){
      System.out.println(N + 1);
    }
    else{
      System.out.println(N - 1);
    }
	}
}
