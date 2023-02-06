import java.util.Scanner;
class alpha
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any character:");
char ch=sc.next().charAt(0);
int l_count=0,u_count=0,num_count=0;
while(ch!='*')
{
if(ch>='A' && ch<='Z')
u_count++;
if(ch>='a' && ch<='z')
l_count++;
if(Character.isDigit(ch))
num_count++;
System.out.println("enter any character:");
ch=sc.next().charAt(0);
}
System.out.println("total count of lower case:"+l_count++);
System.out.println("total count of upper case:"+u_count++);
System.out.println("total count of numbers:"+num_count++);
}
}


