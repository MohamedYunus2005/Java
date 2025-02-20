import java.util.Scanner;

public class internship {
    public static void main(String args[]) {
        int username1 = 123;
        int password1 = 456;
        System.out.println("Enter Your Userid : ");
        Scanner scan = new Scanner(System.in);
        int username = scan.nextInt();
        if (username1 == username) {
            System.out.println("Enter Your Password :");
        } else {
            System.out.println("Wrong Userid");
            System.exit(0);
        }
        int password = scan.nextInt();
        if (password1 == password) {
            System.out.println("Login Successfull");
        } else {
            System.out.println("Wrong password");
            System.exit(0);
        }
        String name = "Mohamed Yunus";
        System.out.println("Welcome " + name);
        System.out.println("Enter Travel Desination (From) : ");
        Scanner input = new Scanner(System.in);
        String from = input.nextLine();
        System.out.println("Your From Address : "+from);
        System.out.println("Enter Travel Destination (To) : ");
        String to = input.nextLine();
        System.out.println("Your To Address : "+to); 
        System.out.println("Chose Train NO : ");
        System.out.println("1.Erode Express\n2.Coimbatore Express");
        int trainno = input.nextInt();
        switch (trainno) {
            case 1:
                System.out.println("Your Train Name is Erode Express");
                System.out.println("Enter your couch : ");
                Scanner details = new Scanner(System.in);
                String couch = details.nextLine();
                System.out.println("Enter Travel Date : ");
                String date = details.nextLine();
                System.out.println("Booking Successfull");
                break;
            case 2:
                System.out.println("Your Train Name is Coimbatore Express");
                System.out.println("Enter your couch : ");
                Scanner details2 = new Scanner(System.in);
                String couch2 = details2.nextLine();
                System.out.println("Enter Travel Date : ");
                String date2 = details2.nextLine();
                System.out.println("Booking Successfull");
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }

    }
}
