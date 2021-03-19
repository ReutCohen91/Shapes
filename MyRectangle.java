import java.awt.*;
//This class represents a rectangular shape
public class MyRectangle extends MyBoundedShape {
    //Using super constructor to initialize the attributes
    public MyRectangle(int x1, int x2, int y1, int y2, Color color, boolean isFilled){
        super( x1, x2, y1, y2, color, isFilled);
    }



    @Override//The draw method for this rectangular shape
    public void draw(Graphics g) {
        g.setColor(getColor());//setting the color of the rectangle
        if(getFilled())//if it is filled, draw a filled rectangle
            g.fillRect(getX1(),getY1(),getX2(),getY2());
        else//if not, draw an unfilled rectangle
            g.drawRect(getX1(),getY1(),getX2(),getY2());
    }
}
