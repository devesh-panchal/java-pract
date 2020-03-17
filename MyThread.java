class MyThread extends Thread
{

MyThread()
{

super("my thread");

System.out.print("child thread "+this);
System.out.print("\n");
start();
}

public void run()
{


try
{

for(int i=1;i<=5;i++)
{
System.out.print("\n");
System.out.print("child thread "+i);

Thread.sleep(1000);
System.out.print("\n");
}
}


catch(Exception e)
{

System.out.print("thread intterrupted");
}
System.out.print("\n");
System.out.print("existing child thread");
System.out.print("\n");
}

public static void main(String args[])
{
new MyThread();

try
{

for(int i=1;i<=5;i++)
{
	System.out.print("\n");
System.out.print("main thread "+i);
System.out.print("\n");
Thread.sleep(2000);
}
System.out.print("\n");
}

catch(Exception e)
{


System.out.print("thread interruptred ");
}

System.out.print("existing main thread");

}
}
