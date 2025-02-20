public class countodd {
    public static void main(String[] args) {
        int evencount = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number :"+i);
                evencount=evencount+1;
            } 
        }
        System.out.println(evencount);      
    }
}
