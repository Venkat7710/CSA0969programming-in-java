import java.util.Scanner;
class range
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int ul,ll;
System.out.println("enter the lower limit:");
ll=sc.nextByte();
System.out.println("enter the upper limit:");
ul=sc.nextByte();
if(ll>ul)
{
System.out.println("enter the valid limits");
}
if(ll<0||ul<0||(ll<0 && ul<0))
{
System.out.println("enter the valid limits");
}
else
{
System.out.print("[");
if(ll<ul)
{
for(int j=ll;j<=ul;j++)
{
System.out.print("("+j+","+(int)Math.pow(j,2)+")");
if(j<ul)
System.out.print(",");
}
}
if(ul<ll)
{
for(int i=ll;i>=ul;i--)
{
System.out.print("("+i+","+(int)Math.pow(i,2)+")");
if(i>ul)
System.out.print(",");
}
}
System.out.print("]");
if(ul==ll)
System.out.println("both the same limits");
}
}
}