import java.util.Scanner;

public class BaekJoon_2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C;
        int result[] = new int[10];
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();

        int total = A * B * C;

        // result 0 1 2 3 4 5 6 7 8 9
        //        0 0 0 0 0 1 0 0 0 0
        // total = 12345
        while (total != 0){
            result[total % 10]++; //total % 10 = 5; result[5]++;
            //total = 12345;
            total /= 10; // 12345 / 10 = 1234 나머지 5(/ 특성상 버려짐)
            //
        }

        for (int i : result)
            System.out.println(i);
    }
}
