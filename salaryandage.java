import java.util.Scanner;

public class salaryandage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int a=scan.nextInt();
        System.out.print("Enter Your Salary : ");
        int b=scan.nextInt();
        System.out.println("Your Age is : "+a);
        System.out.println("Your Salary is : "+b);
        if (a>=25 || b>=20000) {
            System.out.println("You are eligible for loan");
            System.out.print("Enter Required loan Amount : ");
            int c=scan.nextInt();
            if (c<=50000) {
                System.out.println("Your Loan has been Done!!! Your Amount is : "+c);                
            }
            else{
                System.out.println("The Required loan Amount is 50000");
            }
           
        }
        else{
            System.out.println("Loan is not Eligible");
        }
    }
}
