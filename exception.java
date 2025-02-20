import java. util.Scanner;
public class exception {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
try
{
int a = scan.nextInt();
}
catch(Exception e)
{
    System.out.println(e);
}
System.out.println("Program Ended");
}
}