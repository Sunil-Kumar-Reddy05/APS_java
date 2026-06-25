// File Name: TableConference.java

import java.util.Scanner;

public class TableConference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long fact = 1;

        for (int i = 2; i <= n - 1; i++) {
            fact *= i;
        }

        System.out.println(2 * fact);
    }
}