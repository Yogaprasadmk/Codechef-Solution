import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner MH = new Scanner(System.in);
        int N = MH.nextInt();
        int A[] = new int[N];
        int evenCount = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = MH.nextInt();
            if (A[i] % 2 == 0) {
                evenCount++;
            }
        }
        if (evenCount > N - evenCount) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }

    }
}
