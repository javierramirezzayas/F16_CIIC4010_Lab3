import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        
                        int x3 = getWidth();
                        int y3 = myInsets.top; 
                        int x4 = myInsets.left;
                        int y4 = getHeight();
                        int x5 = (getWidth()-55)/2;  //Must put -55 because of center of the oval
                        int y5 = (getHeight()-55)/2; //Must put -55 because of center of the oval
                        
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
 
                        //Paint the background
                        //START
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                       
                        //Draw a stripe
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width, height);
                        //Drawing another border with the same color
                        g.fillRect(x1 + 5, y1 + 5, width - 10, height - 10);
                        
                        //Drawing lines
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        g.setColor(Color.GREEN);
                        g.drawLine(x3, y3, x4, y4);

                        
                        //Drawing Oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval(x5, y5, 55, 55);
                        
                        //Drawing Polygon (Arrow)
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.YELLOW);
                        g.fillPolygon(p);
                        //END
                        
                        //Drawing Polygon(Star)
                        Polygon p2 = new Polygon() ;
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                 
            }
}