interface Callback
{

void callback(int p);

}

class Client implements Callback
{

public void callback(int p)
{
System.out.print("callbacl called with "+p*p);
}
}

class Test
{
public static void main(String args[])
{

Callback c=new Client();

c.callback(40);
}
}


