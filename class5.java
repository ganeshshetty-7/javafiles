import java.util.*;
import java.lang.*;

class bank
{

int initial_bal;
bank(int i_b)
{
initial_bal=i_b;
}
int withdraw(int amt)
{
initial_bal=initial_bal-amt;
return initial_bal;
}

int deposit(int amt)
{
initial_bal+=amt;
return initial_bal;
}


}


class class5
{
public static void main(String args[])
{

bank obj=new bank(50000);
System.out.println("Initial balance is : "+obj.initial_bal);
while(true)
{
System.out.println("1. Withdraw ");
System.out.println("2. Deposit  ");
System.out.println("3. Exit ");
Scanner sc=new Scanner(System.in);
int choice;
choice=sc.nextInt();
switch(choice)
{
case 1:
 int w_amt;
 System.out.println("Enter amount to withdraw: ");
 w_amt=sc.nextInt();
 System.out.println("After Withdrawing :"+obj.withdraw(w_amt));
 break;
case 2:
 int d_amt;
 System.out.println("Enter amount to deposit: ");
 d_amt=sc.nextInt();
 System.out.println("After Depositing :"+obj.deposit(d_amt));
 break;
case 3:
System.exit(0);


}

}


}

}