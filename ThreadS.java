class ThreadSec
{

Thread th;

ThreadSec()
{
MythRun mtr=new MythRun();

th=new Thread(mtr,"my thread");

System.out.print(" thread "+th);
System.out.print("\n");
th.start();



}

}


class MythRun implements Runnable
{

MythRun()
{

}


public void run()
{

try
{

for(int i=5;i>0;i--)
{
	
	System.out.print("\n");
System.out.print("child thread  "+i);
System.out.print("\n");
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
class ThreadS
{

public static void main(String args[])
{

new ThreadSec();


try
{

for(int i=5;i>0;i--)
{
System.out.print("\n");
System.out.print("main thread "+i);
System.out.print("\n");
Thread.sleep(2000);
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


