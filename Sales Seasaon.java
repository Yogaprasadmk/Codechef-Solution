import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner SS= new Scanner(System.in);
      int t = SS.nextInt();
      while(t-->0){
        int x = SS.nextInt();
        if(x<=100){
          System.out.println(x);
        }
        else if(x>100 && x<=1000){
          System.out.println(x-25);
        }
        else if(x>1000 && x<=5000){
          System.out.println(x-100);
        }
        else{
          System.out.println(x-500);
        }
      }
	}
}
