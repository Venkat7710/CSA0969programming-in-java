import java.util.Scanner;
class vowel1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String line=sc.nextLine();
int vowels=0,consonants=0,digits=0,spaces=0;
line=line.toLowerCase();
for(int i=0;i<line.length();++i)
{
char ch=line.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
++vowels;
System.out.print("vowels:"+ch+"\n");
}

if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
{
++consonants;
System.out.println("consonants:"+ch+"\n");
}
/*else if((ch>='0'&&ch<='9'))
{
++digits;
System.out.println("digits"+ch+"\n");
}
else if(ch==' ')
{
++spaces;
}*/
}
}
}

