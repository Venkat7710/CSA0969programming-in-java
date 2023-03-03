import java.util.Scanner;
class squarecube
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the decimal number:");
float n=sc.nextFloat();
System.out.println("square of"+n+":"+n*n);
System.out.println("cube of"+n+":");
System.out.format("%.3f",(n*n*n));
}
}