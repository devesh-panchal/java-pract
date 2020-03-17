import java.util.Scanner;
class Area
{

float int circle()
{
float  pi=3.14;
int r;
System.out.print("enter the radius of circle");
System.out.print("\n");
Scanner sc= new Scanner(System.in);
r=sc.nextInt();
float area=pi*r*r;
return(area);

}

float int square()
{
int s;
Scanner sq= new Scanner(System.in);
System.out.print("enter the side of square");
s=sq.nextInt();
float area=s*s;
System.out.print("the area of square is "+area);
System.out.print("\n");
return(0);
}

public static void main(String args[])
{
	
int ch;
System.out.print("enter the choice you want yo enter \n 1.circle \n 2.square\n");
while(true)
{
switch(ch)
{
case 1:circle();
       System.out.print("the area of circle is "+area);
       System.out.print("\n");
       break;
case 2:square();
	   break;
default:System.out.print("invalid input");
        break;
}		
}
}
}
