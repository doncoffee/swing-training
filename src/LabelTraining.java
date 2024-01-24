import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelTraining {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        Border border = BorderFactory.createLineBorder(Color.ORANGE);

        JLabel label = new JLabel(); // A display area for a short text string or an image, or both
        label.setText("Bro, do you even code?"); // set text of label
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.ORANGE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setBackground(Color.BLACK);
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and text
//        label.setBounds(100, 0, 250, 250); // set bounds of label in frame

        frame.add(label);
//        frame.setLayout(null);
        frame.pack(); // makes frame size the same to label
    }
}
