import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter a value for a : ");
        int val1=val.nextInt();
        System.out.println("Enter a value for b : ");
        int val2=val.nextInt();
        if (val1>val2) {
            
            System.out.println("A is Greater");
        }
        else{
            System.out.println("B is Greater");
        }
    }
}
