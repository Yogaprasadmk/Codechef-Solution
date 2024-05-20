import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner MM = new Scanner(System.in);
		int t = MM.nextInt();
		while(t-->0){
		 int N = MM.nextInt();
		 int K = MM.nextInt();
		 int a[] = new int[N];
		 for(int i = 0;i<a.length;i++){
		   a[i] = MM.nextInt();
		 }
		 int count = 0;
		 for(int i = 0;i<a.length;i++){
		   a[i] = a[i] + K;
		   if((a[i])%7==0){
		     count++;
		   }
		 }
		 System.out.println(count);
		}
	}
}
