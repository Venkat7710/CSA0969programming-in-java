import java.util.Scanner;
class tax
{
public static void main(String[] args)
{
int i;
float j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the income:");
i=sc.nextInt();
if(i<=250000)
{
j=0;
System.out.println("tax is:"+j);
}
else if(i>=250001 && i<=500000)
{
j=i*10/100;
System.out.println("tax is:"+j);
}
else if(i>=500001 && i<=1000000)
{
j=i*20/100;
System.out.println("tax is:"+j);
}
else if(i>=1000001)
{
j=i*30/100;
System.out.println("tax is:"+j);
}
}
}

