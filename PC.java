class Q
{

int n;

boolean valueset=false;

synchronized  int get()
{

while(!valueset)

try
{

wait();

}

catch(Exception e)
{
System.out.print("interrupted exception ");

}


System.out.print("got "+n);

valueset=false;

notify();

return n;

}


synchronized void put(int n)
{

while(valueset)

try
{

wait();

}

catch(Exception e)
{

System.out.print("interrupted exception ");

}

this.n=n;

valueset=true;


System.out.print("put "+n);

notify();


}
}

class Producer implements Runnable
{

Q q;


Producer(Q q)
{

this.q=q;

new Thread(this ,"Producer").start();
}

public void run()
{

int i=0;


while(true)
{

q.put(i++);

}
}
}


class Consumer implements Runnable 
{



Q q;


Consumer(Q q)


{

this.q=q;

new Thread(this,"Consumer").start();

}

public void run()
{


while(true);

{


q.get();
}

}
}


class PC
{

public static void main(String args)
{

Q q=new Q();
new Producer(q);
new Consumer(q);

System.out.print("press it ");

}
}

 