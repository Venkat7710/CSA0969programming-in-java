import java.util.Scanner;
class foundindex
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String s=sc.nextLine();
System.out.println("enter the char:");
char c=sc.next().charAt(0);
int l=s.length();
char ch[]=new char[l];
for(int i=0;i<l;i++)
{
ch[i]=s.charAt(i);
}
int x=0;
for(int i=0;i<l;i++)
{
if(c==ch[i])
{
System.out.print(c+"index is"+(i+1));
x++;
}
}
}
}