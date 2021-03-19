import java.awt.*;
//This class represents an oval shape
public class MyOval extends MyBoundedShape {
    //Using super constructor to initialize the attributes
    public MyOval(int x1, int x2, int y1, int y2, Color color, boolean isFilled){
        super( x1, x2, y1, y2, color, isFilled);
    }

    //The draw method for this oval shape
    public void draw(Graphics g){

        g.setColor(getColor());//setting the color of the oval
        if(getFilled())//if it is filled, draw a filled oval
            g.fillOval(getX1(),getY1(),getX2(),getY2());
        else//if not, draw an unfilled oval
            g.drawOval(getX1(),getY1(),getX2(),getY2());

    }









}
