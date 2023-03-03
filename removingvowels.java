import java.util.Scanner;
class removingvowels
{
public static void main(String[] args)
{
String s1,s2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the String:");
s1=sc.nextLine();
s2=s1.replaceAll("[aeiouAEIOU]","");
System.out.println("all vowels removed and new string is:");
System.out.println(s2);
}
}