import java.io.*;
import java.lang.*;
import java.util.*;


class pract5
{
public static void main(String args[])
{
String s;
int vowel=0,consonant=0;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch!=' ')
{
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || s.charAt(i)=='u')
{
vowel++;
}
else
{
consonant++;
}

}
}
System.out.println("Total vowels is : "+vowel);
System.out.println("Total consonant is :"+consonant);

}
}
