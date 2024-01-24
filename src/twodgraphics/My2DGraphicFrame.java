package twodgraphics;

import javax.swing.*;
import java.awt.*;

public class My2DGraphicFrame extends JFrame {
    private final MyPanel panel;

    My2DGraphicFrame() {

        panel = new MyPanel();

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}
