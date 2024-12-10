import java.lang.*;
import java.util.*;
import java.io.*;


class Simp_Int
{
int p,n,r;
Simp_Int(int prin,int no,int r_i)
{
p=prin;
n=no;
r=r_i;
}
void display()
{
System.out.println("Principle is :"+p);
System.out.println("Number of year is :"+n);
System.out.println("Rate of interest is :"+r);
}

}
class Interest extends Simp_Int
{
int s_i;
double final_amt;

Interest(int p1,int n1,int r1)
{
super(p1,r1,n1);
s_i=0;
final_amt=0;
}
void calculate()
{

s_i=(p*n*r)/100;
final_amt=p+s_i;
System.out.println("Simple interest for "+n+" years "+"@"+r+"% is "+s_i);
System.out.println("Final Amount is :"+final_amt);
}
}

class class11
{
public static void main(String args[])
{
Interest i=new Interest(5000,2,5);
i.display();
i.calculate();
}
}