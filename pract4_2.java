import java.lang.*;
import java.io.*;
import java.util.*;


class Number
{
int n;

void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number : ");
n=sc.nextInt();
}
}
class Prime extends Number
{
void cal_prime()
{
int temp=0;
if(n==0 || n==1)
{
temp++;
}
else
{
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
temp++;
break;
}
}
}//else
if(temp==0)
{
System.out.println("Prime Number");
}
else
{
System.out.println("Not a Prime Number");
}
}//fn

}

class Factorial extends Number
{

void cal_fact()
{
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of "+n+" is :"+fact);
}
}
class pract4_2
{
public static void main(String args[])
{
Factorial f=new Factorial();
Prime p=new Prime();
f.getdata();
f.cal_fact();
p.getdata();
p.cal_prime();
}
}