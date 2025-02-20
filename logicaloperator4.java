import java.util.Scanner;

public class logicaloperator4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a=scan.nextInt();
        int b;
        b=a%2;
        if (b==0) {
            System.out.println("It is Even Number");
        }
        else{
            System.out.println("It is Odd Number");
        }
    }
}
