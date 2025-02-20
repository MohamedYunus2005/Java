
import java.util.Scanner;

public class exception2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a/b;
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}
