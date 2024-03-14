import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int count = 0;
            for(int j = 0;j<n;j++){
              if(2*a[j]>=b[j] && a[j]<=2*b[j]){
                count++;
              }
            }
            System.out.println(count);
        }
        // Your code goes here
    }
}
