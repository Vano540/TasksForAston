import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 3 == 0) {
                System.out.println(num[i]);
            }
        }

        scanner.close();
    }
}
