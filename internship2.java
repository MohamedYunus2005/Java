import java.util.Scanner;
public class internship2 {
    public static void main(String[] args) {
        int userid1 = 123;
        int password1 = 786;
        int balance = 500;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter User ID : ");
        int userid2 = scan.nextInt();
        if (userid1 == userid2) {
            System.out.println("Enter Password : ");
        } else {
            System.out.println("Wrong userid");
            System.exit(0);
        }
        int password2 = scan.nextInt();
        if (password1 == password2) {
            System.out.println("Login Successfull");
        } else {
            System.out.println("Wrong password");
            System.exit(0);
        }
        System.out.println("1.Transaction History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Quit");
        System.out.println("Enter Your Chioce : ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Transaction History");
                System.out.println("Your Balance Amount : "+balance);
                break;
            case 2:
                System.out.println("Withdraw");
                System.out.println("Enter amount to withdraw : ");
                int wd = input.nextInt();
                if (wd <= 0) {
                    System.out.println("Enter Valid Amount");
                    break;
                } else {
                    int total = balance - wd;
                    System.out.println("Amount Withdrawn : "+wd);
                    System.out.println("Your Balance Amount : " + total);
                    break;
                }
            case 3:
                System.out.println("Deposite");
                System.out.println("Enter Amount to deposite : ");
                int dp = input.nextInt();
                if (dp <= 0)
                {
                    System.out.println("Enter Valid Amount");
                    break;
                }
                else{
                    int total = balance + dp;
                    System.out.println("Amount Deposited : "+dp);
                    System.out.println("Your Balance Amount : "+ total);
                    break;
                }
            case 4:
                System.out.println("Transfer");
                System.out.println("Enter Account No to Tansfer : ");
                Scanner accno = new Scanner(System.in);
                int transfer = accno.nextInt();
                System.out.println("Enter Amount to Transfer : ");
                int tr = input.nextInt();
                if(tr <= 0)
                {
                    System.out.println("Enter Valid Amount");
                    break;
                }
                else{
                    System.out.println("Rupees : "+tr);
                    int total = balance - tr;
                    System.out.println("Transfered to : "+transfer);
                    System.out.println("Your Balance Amount : "+total);
                    break;
                }
            case 5:
                System.out.println("Quit");
                System.exit(0);
            default:
                System.out.println("Wrong Choice");
                System.exit(0);
            }
        }
    }