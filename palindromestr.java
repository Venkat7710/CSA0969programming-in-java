import java.util.scanner;
class palindromestr
{
public static void main(string[] args)
{
string str,reverse=" ";
scanner sc=new scanner(system.in);
system.out.println("enter the string:");
str=sc.nextLine();
int length=str.length();
for(int i=length-1;i>=0;i--)
{
reverse=reverse+str.charat(i);
}
if(str.equals(reverse))
{
system.out.println("is palindrome");
}
else
{
system.out.println("is not palindrome")
}
}
}
