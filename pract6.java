import java.io.*;
import java.lang.*;
import java.util.*;


class pract6
{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
char ch=s.charAt(0);
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}


System.out.println(rev);
}
}