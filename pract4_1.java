import java.util.*;
import java.io.*;
import java.lang.*;


class Employee
{
int empid,b_salary;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Employee Id : ");
empid=sc.nextInt();
System.out.print("Enter Employee Basic Salary : ");
b_salary=sc.nextInt();

}

}

class Salary extends Employee
{
int T_A,H_A,tax,gross_salary,final_salary,bonus_amt;;
void find()
{
T_A=(b_salary*10)/100;
H_A=(b_salary*15)/100;
gross_salary=(b_salary+(T_A+H_A));
tax=(gross_salary*8)/100;
final_salary=gross_salary-tax;
System.out.println("--------------------------------Employee Salary-------------------------------");
System.out.println("10% Travel Allowance is : "+T_A);
System.out.println("15% House Rent Allowance is : "+H_A);
System.out.println("Gross Salary before tax : "+gross_salary);
System.out.println("8% Tax on Gross Salary is : "+T_A);
System.out.println("Salary Before Bonus is : "+final_salary);
}

void bonus()
{

bonus_amt=(final_salary*10)/100;

}
void display()
{
int f_salary;
f_salary=final_salary+bonus_amt;
System.out.println("Final Amount received by the employee after 10 % Bonus will be  : "+f_salary);
System.out.println("-------------------------------------x--------------------------------------");
}
}

class pract4_1
{
public static void main(String args[])
{
Salary s=new Salary();
s.getData();
s.find();
s.bonus();
s.display();
}
}