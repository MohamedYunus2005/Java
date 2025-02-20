import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Income : ");
        int income = scan.nextInt();
        if (income >= 7000) {
            System.out.println("Scholarship is Eligible");
        }
        else{
            System.out.println("Scholarship is not Eligible");
        }
    }

}
