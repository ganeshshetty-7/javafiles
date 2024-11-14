import java.util.*;
import java.lang.*;

class fourth
{

public static void main(String args[])
{
int i,flag,n;
System.out.println("Enter a number to check ?");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
flag=0;
if(n==1 || n==0)
{
flag++;
}
else
{
for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
flag++;
}
}
if(flag==0)
{
System.out.println("Prime");
}
else
{
System.out.println("Not Prime");
}
}
}
}