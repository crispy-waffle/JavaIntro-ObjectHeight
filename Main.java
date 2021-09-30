import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    double t;
    double h;
    
    Scanner scan = new Scanner(System.in);
    
   
   //prompts input for segment length
    System.out.print("Enter a time less theb 4.5 seconds: ");
    t = scan.nextDouble();
    
   //adds total distance
    h = 100-4.9*t*t; 

   
   // prints total distance
    System.out.print("Height: " + h);
    
  }
}