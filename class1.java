import java.util.*;
import java.lang.*;


class Numbers
{

int n1,n2;

void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number :");
n1=sc.nextInt();
System.out.println("Enter 2nd number :");
n2=sc.nextInt();
}

int calculate()
{
int sum=0;
for(int i=n1;i<=n2;i++)
{

sum=sum+i;
}
return sum;
}


}

class class1{
public static void main(String args[])
{

Numbers obj=new Numbers();
obj.get();

System.out.println("Sum of Total Numbers is: "+obj.calculate());

}
}