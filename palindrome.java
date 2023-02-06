import java.util.Scanner;
class palin
{
public static void main(String[] args)
{
String str,reverse=" ";
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
str=sc.nextLine();
int length=str.length();
for(int i=length-1;i>=0;i--)
{
reverse=reverse+str.charAt(i);
}
if(str.equals(reverse))
{
System.out.println("is palindrome");
}
else
{
System.out.println("is not palindrome");
}
}
}
