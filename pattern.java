import java.util.*;
import java.lang.*;

class pattern
{
public static void main(String args[])
{

int row=4;
for(int i=1;i<=row;i++)//for row
{
for(int j=1;j<=row-i;j++)//for space
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)//for column
{
System.out.print("* ");
}
System.out.println();//for going in next line
}

}

}