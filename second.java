import java.util.*;
import java.lang.*;

class second
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2;
System.out.println("Enter start number :");
n1=sc.nextInt();
System.out.println("Enter end number :");
n2=sc.nextInt();
for(int i=n1;i<n2;i++)
{
 System.out.println("TABLE OF "+i);
for(int j=1;j<=10;j++)
{
 int mul;
 mul=i*j;
System.out.println(i+" x "+j+" = "+mul);
}
System.out.println("");
}


}



}