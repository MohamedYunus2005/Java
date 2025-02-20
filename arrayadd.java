import java.util.Scanner;

public class arrayadd {
    public static void main(String[] args) {
        int[] sum = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 values : ");
        sum[0] = scan.nextInt();
        sum[1] = scan.nextInt();
        sum[2] = scan.nextInt();
        sum[3] = scan.nextInt();
        sum[4] = scan.nextInt();
        System.out.println(sum[0]+sum[1]+sum[2]+sum[3]+sum[4]);
    }
}
