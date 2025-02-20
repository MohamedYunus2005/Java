public class laptop {
    String name="";
    String processor="";
    int ram;
    int price; 
    public static void main(String[] args) {
        laptop lap1=new laptop();
        lap1.name="Asus Tuf Gaming A15";
        lap1.processor="Ryzen 7,7000 Series";
        lap1.ram=16;
        lap1.price=69500;
        System.out.println("Laptop Name : "+lap1.name);   
        System.out.println("Laptop Processor : "+lap1.processor);
        System.out.println("Laptop Ram : "+lap1.ram+" GB");
        System.out.println("Laptop Price : "+lap1.price+" Rupees");     
    }
}
