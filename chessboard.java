import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
  Scanner CD  = new Scanner(System.in);
  int t = CD.nextInt();
  while(t-->0){
    int x1 = CD.nextInt();
    int y1 = CD.nextInt();
    int x2 = CD.nextInt();
    int y2 = CD.nextInt();
    int x3 = Math.abs(x1 - x2);
    int y3 = Math.abs(y1 - y2);
    System.out.println(Math.max(x3,y3));
    }
	}
}
