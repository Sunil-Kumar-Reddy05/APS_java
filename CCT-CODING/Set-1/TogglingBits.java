import java.util.Scanner;

public class TogglingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        String toggled = "";

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0')
                toggled += "1";
            else
                toggled += "0";
        }

        int result = Integer.parseInt(toggled, 2);
        System.out.println(result);
    }
}