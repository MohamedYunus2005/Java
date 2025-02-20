import java.util.Scanner;

public class logicaloperator3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scan.nextInt();
        System.out.println("The Remainder is : " + num % 3);
        System.out.println("The Remainder is : " + num % 5);
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("It is Divisile by 3 and 5");
        } else {
            System.out.println("It is not Divisible by 3 and 5");
        }
    }
}
