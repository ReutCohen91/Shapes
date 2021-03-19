import javax.swing.*;
import java.awt.*;
//This abstract class represents an abstract geometrical shape which has four attributes: x1,x2,y1,y2 and color.
//This class also implements Cloneable interface which allows it to clone shapes
public abstract class MyShape extends JPanel implements Cloneable {
    //private attributes
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Color color;

    //Public Getters and Setters
    public int getX1() {
        return x1;
    }
    public int getX2() {
        return x2;
    }
    public int getY1() {
        return y1;
    }
    public int getY2() {
        return y2;
    }
    public Color getColor() {
        return color;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
    public void setColor(Color color) {
        this.color = color;
    }


    public abstract boolean equals(Object ob);//overriding equals method of Object

    public abstract void draw(Graphics g);//this method allows the shape to draw itself in a JPanel

    public Object clone() throws CloneNotSupportedException{//overriding clone method
        return super.clone();
    }



}

