import java.util.Scanner;

public class forloop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Starting value : ");
        int a = scan.nextInt();
        System.out.println("Enter the Ending value : ");
        int b = scan.nextInt();
        for (int i = a; i <= b; i = i + 1) {
            System.out.println(i);
        }
    }
}
