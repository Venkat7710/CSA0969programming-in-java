import java.util.*;
class valid{    
 public static void main(String args[])
 {    
  String s1,s2;  
  boolean result;
  Scanner s= new Scanner(System.in);
  System.out.println("enter tne s1:");
  s1=s.nextLine();
  System.out.println("enter the s2:");
  s2=s.nextLine();
  result=s1.equals(s2);
  if (result==false)
  {
      System.out.println("User name is Invalid");
  }
  else
  {
      System.out.println("User name is valid");
  }
}
}
