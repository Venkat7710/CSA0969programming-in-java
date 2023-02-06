import java.util.Scanner;
class aggregate
{
public static void main(String[] args)
{
float[] marks = new float[4];
float sum=0,avg;
Scanner sc=new Scanner(System.in);
int i;
System.out.print("enter n");
int n=sc.nextInt();
System.out.println("enter the m1:");
int m1=sc.nextInt();
System.out.println("enter the m2:");
int m2=sc.nextInt();
System.out.println("enter the m3:");
int m3=sc.nextInt();
System.out.println("enter the m4:");
int m4=sc.nextInt();
/*System.out.print("Enter Marks Obtained in 8 Subjects: ");
for(i=0; i<4; i++)
marks[i] = sc.nextFloat();
for(i=0; i<4; i++)
sum = sum + marks[i];
float avg = sum/4;*/
int total=m1+m2+m3+m4;
avg=total/4;
System.out.print("The student total is:"+total);
System.out.print("The student avg is:"+avg);
if(avg>=80)
{
System.out.println("grade A");
}
else if(avg>=60 && avg<80)
{
System.out.println("grade B");
}
else if(avg>=40 && avg<60)
{
System.out.println("grade C");
}
else
{
System.out.println("grade D");
}
}
}


