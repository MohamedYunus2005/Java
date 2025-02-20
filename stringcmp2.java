import java.util.Scanner;

public class stringcmp2 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1=str.nextLine();
        System.out.println("Enter String 2 : ");
        String str2=str.nextLine();
        System.out.println(str1.equals(str2));
    }    
}
