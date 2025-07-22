import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonGridPopup {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("3x3 Button Grid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3));
        
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Button " + i);
            button.addActionListener(new ButtonClickListener(i));
            frame.add(button);
        }
        
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    static class ButtonClickListener implements ActionListener {
        private int buttonNumber;
        
        public ButtonClickListener(int buttonNumber) {
            this.buttonNumber = buttonNumber;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Button " + buttonNumber + " clicked!");
        }
    }
}