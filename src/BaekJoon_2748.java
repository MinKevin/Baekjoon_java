import java.util.Scanner;

public class BaekJoon_2748 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[91];
        arr[0] = 0;
        arr[1] = 1;

        if (n >= 2) {
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        System.out.println(arr[n]);
    }
}
