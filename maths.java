import java.util.Scanner;
class maths {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for a :");
        int a=scan.nextInt();
        System.out.println("Enter value for b :");
        int b=scan.nextInt();
        System.out.println("Enter value for c :");
        int c=scan.nextInt();
        int d,e;
        d=a*b*c;
        System.out.println(d);
        e=a+b+c;
        System.out.println(e);
        System.out.println(d/e);       
    }
    
}
