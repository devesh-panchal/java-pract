import java.util.Scanner;
class Area
{

void square()
{
float a;
Scanner s =new Scanner(System.in);
a=s.nextInt();

System.out.print("the area of square is "+(a*a));
System.out.print("\n");

}

void circle()
{
int b;
Scanner c =new Scanner(System.in);
b=c.nextInt();
double  pi=3.14;
System.out.print("the area of circle is "+(pi*b*b));
}

void triangle()
{
		float h,b;
		Scanner r=new Scanner(System.in);
		h=r.nextFloat();
		b=r.nextFloat();
		float t=0.5f;
		System.out.print("the area of triangle is "+(t*b*h));
}
		
}

class AreaMain
{
public static void main(String args[])
{
Area a1=new Area();

int ch;
System.out.print("enter choice \n1.square\n2.circle \n3.triangle");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();


switch(ch)
{
	case 1:a1.square();
	       break;
	case 2:a1.circle();
	       break;
	case 3:a1.triangle();
	       break;
	default:System.out.print("invalid input");
	        break;
}
}
}
