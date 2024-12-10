import java.lang.*;
import java.util.*;
import java.io.*;


class Restaurant 
{
String item_code;
double rate;
double total_amt;
Scanner sc=new Scanner(System.in);
void getData()
{
System.out.println("Enter your food name :");
item_code=sc.nextLine();
System.out.println("Enter rate of food :");
rate=sc.nextDouble();
}

double order(int q)
{


total_amt=rate*q;
System.out.println("Total price for "+q+" "+item_code+" is : "+total_amt);
return total_amt;
}
}
class pr3_2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double sum=0;
Restaurant[] r=new Restaurant[5];
for(int i=0;i<5;i++)
{
int qty;
System.out.println("-------------------------------X------------------------------");
r[i]=new Restaurant();
r[i].getData();
System.out.println("Enter Quantity: ");
qty=sc.nextInt();

r[i].order(qty);
sum=sum+r[i].total_amt;
}
System.out.println("-------------------------------X------------------------------");

System.out.println("Total amt: "+sum);
System.out.println("-------------------------------X------------------------------");
}

}