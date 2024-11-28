import java.util.*;
import java.lang.*;

class Product
{

int q_purchase,total_q;
double rate_of_p;
Product()
{
total_q=100;
rate_of_p=2000;

}
Product(int tq,double rp)
{
total_q=tq;
rate_of_p=rp;
}
Product(Product p1)
{
total_q=p1.total_q;
rate_of_p=p1.rate_of_p;
}
void purchase(int qp)
{
q_purchase=qp;
int q_left;
double gross_amt,total_amt;
gross_amt=q_purchase*rate_of_p;
total_amt=(gross_amt-(gross_amt*5)/100);
q_left=total_q-q_purchase;
System.out.println("Total Amount to be paid after 5% discount: "+total_amt);
System.out.println("Quantity left : "+q_left);

}
}


class pract2_2
{
public static void main(String args[])
{
Product p2=new Product();
p2.purchase(20);//using default const
Product p3=new Product(100,2000);//using parameterized const
p3.purchase(20);
Product p4=new Product(p2);
p4.purchase(20);//using copy const
}
}