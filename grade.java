import java.util.Scanner;
class aggregate
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.our.println("enter the m1:");
int m1=sc.nextInt();
System.our.println("enter the m2:");
int m2=sc.nextInt();
System.our.println("enter the m3:");
int m3=sc.nextInt();
System.our.println("enter the m4:");
int m4=sc.nextInt();
}
Scanner.close();
int total=m1+m2+m3+m4;
float avg=total/4;
System.out.print("the student grade is:");
if(avg>=80)
{
System.out.print("grade A");
}
else if(avg>=60 && avg<80)
{
System.out.print("grade B");
}
else if(avg>=40 && avg<60)
{
System.out.print("grade C")
}
else
{
System.out.print("grade D")
}
}
}


