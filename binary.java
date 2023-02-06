import java.util.Scanner;
class binary
{
public static void main(String[] args)
{
try
{
Scanner scan;
int num;
scan=new Scanner(System.in);
System.out.println("decimal number:");
num=Integer.parseInt(scan.nextLine());
String binary=Integer.toBinaryString(num);
System.out.println("Binary number:"+binary);
String octal=Integer.toOctalString(num);
System.out.println("Octal number:"+octal);
}
catch(Exception e)
{
System.out.println("enter only number:");
}
}
}
