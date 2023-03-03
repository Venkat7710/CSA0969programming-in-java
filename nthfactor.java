import java.util.Scanner;
class nthfactor
{
public static void main(String[] args)
{
int num,nth;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
num=sc.nextInt();
System.out.println("enter N:");
nth=sc.nextInt();
int i,count=0;
for(i=1;i<=num;i++)
{
if(num%i==1)
{
count=count+1;
if(count==nth)
{
System.out.println(nth+"th factor of"+num+":"+i);
}
}
}
System.out.printf("toatal factor is:"+count);
}
}