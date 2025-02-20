public class functionwithoutstatic {
    void greeting()
    {
        System.out.println("Vanakkam");
        dummy();
    }
    void dummy()
    {
        System.out.println("I am dummy");
    }
    public static void main(String[] args) {
        functionwithoutstatic obj1=new functionwithoutstatic();
        obj1.greeting();        
    }
}
