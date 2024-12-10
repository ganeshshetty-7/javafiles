import java.util.*;
import java.lang.*;
import java.io.*;



class Shape
{
double s1,s2,vol,h;
Shape()
{
s1=1;
s2=1;
}
void volume(double r1,double r2,double h1)
{
s1=r1;
s2=r2;
h=h1;
vol=3.14*s1*s2*h;
System.out.println("Volume of Cylinder : "+vol);
}
void volume(double r1)
{
s2=r1;
vol=(4/3)*3.14*s2*s2*s2;
System.out.println("Volume of Sphere : "+vol);

}
void volume()
{
vol=s1*s1*s1;
System.out.println("Volume of Cube : "+vol);
}
}

class pr3_1
{
public static void main(String args[])
{
Shape s=new Shape();
s.volume(10,20,2);
s.volume(22);
s.volume();

}

}