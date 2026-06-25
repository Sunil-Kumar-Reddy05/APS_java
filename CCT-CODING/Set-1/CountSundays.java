import java.util.Scanner;

public class CountSundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.next();
        int n = sc.nextInt();

        String[] week = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};

        int start = 0;
        for (int i = 0; i < 7; i++) {
            if (week[i].equals(day)) {
                start = i;
                break;
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if ((start + i) % 7 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}