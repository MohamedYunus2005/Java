import java.util.Scanner;
public class SSort
{
public static void Sort(int a[])
{
int n=a.length,i,j,p,temp;
for(i=0;i<n-1;i++)
{
p=i;
for(j=i+1;j<n;j++)
{
if(a[p]>a[j])
p=j;
}
temp=a[p];
a[p]=a[i];
a[i]=temp;
}
}
public static void printarray(int a[])
{
for (int i=0;i<a.length;i++)
{
System.out.print (a[i]+"");
}
{
public static void main (String[] args)
{
int n,res,i;
Scanner S=new Scanner(System.in);
System.out.print("Enter no.of.elements in the array : ");
n=S.nextInt();
int a[]=new int[n];
System.out.println("Enter"+n+"Elements");
for (i=0;i<n;i++)
{
a[i]=S.nextInt();
}
System.out.println("Elements in array: ");
printarray (a);
Sort(a);
System.out.println("\nElements after sort : ");
printarray(a);
}
}