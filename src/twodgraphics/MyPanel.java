package twodgraphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {


    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.BLUE);
        g2D.setStroke(new BasicStroke(5));
//        g2D.drawLine(0, 0, 500, 500);

//        g2D.setPaint(Color.PINK);
//        g2D.drawRect(0, 0, 100, 200);
//        g2D.fillRect(0, 0, 100, 200);

//        g2D.setPaint(Color.orange);
//        g2D.drawOval(0, 0, 100, 100);

//        g2D.drawArc(0, 0, 100, 100, 0, 180);

//        int[] xPoints = {150, 250, 350};
//        int[] yPoints = {300, 150, 300};
//        g2D.drawPolygon(xPoints, yPoints, 3);

        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("You are a winner!", 50, 50);

    }
}
