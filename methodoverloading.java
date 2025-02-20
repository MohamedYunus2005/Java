import java.util.Scanner;

public class methodoverloading {

    void display(int a, int b) {
        System.out.println(a + b);
    }

    void display(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        methodoverloading obj1 = new methodoverloading();
        obj1.display(10, 20);
        methodoverloading obj2 = new methodoverloading();
        obj2.display(20, 30, 40);
    }
}
