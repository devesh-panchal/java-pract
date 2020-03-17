class Throws 
{

static void subrountine() throws IllegalAccessException
{

throw new IllegalAccessException("demo");
}

public static void main(String args[])
{

try
{
subrountine();

}

catch(Exception e)
{

System.out.print("caugth "+e);
}
}
}
