import java.util.Scanner;
class invertedpyramid
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
for(int i=rows;i>=1;i--)
{
for(int j=0;j<rows-i;j++)
{
System.out.print(" ");
}
for(int k=0;k!=(2*i)-1;k++)
{
System.out.print("*");
}
System.out.println();
}
}
}
