import java.util.Scanner;
class mul
{
public static void main(String[] args)
{
try
{
int i,n,n1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
n=sc.nextInt();
System.out.println("enter table number:");
n1=sc.nextInt();
for(i=1;i<=n;i++)
{
System.out.print(i+"x"+n1+"="+i*n1+" ");
}
}
catch(Exception e)
{
System.out.print("enter the number only:");
}
}
}


