abstract class Figure
{
int d1;
int d2;


Figure(int a,int b)
{
d1=a;
d2=b;

}


abstract double area();
}

class Rectangle extends Figure
{

Rectangle(int a,int b)
{
super(a,b);

}

double area()
{
System.out.print("area of rectangle \n");
return d1*d2;
}

}

class Triangle extends Figure
{

Triangle(int a,int b)
{
super(a,b);

}

double area()
{
System.out.print("area of triangle is \n");
return d1*d2/2;
}
}

class AbstractArea
{
public static void main(String args[])
{

Figure f;
Rectangle r=new Rectangle(9,5);

Triangle t=new Triangle(5,5);

f=r;

System.out.print("area is "+f.area());

f=t;

System.out.print("area is "+f.area());

}
}
