/**
 *	===============================================================================
 *	RectangleShape.java : A shape that is a rectangle.
 *  YOUR UPI:
 *	=============================================================================== */
import java.awt.*;
//Complete the RectangleShape
class RectangleShape extends Shape{
    public RectangleShape(){ super(); }
    public RectangleShape(Color c, Color bc, PathType pt){
        super(c, bc, pt);
    }

    public RectangleShape(int x, int y, int width, int height, int panelWidth, int panelHeight, Color c, Color bc, PathType pt){
        super(x, y, width, height, panelWidth, panelHeight, c, bc, pt);
    }

    public void draw(Graphics g){
        System.out.println(this.getColor());
        System.out.println(this.getBorderColor());
        System.out.println(this.toString());
    }

    public boolean contains(Point mousePt){
        boolean result = false;
        double mousePtX = mousePt.getX();
        double mousePtY = mousePt.getY();
        double topPtY = this.getY();
        double leftPtX = this.getX();
        double btmPtY = topPtY + (this.getHeight());
        double rightPtX = leftPtX + this.getWidth();
        
        if (mousePtX >= leftPtX && mousePtX <= rightPtX && mousePtY >= topPtY && mousePtY <= btmPtY){
            result = true;
        }
        return result;
    }
}