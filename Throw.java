class Throw 
{
static void demo()
{
try
{
	
throw new NullPointerException("demo");
}

catch(Exception e)
{

System.out.print("caught minside demo "+e);

throw e;

}


}


public static void main(String args[])

{
	
	
System.out.print("\n");
try
{
	demo();
}
catch(Exception e)
{
	System.out.print("recaught "+e);
}
}
}


	