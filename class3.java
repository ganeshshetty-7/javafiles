import java.util.*;
import java.lang.*;


class operation
{
int n1,n2;
void getnumber()
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st no:");
n1=sc.nextInt();
System.out.println("Enter 2nd no:");
n2=sc.nextInt();
}

int Add()
{

return n1+n2;
}
int Sub()
{

return n1-n2;
}

int Mul()
{

return n1*n2;
}

int Div()
{
int div;
if(n2==0)
{
return 0;
}
else
{

return n1/n2;
}
}


}


class class3
{
public static void main(String args[])
{
operation obj=new operation();
obj.getnumber();
System.out.println("Addition is :"+obj.Add());
System.out.println("Subtraction is :"+obj.Sub());
System.out.println("Multiplication is :"+obj.Mul());
System.out.println("Division is :"+obj.Div());

}

}