import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
//This class creates shapes and using another class which clones the shapes, draws the original shapes and the
// cloned shapes into a single JPanel
public class ShapeGraphics extends JPanel {

    ArrayList<MyShape> list = new ArrayList();//The list containing the original shapes
    ArrayList<MyShape> clonedList;//The list containing the cloned shapes
    final int MAX_SIZE =200;//The maximal size of the shapes

    public ShapeGraphics() {
        //A random object to set random measures for the shapes
        Random rn = new Random();
        //Creating two instances of every shape using the random object and adding them to the list
        for (int i = 0; i <2 ; i++) {
            MyLine line = new MyLine(rn.nextInt(MAX_SIZE),rn.nextInt(MAX_SIZE),rn.nextInt(MAX_SIZE),rn.nextInt(MAX_SIZE), Color.RED);
            MyRectangle rec = new MyRectangle (rn.nextInt(MAX_SIZE),rn.nextInt(MAX_SIZE),rn.nextInt(MAX_SIZE),rn.nextInt(MAX_SIZE),Color.RED,true);
            MyOval oval = new MyOval (rn.nextInt(MAX_SIZE),rn.nextInt(MAX_SIZE),rn.nextInt(MAX_SIZE),rn.nextInt(MAX_SIZE),Color.RED,true);
            list.add(line);
            list.add(oval);
            list.add(rec);

        }
        //Creating cloned shapes of this list and adding them to another array list
        ClonedShapes c = new ClonedShapes(list);
        clonedList = c.getClonedList();
    }
    //Using this paint component method, we will draw all the shapes in the two lists in the same JPanel
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (int i = 0; i < list.size(); i++) {//draw the shapes of the original list
            list.get(i).draw(g);
        }
        for (int i = 0; i <clonedList.size() ; i++) {//draw the shapes of the cloned list
            clonedList.get(i).draw(g);
        }


    }










}
