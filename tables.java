import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Table Value : ");
        int a=scan.nextInt();
        for(int i=0;i<=10;i++)
        {
            if(a==2){
                System.out.println(i*2);
            }
            else if (a==3) {
                System.out.println(i*3);
            }
            else if (a==4) {
                System.out.println(i*4);
            }
            else if (a==5) {
                System.out.println(i*5);
            }
        }
    }
}
