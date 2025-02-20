public class divisible {
    public static void main(String[] args) {
        int divisiblecount=0;
        for(int i=1;i<=100;i++)
        {
            if (i%3==0 && i%5==0) {
                System.out.println(i);
                divisiblecount=divisiblecount+1;
            }
        }
    System.out.println("No of values : "+divisiblecount);
    }
}
