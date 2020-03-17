import java.io.File;

class FileDemo
{

static void p(String s)
{
System.out.println(s);
}

public static void main(String args[])
{
File f=new File("/Java/Copyright");
p("file name "+f.getName());
p("path "+f.getPath());
p("abs path "+f.getAbsolutePath());
p("parent "+f.getParent());
p(f.exists()?"exists":"does not exists");
p("lenght"+f.length());
}
}