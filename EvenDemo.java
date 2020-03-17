import java.util.*;
import java.util.Scanner;

class Even extends Thread implements Runnable
{

String name;
Thread t;
int start,end;
int i,j,k;
Even(String a,int s,int e)
{
name=a;
start=s;
end=e;
t=new Thread(this,name);
t.start();
}

public void run()
{
try
{
for(i=start;i<=end;i++)
{
if(i%2==0)
System.out.println(t.getName()+" even no is "+i);
Thread.sleep(500);
}
}
catch(Exception a)
{
System.out.print(name+" interrupted");
}
}

}

class EvenDemo
{
public static void main(String args[])
{
int i,j,k;

Scanner sc=new Scanner(System.in);
System.out.print("enter first no\n");
int beg=sc.nextInt();
System.out.print("last no\n");
int end=sc.nextInt();
System.out.print("no of thread\n");
int n=sc.nextInt();
Even e[]=new Even[n];
for(i=0;i<n;i++)
{
String a=sc.nextLine();


e[i]=new Even(a,beg,end);
beg=end;
end=beg+1;
}
try
{
for(i=0;i<n;i++)
{
e[i].t.join();
}
}
catch(Exception o)
{
System.out.print("main thread intterrup");
}
}
}
