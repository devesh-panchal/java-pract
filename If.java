import java.util.Scanner;
class If
{
public static void main(String args[])
{
int marksobtained,passingmarks;

passingmarks=40;

System.out.print("passing marks is "+passingmarks);


System.out.print("enter the marks scored by you");

Scanner sc =new Scanner(System.in);

marksobtained=sc.nextInt();

if(marksobtained>=passingmarks)
{
System.out.print("you passed the exam");
}
else if(marksobtained<=100)
{
	System.out.print("this is an unexpection error marks");
}

else
{
System.out.print("you are failed");

}
}
}
