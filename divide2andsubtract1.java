import java.util.Scanner;
class divide2andsubtract1
{
public static void main(String[] args)
{
int n,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
n=sc.nextInt();
while(n>0)
{
if(n%2==0)
{
n=n/2;
}
else
{
n--;
}
s++;
}
System.out.println("numbers of steps:"+s);
}
}