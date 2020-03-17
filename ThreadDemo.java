class NewThread implements Runnable
{


String name;

Thread t;

NewThread(String s)
{

name=s;

t= new Thread(this ,name);
System.out.print("\n");
System.out.print("new thread "+t);
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

System.out.print(name+": "+i);
Thread.sleep(1000);
System.out.print("\n");
}
}

catch(Exception e)
{
System.out.print(name+": interrupted");
}
System.out.print("\n");
System.out.print(name+": exiting ");
System.out.print("\n");
}
}

class ThreadDemo
{

public static void main(String args[])
{
new NewThread("one");
new NewThread("two");
new NewThread("three");

try
{

Thread.sleep(10000);
}

catch(Exception e)
{

System.out.print("main thread interrupted ");

}
System.out.print("main thread exiting ");
}
}