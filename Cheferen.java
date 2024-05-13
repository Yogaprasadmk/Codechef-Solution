import java.util.Scanner;
class Codechef{
  public static void main(String[] args){
    Scanner CE = new Scanner(System.in);
    int t = CE.nextInt();
    while(t-->0){
      int N = CE.nextInt();
      int A = CE.nextInt();
      int B = CE.nextInt();
      int evencount  = N / 2;
      int oddcount = N - evencount;
      int total = evencount * A + oddcount * B;
      System.out.println(total);
    }
  }
}
