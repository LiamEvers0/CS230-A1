/**
 *  =====================================================================================================
 *  A1.java : Extends JFrame and contains a panel where shapes move around on the screen (entire project)
 *  YOUR UPI: ANSWER
 *  =====================================================================================================
 */

import java.util.ArrayList;
import java.awt.*;
public class A1 {
	private AnimationViewer panel;  // panel for bouncing area
	public static void main(String[] args) {
		A1 program = new A1();
	}
	public A1() {
		panel = new AnimationViewer();
		for (int i=0; i<4; i++) {
			panel.setCurrentWidth(i*10);
			panel.setCurrentHeight(i*15);
			panel.createNewShape(i, i+5);
			panel.paintComponent(null);
		}
		System.out.println("DONE");
	}
}

