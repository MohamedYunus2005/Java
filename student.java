import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner Name=new Scanner(System.in);
        Scanner Score=new Scanner(System.in);
        Scanner dpt=new Scanner (System.in);
        String a=Name.nextLine();
        float b=Score.nextInt();
        String c=dpt.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        float e;
        e=b/10;
        System.out.println(e+"/10");
    }
    
}
