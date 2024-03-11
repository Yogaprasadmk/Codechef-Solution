import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Sc = new Scanner(System.in);
		int t = Sc.nextInt();
		while(t-->0){
		  int n = Sc.nextInt();
		  int a[] = new int[n];
		  int max = 0;
		  for(int i = 0;i<a.length;i++){
		    a[i] = Sc.nextInt();
		  }
		  int maxi = a[0];
		  for(int j = 0;j<n;j++){
		    if(a[j]>maxi){
		      maxi = a[j];
		    }
		  }
		  System.out.println(maxi);
		}
	}
}
