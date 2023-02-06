import java.util.Scanner;
class hallow
{
public static void main(String[] args)
{
Scanner sc=new Scanner(system.in);
System.out.println("enter the rows in pattern:");
int rows=Sc.nextInt();
System.out.println("pattern");
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("1");
}
System.out.print();
}
for(int i=rows-1;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print("1");
}
System.out.println();
}
sc.close();
}
}