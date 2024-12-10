class Rectangle
{
int length,breadth,area;
Rectangle()
{
length=10;
breadth=20;
area=0;
}
Rectangle(int l,int b)
{
length=l;
breadth=b;
}
Rectangle(Rectangle obj)
{
length=obj.length;
breadth=obj.breadth;
area=0;
}
Rectangle find_area(Rectangle r)
{
Rectangle rr=new Rectangle();
rr.area=r.length*r.breadth;
return rr;
}

int find_area() //for normal calculation
{

area=length*breadth;
return area;

}
void display()
{
System.out.println("Area of rect is :"+area);
}
}
class class9
{
public static void main(String args[])
{
Rectangle r1=new Rectangle(100,100);
Rectangle r2=new Rectangle();
Rectangle r=new Rectangle(r1);//copy const
Rectangle r3=r1.find_area(r2);              //r2 ka value hi lega sirfr1 ka nhi r1 aise hi store ke liye aur r3 bhi
r3.display();


// System.out.println(r1.find_area(r2));ye nhi hoga object wala hai isliye print garbage value dega

//either this
//System.out.println(r2.find_area());
//or
r.find_area();
r.display();
}

}