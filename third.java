import java.util.*;
import java.lang.*;

class third
{
public static void main(String args[])
{
int n,r,q;
String add="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter decimal number :");
n=sc.nextInt();
do
{

n=n/2;
r=n%2;
add=add+r;

}while(n>0);

System.out.println(add);



}

}