import java.util.Scanner;
class nfabonacii
{
public static void main(String[] args)
{
int input,sum=0,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value:");
input=sc.nextInt();
int fabinacii[]=new int[2*input+1];
fabinacii[0]=0;
fabinacii[1]=1;
for(j=2;j<=2*input;j++)
{
fabinacii[j]=fabinacii[j-1]+fabinacii[j-2];
if(j%2==0)
sum=sum+fabinacii[j];
}
System.out.printf("the even sumof fabonacii series till %d is%d",input,sum);
}
}
