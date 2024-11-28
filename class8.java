import java.util.*;
import java.lang.*;


class Shape
{

double d_1,d_2;
double area(double r)
{
d_1=d_2=r;
double a_o_c=1;
a_o_c=3.14*d_1*d_2;
return a_o_c;
}

double area(double l,double b)
{
d_1=l;
d_2=b;
double a_o_r=1;
a_o_r=d_1*d_2;
return a_o_r;

}
}

class class8
{
public static void main(String args[])
{
Shape s=new Shape();
System.out.println("Area of Circle is : "+s.area(10));
System.out.println("Area of Rectangle is : "+s.area(2,5));
}
}