import java.util.Scanner;
class commonelement
{
public static void main(String[] args)
{
int a1,b1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the space array1:");
a1=sc.nextInt();
int a[]=new int[a1];
System.out.println("enter the elements into array:");
for(int i=0;i<a1;i++)
{
a[i]=sc.nextInt(); 
}
System.out.println("enter the space array2:");
b1=sc.nextInt();
int b[]=new int[b1];
System.out.println("enter the elements into array:");
for(int i=0;i<b1;i++)
{
b[i]=sc.nextInt(); 
}
for(int i=0;i<a1;i++)
{
for(int i=0;i<b1;i++)
{
if(a[i]>0 && b[i]>0)
{
if(a[i]==b[i])
System.out.println("common elements:"+a[i]+"");
}
}
}
}
}
