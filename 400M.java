import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            // your code goes here
             if (x < y && x < z) {
                System.out.println("ALICE");
            } else if (y < x && y < z) {
                System.out.println("BOB");
            } else {
                System.out.println("CHARLIE");
            }
        }
    }
}
