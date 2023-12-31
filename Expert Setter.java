import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      Scanner ES  = new Scanner(System.in);
      int t = ES.nextInt();
      while(t-->0){
        int x = ES.nextInt();
        int y = ES.nextInt();
        if(x>y*2){
          System.out.println("NO");
        }
        else{
          System.out.println("Yes");
        }
      }
	}
}
