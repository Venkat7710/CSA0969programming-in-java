import java.util.Scanner;
class maxmin
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the space of array:");
int space=sc.nextInt();
int[] arr=new int[space];
System.out.println("enter the values of array:");
for(int i=0;i<space;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter the mth max number:");
int m=sc.nextInt();
System.out.println("enter the nth max number:");
int n=sc.nextInt();
int max=0,min=0;
if(m==0)
System.out.println("enter the valid input:");
else{
max=arr[arr.length-m];
min=arr[n-1];
System.out.println("max is:"+max);
System.out.println("min is:"+min);
System.out.println("max is:"+(max+min));
System.out.println("max is:"+(max-min));
}
}
}