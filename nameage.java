import java.util.Scanner;

public class nameage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int Age = scan.nextInt();
        scan.nextLine();
        String Address = scan.nextLine();
        System.out.println("My Name is " + Name);
        System.out.println("My Age is " + Age);
        System.out.println("My Address is "+Address);
    }

}
