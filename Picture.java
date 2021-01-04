
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;


public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("white");

        // Draw my picture
        
        //Central Circle
        Circle central = new Circle();
        central.makeVisible();
        central.changeColor("black");
        central.changeSize(120);
        central.moveHorizontal(100);
        central.moveVertical(150);
        
        //Arcing "rays"
        Arc a = new Arc(355, 190, 120, 20, 110, "black", true);
        Arc b = new Arc(375, 150, 120, 20, 110, "black", true);
        Arc c = new Arc(395, 110, 120, 20, 110, "black", true);
        Arc d = new Arc(415, 70, 120, 20, 110, "black", true);
        Arc f = new Arc(435, 30, 120, 20, 110, "black", true);
        Arc g = new Arc(455, -10, 120, 20, 110, "black", true);
        
        //"Expanding" Rectangles
        Rect i = new Rect();
        i.makeVisible();
        i.moveHorizontal(-325);
        i.moveVertical(165);
        i.changeSize(30, 350);
        Rect j = new Rect();
        j.makeVisible();
        j.moveHorizontal(135);
        j.moveVertical(165);
        j.changeSize(30, 360);
        Rect k = new Rect();
        k.makeVisible();
        k.moveHorizontal(65);
        k.moveVertical(235);
        k.changeSize(300, 30);
        
        
        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
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