import java.lang.*;
import java.io.*;
import java.util.*;

class Employee
{
int empid;
double rate;
Employee(int eid,double r)
{
empid=eid;
rate=r;
}
}

class Daily_employee extends Employee
{
int hrs;
double amt;
Daily_employee(int eid,double r)
{
super(eid,r); //ye wale constr ka ha eid aur r na ki vo wale
amt=0;
}
void cal(int hr)
{
hrs=hr;
amt=rate*hrs;
System.out.println("Emp_Id\t\tDaily_Wages");
System.out.println(empid+"\t\t"+amt);
}
}
class class12
{
public static void main(String args[])
{
Daily_employee d=new Daily_employee(101,800);
d.cal(8);
}

}