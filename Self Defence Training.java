import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner SDT = new Scanner(System.in);
		int t = SDT.nextInt();
    while(t-->0){
      int N = SDT.nextInt();
      int A[] = new int[N];
      for(int i = 0;i<A.length;i++){
        A[i] = SDT.nextInt();
      }
       int count = 0;
      for(int j : A ){
        if(j>9 && j<61){
          count++;
        }
        
      }
      System.out.println(count);
    }
	}
}
