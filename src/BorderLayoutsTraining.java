import javax.swing.*;
import java.awt.*;

public class BorderLayoutsTraining {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel5 = new JPanel();

        jPanel1.setBackground(Color.red);
        jPanel2.setBackground(Color.green);
        jPanel3.setBackground(Color.yellow);
        jPanel4.setBackground(Color.magenta);
        jPanel5.setBackground(Color.blue);

        jPanel1.setPreferredSize(new Dimension(100, 100));
        jPanel2.setPreferredSize(new Dimension(100, 100));
        jPanel3.setPreferredSize(new Dimension(100, 100));
        jPanel4.setPreferredSize(new Dimension(100, 100));
        jPanel5.setPreferredSize(new Dimension(100, 100));

        frame.add(jPanel1, BorderLayout.NORTH);
        frame.add(jPanel2, BorderLayout.WEST);
        frame.add(jPanel3, BorderLayout.EAST);
        frame.add(jPanel4, BorderLayout.SOUTH);
        frame.add(jPanel5, BorderLayout.CENTER);

        // also i can create sub panels inside one panel
    }
}
