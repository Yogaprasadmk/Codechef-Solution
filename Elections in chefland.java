import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    Scanner EC = new Scanner(System.in);
    int T = EC.nextInt();
    while(T-->0){
      int n = EC.nextInt();
      int x = EC.nextInt();
      int a[] = new int[n];
       int count = 0;
      for(int i = 0;i<a.length;i++){
        a[i] = EC.nextInt();
        int max = a[i];
        if(max>=x){
          count++;
        }
        // System.out.println(count);
      }
       System.out.println(count);
    }
	}
}
