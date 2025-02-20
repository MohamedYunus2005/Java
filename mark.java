import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Mark : ");
        int mark = scan.nextInt();
        if (mark >= 35) {
            System.out.println("You Are Passed !!!");

        } else {
            System.out.println("You Are Failed 😭");
        }
    }
}
