import java.util.Scanner;
public class swap
{
public static void main(String args[])
{
int a,b;
System.out.print("enter the value of a and b");

Scanner sc = new Scanner(System.in);

a=sc.nextInt();

b=sc.nextInt();
System.out.print("before swapping");
System.out.print("before swapping a= "+a+"\ty=" +b);

a=a+b;
b=a-b;
a=a-b;


System.out.print("\nafter swapping ");
System.out.print("a= "+a+" b= "+b);
}
}