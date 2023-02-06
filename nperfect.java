import java.util.Scanner;
class nperfect
{
public static void main(String[] args)
{
int sum = 0;
for(int i=1; i<num; i++)
{
if(num%i==0)
{
sum = sum+i;
}
}
if(sum==num)
return true;
else
return false;
}
}
/*public static void main(String[] args)
{
try
{
int n=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int N=sc.nextInt();
if(N==3)
n=1000;
if(N==5)
n=100000000;
for(int i=1;i<=n;i++){
System.out.println(i);
}
}
catch(Exception e)
{
System.out.println("enter the N value correctly:");
}
}
}*/