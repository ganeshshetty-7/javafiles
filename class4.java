import java.util.*;
import java.lang.*;


class box
{
int height,width,depth;
box()
{
height=1;
width=5;
depth=1;

}
box(int a,int b,int c)
{
height=a;
width=b;
depth=c;

}
box(box obj1)
{
height=obj1.height;
width=obj1.width;
depth=obj1.depth;
}
double volume()
{
int volume_of_box;
volume_of_box=height*width*depth;
return volume_of_box;

}

}


class class4
{
public static void main(String args[])
{
box obj=new box();
System.out.println("Volume of box using default constructor : "+obj.volume());
box obj2=new box(1,2,3);
System.out.println("Volume of box using parameterized constructor : "+obj2.volume());
box obj3=new box(obj);
System.out.println("Volume of box using copy constructor : "+obj3.volume());

}

}