class animal {
    String name;
    int age;

    void makesound() {
        System.out.println("Animals makes a sound");
    }
}

public class inheritancework1 {
    public static void main(String[] args) {
        animal a1 = new animal();
        a1.name = "Goat";
        a1.age = 3;
        a1.makesound();
    }
}
