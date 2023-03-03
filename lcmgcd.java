import java.util.Scanner;
class lcmgcd
{
public static void main(String[] args)
{
int lcm,gcd,atemp,btemp,t;
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
atemp=a;
btemp=b;
while(btemp!=0)
{
t=btemp;
btemp=atemp%btemp;
atemp=t;
}
gcd=atemp;
lcm=(a*b)/gcd;
System.out.println("lcm:"+lcm);
System.out.println("gcd:"+gcd);
}
}
