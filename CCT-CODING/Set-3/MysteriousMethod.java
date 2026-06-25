
import java.util.Scanner;

public class MysteriousMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        if (r == 0) {
            System.out.println(0);
            return;
        }

        int sum = 0;
        int temp = n;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        int result = sum * r;

        while (result >= 10) {
            int digitSum = 0;

            while (result > 0) {
                digitSum += result % 10;
                result /= 10;
            }

            result = digitSum;
        }

        System.out.println(result);
    }
}