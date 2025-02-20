public class function2 {
    static void apple() {
        System.out.println("This is Apple");
    }

    static void orange() {
        System.out.println("This is Orange");
    }

    void grapes() {
        System.out.println("This is Grapes");
    }

    public static void main(String[] args) {
        apple();
        orange();
        function2 obj1 = new function2();
        obj1.grapes();
    }
}
