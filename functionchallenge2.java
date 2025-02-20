import java.util.Scanner;

public class functionchallenge2 {
    String passfail(int score) {
        if (score >= 35) {
            return "Pass";
        } else {
            return "fail";
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Mark : ");
        int mark = scan.nextInt();
        functionchallenge2 obj1 = new functionchallenge2();
        String result = obj1.passfail(mark);
        System.out.println(result);
    }
}
