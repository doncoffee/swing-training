package dragndrop;

import javax.swing.*;

public class MyDragNDropFrame extends JFrame {
    private final DragPanel dragPanel = new DragPanel();

    MyDragNDropFrame() {
        this.add(dragPanel);
        this.setTitle("Drag & Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
