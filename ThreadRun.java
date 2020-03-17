class NewThread implements Runnable 
{

Thread t;
NewThread()
{

t = new Thread(this ,"demo");

System.out.print("child thread "+t);
System.out.print("\n");
t.start();
}


public void run()
{

try
{

for(int i=5;i>0;i--)
{
	
	System.out.print("\n");
System.out.print("child thread  "+i);

Thread.sleep(800);
System.out.print("\n");
}
}

catch(Exception e)
{

System.out.print("child interrupted ");
}
System.out.print("\n");
System.out.print("existing child thread ");
System.out.print("\n");
}
}

class ThreadRun
{

public static void main(String args[])
{

new NewThread();


try
{

for(int i=5;i>0;i--)
{
System.out.print("\n");
System.out.print("main thread "+i);

Thread.sleep(1000);
System.out.print("\n");
}
}
catch(Exception e)
{
System.out.print("main thread intterrupted ");

}
System.out.print("\n");
System.out.print("existing main thread");

}
}
