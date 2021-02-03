import javax.swing.*;

public class userInterfaceInput extends JFrame {

    JFrame frame = new JFrame();
    JOptionPane pane = new JOptionPane();
    JButton button = new JButton();

    userInterfaceInput(){
        button.setText("Click Here");
        pane.setName("User Interface");
        pane.add(button);
        frame.add(pane);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.getDefaultCloseOperation();

    }

}
