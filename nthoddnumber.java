import java.util.Scanner;
class nthoddnumber
{
public static void main(String[] args)
{
int n,x,z;
Scanner sc=new Scanner(System.in);
System.out.println("N:");
n=sc.nextInt();
/*if(!sc.hasNextInt())
{
System.out.println("invalid");
return;
}*/
if(n<=0)
{
System.out.println("invalid");
return;
}
x=n*2;
z=(2*x-1);
System.out.println(n+"th odd number after odd number:"+z);
}
}