import java.util.Scanner;

public class cmpoprator2 {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.println("Enter value for a : ");
        int val1=val.nextInt();
        System.out.println("Enter value for B : ");
        int val2=val.nextInt();
        if (val1==val2) {
            System.out.println("A is equal to B");            
        }
        else{
            System.out.println("A is not equal to B");
        }
        
    }
    
}
