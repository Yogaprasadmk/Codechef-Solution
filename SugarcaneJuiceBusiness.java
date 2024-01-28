import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner SJB = new Scanner(System.in);
		int t = SJB.nextInt();
		while(t-->0){
		  int N = SJB.nextInt();
		  int SJ = 50 * N;//sugarcane juice
		  int SC = 10 * N;//sugarcane
		  int SM = 10 * N;//Salt and Mint Leaves
		  int RN = 15 * N;//Rent
		  System.out.println((SJ) - (SC+SM+RN));
		}

	}
}
