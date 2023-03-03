import java.util.Scanner;
class righttriangle
{
public static void main(String[] args)
{
int i,j,rows;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.of rows:");
rows=sc.nextInt();
for(i=1;i<=rows;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("%");
}
System.out.println("");
}
}
}