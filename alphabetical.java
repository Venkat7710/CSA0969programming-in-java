import java.util.Scanner;
class alphabetical
{
public static void main(String[] args)
{
int n;
String temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of names");
n=sc.nextInt();
String names[]=new String[n];
Scanner s1=new Scanner(System.in);
System.out.println("enter the number of names");
for(int i=0;i<n;i++)
{
names[i]=s1.nextLine();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(names[i].compareTo(names[j])>0)
{
temp=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
System.out.println("names in sorted order:");
for(int i=0;i<=n-1;i++)
{
System.out.print(names[i]+",");
}
}
}

