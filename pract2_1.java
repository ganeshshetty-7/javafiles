import java.util.*;
import java.lang.*;

class Bank
{
double initial_bal,amount;
Scanner sc=new Scanner(System.in);
void getData()
{
System.out.println("Enter Initial Balance:  ");
initial_bal=sc.nextDouble();

}
double transaction(double amt,String trans)
{
double final_bal=0;
if(trans=="deposit")
{

final_bal=initial_bal+amt;

}
else if(trans=="withdraw")
{
final_bal=initial_bal-amt;

}
else
{
System.out.println("Not a type of trnsaction");
}
return final_bal;
}

}


class pract2_1
{
public static void main(String args[])
{
Bank b=new Bank();
b.getData();
Scanner sc=new Scanner(System.in);
String trans;
System.out.println("Enter trnsa:");
trans=sc.nextLine();
if (trans.equals("withdraw"))
{
System.out.println("withdraw : "+b.transaction(100,"withdraw"));
}
else if (trans.equals("deposit"))
{
System.out.println("deposit : "+b.transaction(10000,"deposit"));
}
else
{
System.out.println("Not a type");
}
}

}