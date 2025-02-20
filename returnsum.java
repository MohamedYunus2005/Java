public class returnsum {
    int sum(int a, int b) {
        int add = a + b;
        return add;
    }

    public static void main(String[] args) {
        returnsum obj1 = new returnsum();
        int addition = obj1.sum(10, 20);
        System.out.println(addition);
    }
}
