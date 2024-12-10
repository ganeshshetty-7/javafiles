import java.util.*;
import java.lang.*;

class Bank
{
double initial_bal,amount;
double final_bal;
Scanner sc=new Scanner(System.in);
void getData()
{
System.out.println("Enter Initial Balance:  ");
initial_bal=sc.nextDouble();

}
double withdraw(double amt)
{

if(initial_bal<=0)
{
System.out.println("Out of Balance");
}
else
{
final_bal=initial_bal-amt;

}
return final_bal;
}
double deposit(double amt)
{
final_bal=initial_bal+amt;
return final_bal;
}



void transaction(double amt,int trans_type)
{
double final_bal=0;
if(trans_type==1)
{
System.out.println("DEPOSIT MONEY ......");
System.out.println("Final Bal after depositing : "+deposit(amt));
}
else if(trans_type==2)
{
System.out.println("WITHDRAW MONEY ......");
System.out.println("Final Bal after withdrawing : "+withdraw(amt));
}
else
{
System.out.println("Not a type of transaction");
}

}

}


class pract2_1
{
public static void main(String args[])
{
Bank b=new Bank();
b.getData();
Scanner sc=new Scanner(System.in);
int trans;
double amt;
System.out.println("1.For Deposit");
System.out.println("2.For Withdraw");
System.out.println("Enter transaction type:");
trans=sc.nextInt();
if(trans==1)
{
System.out.println("Enter amount to deposit");
amt=sc.nextDouble();
b.transaction(amt,1);
}
else if(trans==2)
{
System.out.println("Enter amount to withdraw");
amt=sc.nextDouble();
b.transaction(amt,2);
}
else
{
System.out.println("Not a type");
}
}

}

