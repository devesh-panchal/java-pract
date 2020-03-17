import java.util.Scanner;


interface Stack
{
void push(int a);
void pop();

}

class MyStack implements Stack
{

int st[];

int tos;

MyStack(int n)
{

st=new int[n];
tos=0;

}

public void  push(int s)
{
st[tos]=s;
tos++;

}
public void  pop()
{
int i;
	
try
{
	if(tos==0)
		throw new Exception();
	else
{
	
i=st[tos];
tos--;
}		
	
}
catch(Exception e)
{
	
	System.out.print("underflow   ");
}
}






}
class MyTest
{
public static void main(String args[])
{
int n=10;
MyStack mst=new MyStack(n);

int ch,i;
int item;
do
{




System.out.print("1.push\n 2.pop\n 3.exit\n");
Scanner sc=new Scanner(System.in);
ch=sc.nextInt();


switch(ch)
{
case 1:System.out.print("enter item\n");
       Scanner c=new Scanner(System.in);
       item=c.nextInt();
       mst.push(item);
       System.out.print("stack is ");
       for(i=0;i<mst.tos;i++)
       {
       System.out.print(mst.st[i]+" ");
       }
       System.out.print("  top is ");
       System.out.print(mst.tos);
       System.out.print("\n");
       break;
case 2:mst.pop();
       
       System.out.print("stack is ");
       for(i=0;i<mst.tos;i++)
       {
       System.out.print(mst.st[i]+" ");
       }
	   System.out.print("  top is ");
       System.out.print(mst.tos);
       System.out.print("\n");
       break;
case 3:System.exit(0);
       break;          
default:System.out.print("invalid input");

}
}while(ch!=3);


}
}