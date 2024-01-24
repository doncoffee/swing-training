package textfields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextFieldFrame extends JFrame implements ActionListener {
    private final JButton jButton;
    private final JTextField textField;

    MyTextFieldFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        jButton = new JButton("Submit");
        jButton.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 15));
        textField.setForeground(Color.ORANGE);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("Type your name in here");

        this.add(jButton);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton) {
            System.out.println("Welcome " + textField.getText());
            jButton.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
