import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int x = Sc.nextInt();
		int a[] = new int[n];
		boolean found = false;
		for(int i = 0;i<a.length;i++){
		  a[i] = Sc.nextInt();
		  if(a[i]==x){
		  found = true;
		  break;
		}
	}
	if(found){
	  System.out.println("Yes");
	}
	else{
	  System.out.println("No");
	}
		
	}
}
