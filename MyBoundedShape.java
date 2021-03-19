import java.awt.*;
//This abstract class represents bounded shapes which have space. They can either be filled with color or not
public abstract class MyBoundedShape extends MyShape {

    private boolean isFilled;//This boolean attribute determines if a shape is filled with color if true or false otherwise

    //This constructor receives all the attributes as parameters and initializes them
    public MyBoundedShape (int x1, int x2, int y1, int y2, Color color, boolean isFilled){
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
        setColor(color);
        setFilled(isFilled);
    }
    //get method for the special attribute of this class - isFilled
    public boolean getFilled() {
        return isFilled;
    }
    //set method for isFilled
    public void setFilled(boolean filled){
        isFilled = filled;

    }

    public boolean equals(Object ob){//overriding equals method for this class
        if(ob instanceof MyBoundedShape)
            if (this.getX2()==((MyBoundedShape) ob).getX2()&&this.getY2()==((MyBoundedShape) ob).getY2())
                return true;
        return false;

    }

}
