import java.util.Scanner;

//Code Calculates the height of an object
// at any given time dropped 
//from a starting height of 100 meters(less than 4.5 sec)



public class Main
{
  public static void main(String[] args)
  {
    double t;
    double h;
    
    Scanner scan = new Scanner(System.in);
    
   
   //prompts input for height
    System.out.print("Enter a time less then 4.5 seconds: ");
    t = scan.nextDouble();
    
   //Calculates total height
    h = 100-4.9*t*t; 

   
   // prints total Height
    System.out.print("Height: " + h + " meters");
    
  }
}