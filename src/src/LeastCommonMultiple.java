import java.util.Scanner;

class LCM {
    static int lcm(int a, int b) {
        int x = a;
        int y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        return Math.abs(a * b) / x;
    }
}

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("LCM = " + LCM.lcm(num1, num2));
    }
}