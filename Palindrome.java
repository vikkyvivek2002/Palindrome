import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
 System.out.println("Enter a number:"); 
 int n = s.nextInt();
 int t = n ;
 int sum =0, rem;
 while(n!=0)
{  
  rem = n%10;
  sum = sum*10 + rem;
  n = n/10;
}
  if(t == sum )
   System.out.println(t +" is palindrome");
  else
   System.out.println(t +" is not palindrome");
}
}
 