import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner P = new Scanner(System.in);
      int t  = P.nextInt();
      while(t-->0){
        int n = P.nextInt();
        int D[] = new int[n];
        for(int i=0;i<D.length;i++){
          D[i] = P.nextInt();
        }
        int count  = 0;
        // int max = D[0];
        for(int i = 0;i<D.length;i= i + 1){
           int max = D[i];
          if(max>=1000){
            count++;
          }
        }
        System.out.println(count);
      }
	}
}
