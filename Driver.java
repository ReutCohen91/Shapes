import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//The driver class runs the program
public class Driver {

    public static void main(String[] args)  {

        ShapeGraphics s = new ShapeGraphics();//Create a ShapeGraphics object to initialize and draw the shapes
        //setting a new JFrame window and adding s as the paint component
        JFrame f = new JFrame();
        f.setSize(400, 400);//setting the size of the window
        f.add(s);
        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        };
        f.addWindowListener(wndCloser);
        f.setVisible(true);
    }


}
