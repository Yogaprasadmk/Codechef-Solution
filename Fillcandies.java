/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		while(test-->0){
		  int candies = s.nextInt();//n candies
		  int pockets = s.nextInt();//k pockets
		  int Mostcandies = s.nextInt();//m candies
		  int Minimum = pockets*Mostcandies;
		  if(candies%Minimum==0){
		    System.out.println(candies/Minimum);
		  }
		  else{
		    System.out.println(candies/Minimum + 1);
		  }
		}
	}
}
