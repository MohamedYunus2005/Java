import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        do
        {
            System.out.println("Enter the Number < 10: ");
            count = scan.nextInt();
        }while(count<10);        
    }
   
}
