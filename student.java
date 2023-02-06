class student
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the subjects";);
n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("enter the marks:");
arr[i]=sc.nextInt();
}
int total=0;
for(int i=0;i<n;i++)
{
total=total+arr[i];
}
System.out.println("total is"+total);
percentage=(total/percantage);
System.out.println("percentage is" +percentage);
}
}

