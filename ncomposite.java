import java.util.Scanner;
class ncomposite
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the a:");
int a=sc .nextInt()+1;
System.out.println("enter the b:");
int b=sc.nextInt();
while(a<=b)
{
int count=0;
int j=2;
while(j<a){
if(a%j==0)
count++;
j++;
}
if(count>0)
System.out.println(a);
}
}
}

