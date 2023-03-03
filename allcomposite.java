import java.util.Scanner;
class allcomposite
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the A:");
int A=sc.nextInt()+1;
System.out.println("enter the B:");
int B=sc.nextInt();
while(A<=B)
{
int count=0;
int j=2;
while(j<A)
{
if(A%j==0)
count++;
j++;
}
if(count>0)
System.out.println(A);
A++;
}
}
}