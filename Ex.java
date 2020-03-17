class Ex
{
public static void main(String args[])
{


try
{
int a=args.length;
System.out.print("a= "+a);
System.out.print("\n");
int b= 42/a;

int c[]={1};

c[42]=99;

}

catch(ArithmeticException ae)
{

System.out.print("'division by zero' "+ae);
}
System.out.print("\n");
catch(ArrayIndexOutOfBoundsException a)
{

System.out.print("'array index' "+a);
}
System.out.print("\n");

System.out.print("after catch statment");
}
}
