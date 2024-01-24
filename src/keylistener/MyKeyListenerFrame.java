package keylistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListenerFrame extends JFrame implements KeyListener {
    private final JLabel label;

    MyKeyListenerFrame() {

        ImageIcon icon = new ImageIcon("src/keylistener/rocket.png");
        label = new JLabel();

        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.addKeyListener(this);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // method invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's': label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd': label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // method invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()) {
            // moving using arrows
            case 37: label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39: label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40: label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // called whenever a button is pressed/released
        System.out.println("You released key char: " + e.getKeyChar());
    }
}
