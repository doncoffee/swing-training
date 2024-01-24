import javax.swing.*;
import java.awt.*;

public class FlowLayoutTraining {

    public static void main(String[] args) {
        // FlowLayout =    places components in a row, sized at their preferred size.
        //                 If the horizontal space in the container is too small,
        //                 the FlowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(250, 250));
        jPanel.setBackground(Color.lightGray);
        jPanel.setLayout(new FlowLayout());

        // also can add into frame instead of panel
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        jPanel.add(new JButton("4"));
        jPanel.add(new JButton("5"));
        jPanel.add(new JButton("6"));
        jPanel.add(new JButton("7"));
        jPanel.add(new JButton("8"));
        jPanel.add(new JButton("9"));

        frame.add(jPanel);
        frame.setVisible(true);
    }
}
