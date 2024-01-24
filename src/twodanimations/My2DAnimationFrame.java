package twodanimations;

import javax.swing.*;

public class My2DAnimationFrame extends JFrame {

    private final MyPanel panel;

    My2DAnimationFrame() {
        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
