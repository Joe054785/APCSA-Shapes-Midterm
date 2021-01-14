
/**
 * Draws a monster destroying water bags.
 * 
 * @author: Joseph Hall
 * @version: 1/11/21
 * Returns a picture
 */
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class Picture {
    
    //Circle Creator
    public static void Circle(int distance1, int distance2, String color, int Size, boolean makeVisible)
    {
        Circle name = new Circle();
        name.changeColor(color);
        name.changeSize(Size);
        name.moveHorizontal(distance1); //x-value
        name.moveVertical(distance2); //y-value
        if (makeVisible)
        {
            name.makeVisible();
        }
    }
    
    //Rectangle Creator
    public static void Rectangle(int distance1, int distance2, String color, int Size1, int Size2, boolean makeVisible)
    {
        Rect name = new Rect();
        name.moveHorizontal(distance1); //x-value
        name.moveVertical(distance2); //y-value
        name.changeSize(Size1, Size2);
        name.changeColor(color);
        if (makeVisible)
        {
            name.makeVisible();
        }
    }
    
    //Triangle Creator
    public static void Triangle(int distance1, int distance2, String color, boolean makeVisible)
    {
        Triangle name = new Triangle();
        name.moveHorizontal(distance1); //x-value
        name.moveVertical(distance2); //y-value
        name.changeColor(color);
        if (makeVisible)
        {
            name.makeVisible();
        }
    }
    
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("Water Bag Destruction");
        pic.setBackgroundColor("black");
        
        //Draw my picture
        
        //Central Water Bag
        Circle(100, 150, "blue", 120, true);
        
        //Claws
        //Sets up arcs on top of the water bag to look like claws.
        for(int count = 115; count <=575 ; count+=40)
        {
            Arc a = new Arc(count, 160, 120, 20, 240, "white", true);
        }
        
        //Second set of claws
        //Sets up arcs below the water bag to look like claws.
        for(int count = 115; count <=575 ; count+=40)
        {
            Arc b = new Arc(count, 340, 120, 110, 20, "white", true);
        }
        
        
        //Water streaming out of the water bag
        Rectangle(-325, 165, "blue", 30, 350, true);
        Rectangle(135, 165, "blue", 30, 360, true);
        Rectangle(65, 225, "blue", 310, 30, true);
        
        //Makes the left "eye"
        Triangle(40, -100, "red", true);
        
        //Makes the right "eye"
        Triangle(340, -100, "red", true);
        
        //Determines color of third & fourth central "eyes"
        double number = (double)(Math.random() * 10);
        if(number > 5)
        {
            Triangle(140, -100, "red", true);
            Triangle(240, -100, "red", true);
        }
        else
        {
            Triangle(140, -100, "blue", true);
            Triangle(240, -100, "blue", true);
        }
        
        //Tree Water Bags in the bottom left corner in a pile
        Circle(-200, 400, "blue", 60, true);
        Circle(-180, 360, "blue", 60, true);
        Circle(-160, 400, "blue", 60, true);
        
        //Three water bags in the bottom right corner in a pile
        Circle(430, 400, "blue", 60, true);
        Circle(450, 360, "blue", 60, true);
        Circle(470, 400, "blue", 60, true);
       
        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "Joseph_Hall_Water_Bag_Consumption.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}