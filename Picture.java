
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: Joseph Hall
 * @version: 1/11/21
 * 
 */
import java.io.File;
import java.io.IOException;
import java.lang.Math;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("black");

        // Draw my picture
        
        //Water Bag
        Circle central = new Circle();
        central.makeVisible();
        central.changeColor("blue");
        central.changeSize(120);
        central.moveHorizontal(100);
        central.moveVertical(150);
        
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
        Rect i = new Rect();
        i.makeVisible();
        i.moveHorizontal(-325);
        i.moveVertical(165);
        i.changeSize(30, 350);
        i.changeColor("blue");
        Rect j = new Rect();
        j.makeVisible();
        j.moveHorizontal(135);
        j.moveVertical(165);
        j.changeSize(30, 360);
        j.changeColor("blue");
        Rect k = new Rect();
        k.makeVisible();
        k.moveHorizontal(65);
        k.moveVertical(225);
        k.changeSize(310, 30);
        k.changeColor("blue");
        
        //Makes the left "eye"
        Triangle c = new Triangle();
        c.makeVisible();
        c.moveHorizontal(40);
        c.moveVertical(-100);
        c.changeColor("red");
        
        //Makes the right "eye"
        Triangle d = new Triangle();
        d.makeVisible();
        d.moveHorizontal(340);
        d.moveVertical(-100);
        d.changeColor("red");
        
        //Determines color of third & fourth central "eyes"
        double number = (double)(Math.random() * 10);
        if(number > 5)
        {
            Triangle f = new Triangle();
            f.makeVisible();
            f.moveHorizontal(140);
            f.moveVertical(-100);
            f.changeColor("red");
            Triangle g = new Triangle();
            g.makeVisible();
            g.moveHorizontal(240);
            g.moveVertical(-100);
            g.changeColor("red");
        }
        else
        {
            Triangle f = new Triangle();
            f.makeVisible();
            f.moveHorizontal(140);
            f.moveVertical(-100);
            f.changeColor("blue");
            Triangle g = new Triangle();
            g.makeVisible();
            g.moveHorizontal(240);
            g.moveVertical(-100);
            g.changeColor("blue");
        }
        
        //More Water Bags in the bottom left corner
        Circle bottomleft1 = new Circle();
        bottomleft1.makeVisible();
        bottomleft1.changeColor("blue");
        bottomleft1.changeSize(60);
        bottomleft1.moveHorizontal(-200);
        bottomleft1.moveVertical(400);
        Circle bottomleft2 = new Circle();
        bottomleft2.makeVisible();
        bottomleft2.changeColor("blue");
        bottomleft2.changeSize(60);
        bottomleft2.moveHorizontal(-180);
        bottomleft2.moveVertical(360);
        Circle bottomleft3 = new Circle();
        bottomleft3.makeVisible();
        bottomleft3.changeColor("blue");
        bottomleft3.changeSize(60);
        bottomleft3.moveHorizontal(-160);
        bottomleft3.moveVertical(400);
        
        //More water bags in the bottom right corner
        Circle bottomright1 = new Circle();
        bottomright1.makeVisible();
        bottomright1.changeColor("blue");
        bottomright1.changeSize(60);
        bottomright1.moveHorizontal(430);
        bottomright1.moveVertical(400);
        Circle bottomright2 = new Circle();
        bottomright2.makeVisible();
        bottomright2.changeColor("blue");
        bottomright2.changeSize(60);
        bottomright2.moveHorizontal(450);
        bottomright2.moveVertical(360);
        Circle bottomright3 = new Circle();
        bottomright3.makeVisible();
        bottomright3.changeColor("blue");
        bottomright3.changeSize(60);
        bottomright3.moveHorizontal(470);
        bottomright3.moveVertical(400);
       
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