import java.util.Scanner;

public class gamescore {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Score : ");
        int a=scan.nextInt();
        if (a<50) {
            System.out.println("You need to improve");
        }
        else if(a>=50 && a<=70){
            System.out.println("Good Job!");
        }
        else if(a>70){
            System.out.println("Excellent performance!");
        }
    }
}
