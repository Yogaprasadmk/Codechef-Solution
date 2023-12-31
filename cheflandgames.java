import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CC = new Scanner(System.in);
		int t = CC.nextInt();
		while(t-->0){
		  int R1 = CC.nextInt();
		  int R2 = CC.nextInt();
		  int R3 = CC.nextInt();
		  int R4 = CC.nextInt();
		  if(R1==1 ||R2 == 1||R3==1||R4 == 1){
		    System.out.println("OUT");
		  }
		  else{
		    System.out.println("IN");
		  }
		}

	}
}
