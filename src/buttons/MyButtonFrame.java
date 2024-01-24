package buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonFrame extends JFrame implements ActionListener {
    private final JButton button;

    public MyButtonFrame() {
        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> System.out.println("poo"));
        button.setText("I'm a button!");
        button.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("poo");
        }
    }
}
