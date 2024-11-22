import java.util.*;
import java.lang.*;


class stack
{
int top,max;
int s[]=new int[5];
stack()
{
top=-1;
max=5;
}
void push()
{
Scanner sc=new Scanner(System.in);
int data;
data=sc.nextInt();
if(top==max-1)
{
System.out.println("Overflow");
}
else{
top++;
s[top]=data;
}

}

void pop()
{
if(top==-1)
{
System.out.println("Underflow");
}
else{
int ele;
ele=s[top];
top--;
}
}

void display()
{

for(int i=0;i<=top;i++)
{
System.out.print(s[i]+" ");
}
}
}


class class6
{
public static void main(String args[])
{

stack obj=new stack();
obj.pop();
obj.push();
obj.push();
obj.push();
obj.push();
obj.push();
obj.display();
obj.pop();
obj.pop();
obj.display();
}
}