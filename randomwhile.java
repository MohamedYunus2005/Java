import java.util.Random;

public class randomwhile {
    public static void main(String[] args) {
        Random rand = new Random();
        int newnum = 0;
        while (newnum != 5) {
            newnum = rand.nextInt(10);
            System.out.println(newnum);
        }
    }
}
