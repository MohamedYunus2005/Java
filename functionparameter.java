public class functionparameter {
    void getsoap(int money) {
        System.out.println("Your Payment : " + money);
        System.out.println("Soap Purchased");
    }

    void getchocolate(int money) {
        System.out.println("Your Payment : " + money);
        System.out.println("Chocolate Purchased");
    }

    void getbiscuit(int money) {
        System.out.println("Your Payement : " + money);
        System.out.println("Biscuit Purchased");
    }

    public static void main(String[] args) {
        functionparameter obj1 = new functionparameter();
        obj1.getsoap(20);
        functionparameter obj2 = new functionparameter();
        obj2.getchocolate(10);
        functionparameter obj3 = new functionparameter();
        obj3.getbiscuit(5);
    }

}
