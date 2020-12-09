import java.util.Scanner;

public class Prob1 {
public static void main(String[] args)
{
//Declare a scanner and input an int.
Scanner scan = new Scanner(System.in);
System.out.println("Please enter an integer:");
int n = scan.nextInt();
//If n is not in the range, print True.
if ( !( n >= 5 && n <= 76))
System.out.println("True");
//Otherwise, print False.
else
System.out.println("False");
}
}



