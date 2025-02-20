import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Traffic Colour : ");
        int a = scan.nextInt();
        int b=1;
        int c=2;
        int d=3;
        if (a==b) {
            System.out.println("Signal is : Red");
            System.out.println("Stop");
        } else if (a==c) {
            System.out.println("Signal is : Yellow");
            System.out.println("Wait");
        } else if (a==d) {
            System.out.println("Signal is : Green");
            System.out.println("Go");
        }

    }
}
