import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
//Declare a Scanner and input two integers.
Scanner scan = new Scanner(System.in);
System.out.println("Please enter two integers:");
int x = scan.nextInt();
int y = scan.nextInt();
//Use if-else to produce the necessary output.
if(x >= 0 && y >= 0)
System.out.println("Both are positive or zero.");
else
System.out.println("One or both are negative.");
}
}0

  
