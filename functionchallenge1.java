import java.util.Scanner;

public class functionchallenge1 {
    void evenodd(int a) {
        System.out.println("Your Value is : "+a);
        if (a%2==0) {
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Value : ");
        int a = scan.nextInt();
        functionchallenge1 obj1 = new functionchallenge1();
        obj1.evenodd(a);
    }
}
