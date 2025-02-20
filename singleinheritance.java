class animal {
    void eat() {
        System.out.println("This animal can eat");
    }

    class Dog extends animal {
        void bark() {
            System.out.println("Barking");
        }
    }
}

public class singleinheritance /* animal */ {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }
}
