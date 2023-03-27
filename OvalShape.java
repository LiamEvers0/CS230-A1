/**
 *	===============================================================================
 *	OvalShape.java : A shape that is an oval.
 *  YOUR UPI:
 *	=============================================================================== */
import java.awt.*;
//Complete the OvalShape
class OvalShape extends Shape{
    public OvalShape(){ super(); }
    public OvalShape(Color c, Color bc, PathType pt){ super(c, bc, pt); }
    public OvalShape(int x, int y, int width, int height, int panelWidth, int panelHeight, Color c, Color bc, PathType pt){ super(x, y, width, height, panelWidth, panelHeight, c, bc, pt); }
    public void draw(Graphics g){ 
        System.out.println(this.getColor());
        System.out.println(this.getBorderColor());
        System.out.println(this.toString());
    }
    public boolean contains(Point mousePt){
        double mx = mousePt.getX();
        double my = mousePt.getY();
        double x1 = (this.getX() + this.getWidth());
        double y1 = (this.getY() + this.getHeight());
        double x = this.getX();
        double y = this.getY();
        double w = this.getWidth();
        double h = this.getHeight();
        double dx = (2 * mx - x - x1) / w;
        double dy = (2 * my - y - y1) / h;
        double d = dx * dx + dy * dy;
        if (d < 1.0){ return true; }
        else { return false; }
    }
}