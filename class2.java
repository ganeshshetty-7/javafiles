import java.lang.*;
import java.util.*;


class booking
{

String movie_name;
int r_o_t,n_o_t,amount;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Movie name :");
movie_name=sc.nextLine();
System.out.println("Enter rate of ticket :");
r_o_t=sc.nextInt();
}

void book_ticket(int number_of_tickets)
{
n_o_t=number_of_tickets;
amount=r_o_t*n_o_t;

}
void display()
{
System.out.println("-----------Movie Booking-----------");
System.out.println("Movie Name: "+movie_name);
System.out.println("Numbers of ticket: "+n_o_t);
System.out.println("Amount to be paid: "+amount);
System.out.println("-----------------------------------");

}


}



class class2
{
public static void main(String args[])
{
booking obj=new booking();
obj.getdata();
int n;
Scanner sc1=new Scanner(System.in);
System.out.println("Enter Number of ticket: ");
n=sc1.nextInt();
obj.book_ticket(n);
obj.display();

}
}