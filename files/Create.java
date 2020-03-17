import java.io.File;
import java.io.IOException;

public class Create
{
public static void main(String args[])
{
try
{


File f=new File("C:\

first.txt");

if(f.createNewFile())
System.out.print("success");
else
System.out.print("error");
}
catch(Exception e)
{

e.printStackTrace();
}
}
}
  