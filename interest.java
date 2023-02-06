import java.util.Scanner;
class interest
{
public static void main(String args [])
{
float p,r,t,s1,s2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the principle:");
p=sc.nextInt();
System.out.println("enter the rate:");
r=sc.nextInt();
System.out.println("enter the time:");
t=sc.nextInt();
s1=(p*r*t)/100;
System.out.println("enter the principle:");
p=sc.nextInt();
System.out.println("enter the rate:");
r=sc.nextInt();
System.out.println("enter the time:");
t=sc.nextInt();
s2=(p*r*t)/100;
System.out.println("enter the senior s1:"+s1);
System.out.println("enter the customer s2:"+s2);
}
}
