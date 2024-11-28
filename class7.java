import java.util.*;
import java.lang.*;

class Bank
{
int c_id;
double bank_bal;
double cal_int,new_bal;
double interest(int cid,double amt)
{
c_id=cid;
bank_bal=amt;

cal_int=(bank_bal*5)/100;
new_bal=bank_bal+cal_int;

return cal_int;

}

void display()
{

System.out.println(c_id+"\t\t"+new_bal+"\t"+cal_int);
}
}

class class7
{

public static void main(String args[])
{
Bank b[]=new Bank[3];
double sum=0;
Scanner sc=new Scanner(System.in);


for(int i=0;i<3;i++)
{
b[i] = new Bank();
double amt;
int id;
System.out.println("Enter customer id :");

id=sc.nextInt();
System.out.println("Enter bank balance :");
amt=sc.nextDouble();
b[i].interest(id,amt);
sum=sum+b[i].cal_int;

}
System.out.println("Customer Id\tAmount\tInterest");
for(int j=0;j<3;j++)
{
b[j].display();
}
System.out.println("The Total Interest to be paid will be : "+sum);
}
}


