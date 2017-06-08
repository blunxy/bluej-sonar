/**
 * Calculates basic statistics about a single rectangle
 * @author Alex Serban
 * @version 1.0
 * Last Modified: <October 5, 2015> - <semicolon added after System.out.println (area)> <Alex Serban>
 */
import java.util.Scanner;
public class Rectanglezilla
{
    public static void main (String[] args)
    {
        double leftX, leftY, rightX, rightY, length, width, perimeter, area;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter x value of coordinate on top left corner: ");
        
        leftX = scan.nextDouble();
        
        System.out.print ("Enter y value of coordinate on top left corner: ");
        
        leftY = scan.nextDouble();
        
        System.out.print ("Enter x value of coordinate on bottom right corner: ");
        
        rightX = scan.nextDouble();
        
        System.out.print ("Enter y value of coordinate on bottom right corner: ");
        
        rightY = scan.nextDouble();
        
        length=  rightX - leftX;
        
        width= leftY - rightY;
        
        perimeter= 2*length + 2*width;
        
        area= length*width;
        
        System.out.println (length);
        
        System.out.println (width);
        
        System.out.println (perimeter);
        
        System.out.println (area);
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
    }
}
