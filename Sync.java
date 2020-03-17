class Callme
{

synchronized void call(String msg)
{

System.out.print("["+msg);

try
{

Thread.sleep(1000);

}
catch(Exception e )
{

System.out.print("interrupted");
}

System.out.println("]");
}

}

class Caller implements Runnable
{

String msg;

Callme target;

Thread t;


public Caller(Callme targ,String s)
{

target=targ;

msg=s;

t=new Thread(this);
t.start();

}

public void run()
{

target.call(msg);

}

}


class Sync
{

public static void main(String args[])
{

Callme target=new Callme();

Caller b1=new Caller(target,"hello");
Caller b2=new Caller(target,"synchronized");
Caller b3=new Caller(target,"world");

try
{

b1.t.join();
b2.t.join();
b3.t.join();

}

catch(Exception e)
{

System.out.print("interrupted");
}

}
}