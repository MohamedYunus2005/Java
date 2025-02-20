
class A extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}
class B extends Thread {
    public void run(){
        System.out.println("Bye");
    }
}

public class threads {
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        a1.start();
        b1.start();
    }

}
