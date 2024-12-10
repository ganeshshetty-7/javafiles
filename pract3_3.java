import java.lang.*;
import java.util.*;
import java.io.*;


class Student
{
String sub;
int m1,m2,m3,m4,m5;
float final1;
Scanner sc=new Scanner(System.in);
void getdata()
{
System.out.println("Enter student: ");
sub=sc.nextLine();
System.out.println("Enter marks of sub1 out of 100: ");
m1=sc.nextInt();
System.out.println("Enter marks of sub2 out of 100: ");
m2=sc.nextInt();
System.out.println("Enter marks of sub3 out of 100: ");
m3=sc.nextInt();
System.out.println("Enter marks of sub4 out of 100: ");
m4=sc.nextInt();
System.out.println("Enter marks of sub5 out of 100: ");
m5=sc.nextInt();
}

float percentage()
{
float per;

per=((m1+m2+m3+m4+m5));
final1=(per/500)*100;
System.out.println("Total marks  is :"+per);
System.out.println("Percentage is :"+final1);
return final1;

}


}


class pract3_3
{
public static void main(String args[])
{
float avg=0,final_avg=0;
Student[] s=new Student[5];
for(int i=0;i<5;i++)
{
System.out.println("=-----------------------------=");
s[i]=new Student();
s[i].getdata();
s[i].percentage();

avg=(avg+s[i].final1);
final_avg=avg/5;

}

System.out.println("=----------------------------------------=");
System.out.println("Average percent of class is :"+final_avg);  //no need to multipy x 100 since it is in percentage
System.out.println("=----------------------------------------=");
}
}