import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        this.setVisible(true); // by default u cant see frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
//        this.setResizable(false); // prevent frame from being resized
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        this.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        this.setTitle("My awesome frame");
        this.getContentPane().setBackground(Color.GRAY);
    }
}
