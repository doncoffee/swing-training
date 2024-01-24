package colorchooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorChooserFrame extends JFrame implements ActionListener {
    private final JButton button;
    private final JLabel label;

    MyColorChooserFrame() {
        button = new JButton("Pick a color");
        label = new JLabel();

        label.setBackground(Color.WHITE);
        label.setText("Some text :D");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);

        button.addActionListener(this);
        this.add(button);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.BLACK);

            label.setForeground(color);
            // label.setBackground(color);
        }
    }
}
