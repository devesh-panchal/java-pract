class Box
{
private float height,width,depth;

Box(float  h,float w,float d)
{
width=w;
height=h;
depth=d;

}
float volume()
{

return(width*height*depth);
}

}


class BoxWeigth extends Box
{
float  weight;

BoxWeigth(float h,float w,float d, float weight)
{
super(w,h,d);
this.weight=weight=2;
}

float display()
{
	System.out.print(weight);
	
return(0);
}
}

class BoxTest
{
public static void main(String args[])
{


BoxWeigth b1=new BoxWeigth(2,2,2,2);

double vol=b1.volume();
System.out.print("vol is "+vol);
System.out.print("\n");
vol=b1.display();
System.out.print(vol);


}
}