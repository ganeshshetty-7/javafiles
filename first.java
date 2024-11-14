import java.util.*;
import java.lang.*;

class first
{

public static void main(String args[])
{
int a,b,ans,c;
System.out.print("Enter first no :");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.print("Enter second no :");
b=sc.nextInt();
while(true)
{
System.out.println("1.For Addition");
System.out.println("2.For Subtraction");
System.out.println("3.For Division");
System.out.println("4.For Multiplication");
System.out.println("5.For Exit");
System.out.println("Enter your Choice :");
c=sc.nextInt();
switch(c)
{
case 1:
 ans=a+b;
 System.out.println("Addition is :"+ans);
 break;
case 2:
 ans=a-b;
 System.out.println("Subtraction is :"+ans);
 break;
case 3:
 if(b==0)
{
 System.out.println("cannot divide"); 
 break;
}
else
{
ans=a/b;
System.out.println("Division is :"+ans);
}
break;
case 4:
 ans=a*b;
 System.out.println("Multiplication is :"+ans);
 break;
case 5:
 System.exit(0);
}
}

}
}

