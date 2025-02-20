public class returnvalue {
    int getsoap(int a) {
        int soap_price = 18;
        int rem = a - 18;
        return rem;
    }

    public static void main(String[] args) {
        returnvalue obj1 = new returnvalue();
        int remainder = obj1.getsoap(20);
        System.out.println(remainder);
    }
}
