import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        int a = scan.nextInt();
        if (a >= 35 && a <= 35) {
            System.out.println("Video Game");
        }
        else if (a >= 60 && a <= 60) {
            System.out.println("I Phone");
        }
        else if (a >= 90) {
            System.out.println("Mac Book Pro");
        }
    }
}
