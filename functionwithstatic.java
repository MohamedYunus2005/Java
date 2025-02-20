import java.util.Scanner;

public class functionwithstatic {
    static void greeting() {
        System.out.println("Vanakkam");
        dummy();
    }

    static void dummy() {
        System.out.println("I am Dummy");
    }

    public static void main(String[] args) {
        greeting();
    }
}