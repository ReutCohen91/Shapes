import java.awt.*;
import java.util.ArrayList;
//This class represents cloned shapes which are moved and have their color changed
public class ClonedShapes {

    private final int num = 10;//This is the number of pixels with which the cloned shapes are changed
    private ArrayList<MyShape> clonedList = new ArrayList();//This is the list which will contain the new shapes
    //This constructor receives a list of shapes and copies them to this object's list
    public ClonedShapes(ArrayList<MyShape> list)  {
        for (int i = 0; i < list.size(); i++) {
            try {//try and catch the exception. If the shapes cannot be cloned, the program will end
                clonedList.add((MyShape) list.get(i).clone());
            } catch (CloneNotSupportedException e) {
                System.out.println("Cannot clone the shapes in the list");
                System.exit(1);
            }
            moveShapes();//Use this method to change the cloned shapes
        }
    }

    //This method moves all the shapes by some constant number of pixels and also change the
    //color of the shapes and makes them unfilled
    public void moveShapes(){
        for (int i = 0; i < clonedList.size(); i++) {
            //For all types of shapes, change X1,Y1
            clonedList.get(i).setX1(clonedList.get(i).getX1()+num);
            clonedList.get(i).setY1(clonedList.get(i).getY1()+num);
            clonedList.get(i).setColor(Color.GREEN);
            if(clonedList.get(i) instanceof MyBoundedShape) {
                ((MyBoundedShape) clonedList.get(i)).setFilled(false);//for bounded shapes, change the filled attribute
            }
            if(clonedList.get(i) instanceof MyLine){//If it's a line change also X2,Y2
                clonedList.get(i).setX2(clonedList.get(i).getX2()+num);
                clonedList.get(i).setY2(clonedList.get(i).getY2()+num);
            }

        }
    }


    public ArrayList<MyShape> getClonedList() {
        return clonedList;
    }



}
