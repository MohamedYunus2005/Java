import java.util.Scanner;
public class testmarks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e=scan.nextInt();
        int total=a+b+c+d+e;
        System.out.println("Total Marks : "+total);
        int avg=total/5;
        System.out.println("Average Marks : "+avg);
        if (avg<35) {
            System.out.println("Need Extra Classes");
        }
        else{
            System.out.println("Aim higher");
        }
    }
}