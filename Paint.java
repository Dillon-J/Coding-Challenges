
/**
* Write a description of class Paint here.
*
* @author (Dillon Johnson)
* @version (10/21/2020)
*/
import java.util.Scanner;
public class Paint
{
 public static void main(String[] args)
 {
 final int COVERAGE = 305; //paint covers 305 sq ft/gal
 //declare integers length, width, and height;
 int length, width, height, doors,windows;
 //declare double totalSqFt;
 double totalSqFt;
 //declare double paintNeeded;
 double paintNeeded;
 //declare and initialize Scanner object
 Scanner scan = new Scanner(System.in);
 //Prompt for and read in the length of the room
 System.out.print("Enter the length.");
 length = scan.nextInt();
 //Prompt for and read in the width of the room
 System.out.print("Enter the width");
 width = scan.nextInt();
 //Prompt for and read in the height of the room
 System.out.print("Enter the height");
 height = scan.nextInt();
 //Compute the total square feet to be painted--think
 //about the dimensions of each wall
 System.out.println("Enter the number of windows");
 windows = scan.nextInt();
 System.out.println("Enter the number of doors");
 doors = scan.nextInt();
 totalSqFt = (2*width*height + 2*length*height)-(windows*20 + doors*25);
;
 //Compute the amount of paint needed
 paintNeeded = totalSqFt / COVERAGE;
 //Print the length, width, and height of the room and the
 //number of gallons of paint needed.
 System.out.println("Height= " + height + " Width= " + width + " Length=" + length + " Gallons of Paint Needed= " + paintNeeded);
 }
}
