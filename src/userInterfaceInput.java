import javax.swing.*;

public class userInterfaceInput extends JFrame {

    JFrame frame = new JFrame("User Interface");
    JButton button = new JButton();

    userInterfaceInput(){
        button.setText("Click Here");
        frame.add(button);
        frame.setVisible(true);
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.getDefaultCloseOperation();

    }

}
