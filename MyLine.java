import java.awt.*;
//This class represents a geometrical line
public class MyLine extends MyShape {

    //Constructor to initialize the attributes
    public MyLine(int x1, int x2, int y1, int y2, Color color){
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
        setColor(color);

    }
    //This method calculates the length of a line using Pythagoras method
    public double lengthCalc(){
        double baseOne, baseTwo, length;
        baseOne = Math.abs(getY1()-getY2());//the first base of the triangle
        baseTwo = Math.abs(getX1()-getX2());//the second base of the triangle
        length = Math.sqrt(baseOne+baseTwo);//the hypotenuse of the triangle which is the length of the line
        return length;
    }


    public boolean equals(Object ob){
        if(ob instanceof MyLine)
            //if the lengths of the lines are equal, the objects are equal
            if (this.lengthCalc()==((MyLine) ob).lengthCalc())
                return true;
        return false;

    }

    @Override
    public void draw(Graphics g) {//Drawing the line
        g.setColor(getColor());
        g.drawLine(getX1(),getY1(),getX2(),getY2());
    }


}
