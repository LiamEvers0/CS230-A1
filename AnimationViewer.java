/**
 * ==========================================================================================
 *  AnimationPanel.java : Moves shapes around on the screen according to different paths.
 *  It is the main drawing area where shapes are added and manipulated.
 *  YOUR UPI: ANSWER
 *  =========================================================================================
 */

import java.awt.*;
import java.util.ArrayList;

class AnimationViewer  {
    private ArrayList<Shape> shapes = new ArrayList<Shape>(); //create the ArrayList to store shapes
    private ShapeType currentShapeType=Shape.DEFAULT_SHAPETYPE; // the current shape type,
    private PathType currentPathType=Shape.DEFAULT_PATHTYPE;  // the current path type
    private Color currentColor=Shape.DEFAULT_COLOR;  // the current fill colour of a shape
    private int currentPanelWidth=Shape.DEFAULT_PANEL_WIDTH, currentPanelHeight = Shape.DEFAULT_PANEL_HEIGHT, currentWidth=Shape.DEFAULT_WIDTH, currentHeight=Shape.DEFAULT_HEIGHT;

	// data field

	//Complete the createNewshape method
    protected void createNewShape(int x, int y) {

	}
	public AnimationViewer() {}

	//Complete the get/set currentShapeType methods

	//Complete the get/set currentPathType methods
    public ShapeType getCurrentShapeType(){ return this.currentShapeType; }
    public PathType getCurrentPathType(){ return this.currentPathType; }
    public void setCurrentShapeType(ShapeType s){ this.currentShapeType = s;}
    public void setCurrentPathType(PathType p){ this.currentPathType = p; }
	public int getCurrentWidth() { return  currentWidth; }
	public int getCurrentHeight() { return currentHeight; }
    public void setCurrentWidth(int w) {currentWidth=w;}
    public void setCurrentHeight(int h) {currentHeight=h;}
    public Color getCurrentColor() { return currentColor; }
    public void setCurrentColor(Color c){currentColor = c;}
    public void setPanelWidth(int w) {currentPanelHeight=w;}
    public void setPanelHeight(int h) {currentPanelHeight=h;}
    public void paintComponent(Graphics g) {
		for (Shape currentShape: shapes) {
			currentShape.move();
			currentShape.draw(g);
			currentShape.drawHandles(g);
		}
    }
}