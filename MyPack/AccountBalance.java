package mypack;


class Balance 
{
String name;
float bal;

Balance(String n,float b)
{
name=n;
bal=b;
}

void show ()
{
if(bal<3000)
{
System.out.print("---> "+name+ " : $ insuff bal\n");
}
else
{
System.out.print("---> ");
System.out.print(name+" : $ "+bal);
System.out.print("\n");
}

}
}

class AccountBalance
{
public static void main(String args[])
{int i;

Balance b[]=new Balance[3];
b[0]=new Balance("dev",10000);
b[1]=new Balance("raj",50000);
b[2]=new Balance("hi",2000);


for(i=0;i<b.length;i++)
{
b[i].show();
System.out.print("\n");

}
}
}


