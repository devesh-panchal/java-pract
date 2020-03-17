class Excep extends Exception
{
private int detail;

Excep(int a)
{
detail=a;
}

public String toString()
{

return "MyException [" +detail+"]";

}
}

class ExcepDemo
{

static void compute(int a) throws Excep
{
System.out.print("called compute ("+a+")");
System.out.print("\n");
if(a>10)
throw new Excep(a);
else
{
	
System.out.print("normal exit of  "+a);
}System.out.print("\n");
}

public static void main(String args[])
{
try
{
compute(1);
compute(20);

}
catch(Excep e)
{

System.out.print("caught "+e);
System.out.print("\n");

}
}
}
