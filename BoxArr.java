import java.util.Scanner;
class Box
{
static float height,width,depth;


 static float input()
{

System.out.print("enter the input\n");

Scanner i=new Scanner(System.in);
height=i.nextFloat();
width=i.nextFloat();
depth=i.nextFloat();
return(0);

}


static float output()
{

return(height*depth*width);
}

}

class BoxArr
{
public static void main(String args[])
{


Box  b[]= new Box[20];


 

int n;
System.out.print("how many object you want to cfreate\n");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
double vol;


for(int i=0;i<n;i++)
{
b[i].input();
vol=b[i].output();
System.out.print("vol is "+vol);
}




}
}
