public class functionaddbypassing {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String args[]) {
        functionaddbypassing obj1 = new functionaddbypassing();
        obj1.sum(10, 20);
    }
}
