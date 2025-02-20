import java.util.Scanner;

public class forandarray {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 Values : ");
        for(int i=0;i<=4;i++)
        {
            arr1[i]=scan.nextInt();
        }
        System.out.println("The Values are : ");
        for(int i=0;i<=4;i++)
        {
            System.out.println(arr1[i]);
        }
        /*System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);*/
    }
}
