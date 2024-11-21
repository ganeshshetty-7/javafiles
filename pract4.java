import java.util.*;
import java.lang.*;


class pract4
{
public static void main(String args[])
{
int sum1=0;
int n[]=new int[10];
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++)
{
n[i]=sc.nextInt();
}
for(int j=0;j<10;j++)
{
sum1=sum1+n[j];
}
System.out.println("The sum is: "+sum1);
}
}