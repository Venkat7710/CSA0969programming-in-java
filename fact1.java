import java.util.Scanner;
class fact1
{
public static void main(String[] args)
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
int factorial=fact(num);
System.out.println("factorial is:"+factorial);
}
catch(Exception e)
{
System.out.println("enter the number only:");
}
}
static int fact(int n)
{
int output;
if(n==1)
{
return 1;
}
output=fact(n-1)*n;
return output;
}
}


