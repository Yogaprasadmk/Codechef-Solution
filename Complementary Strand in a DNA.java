import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner CS = new Scanner(System.in);
		int t = CS.nextInt();
    while(t-->0){
      int N = CS.nextInt();
      CS.nextLine();
      String S = CS.next();
      StringBuilder comp = new StringBuilder();
      for(char comp1 : S.toCharArray()){
        if(comp1 == 'A'){
          comp.append('T');
        }
        else if(comp1 == 'T'){
          comp.append('A');
        }
        else if(comp1 == 'C'){
          comp.append('G');
        }
        else if(comp1 == 'G'){
          comp.append('C');
        }
        
      }
      System.out.println(comp.toString());
    }
	}
}
