import java.util.Scanner;

public class forandifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter limit : ");
        int a = scan.nextInt();
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number = "+i);
            }
        }

    }
}
