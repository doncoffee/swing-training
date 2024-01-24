import javax.swing.*;

public class JOptionPaneLearning {

    public static void main(String[] args) {
        // JOptionPane   =   pop up a standard dialog box that prompts users for a value
        //                   or informs them of something.

        JOptionPane.showMessageDialog(null,
                "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Here is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "really?", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Your computer has a virus!!!", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Call tech support now!!!", "title", JOptionPane.ERROR_MESSAGE);


        JOptionPane.showConfirmDialog(null, "bro, do you even code?", "title", JOptionPane.YES_NO_CANCEL_OPTION);

        String name = JOptionPane.showInputDialog("What is your name?: ");

        String[] responses = {"No, you're awesome!", "thank you!", "*blush*"};
        JOptionPane.showOptionDialog(null,
                "You are awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responses,
                0);
    }
}
