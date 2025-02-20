import java.util.Scanner;

public class strquestion {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the Status : ");
        String a=str.nextLine();
        if (a.equals("Dead")) {
           System.out.println("Surya meets Ramya"); 
        }
        else{
            System.out.println("Surya weds Meghana");
        }

    }
    
}
