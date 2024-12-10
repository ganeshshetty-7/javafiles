class Number
{
int n1;
Number(int no1)
{
n1=no1;

}
void check(Number n)
{
if(n.n1>n1)
{
System.out.println("Value of object ref is greater ");
}
else if(n.n1<n1)
{
System.out.println("Value of object ref is smaller ");

}
else
{
System.out.println("Value of object ref is equal ");

}
}
}
class class10
{
public static void main(String args[])
{

Number obj1=new Number(10);
Number obj2=new Number(30);
obj2.check(obj1); //obj1 ka value = n.n1 me jayega
}
}