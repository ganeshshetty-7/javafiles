import java.util.*;
import java.lang.*;

class third
{
public static void main(String args[])
{
int n,r,q=0,s=8;
int arr[]=new int[s];
Scanner sc=new Scanner(System.in);
System.out.println("Enter decimal number :");
n=sc.nextInt();
do
{
r=n%2;
n=n/2;

arr[q]=r;
q++;

}while(n>0);

for(int j=s-1;j>=0;j--)
{

System.out.print(arr[j]+" ");

}

}

}