// Be Blessed App V1
// Marlon J Peters 5.17.2025
// email : mjpcoder_type@outlook.com
// Application accepts a name input and prints out a message using that name

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlessingApp {

    public static void main(String[] args) {
        // Create frame using JFrame class
        JFrame frame = new JFrame("Blessing App");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel navy blue background
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 128));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Heading label...very similar to H1 in HTML..pretty cool in my eyes...shows how connected a lot of this stuff is
        JLabel heading = new JLabel("Go Forward With Blessings");
        heading.setAlignmentX(Component.CENTER_ALIGNMENT);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Serif", Font.BOLD, 20));
        panel.add(heading);

        // Give a little extra space
        panel.add(Box.createRigidArea(new Dimension(0, 40)));

        // My text field label!
        JLabel nameLabel = new JLabel("Enter Your Name:");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nameLabel);

        // The glorious text input field itself!
        JTextField nameField = new JTextField(20);
        nameField.setMaximumSize(new Dimension(300, 30));
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(nameField);

        // This is giving me CSS vibes!
        panel.add(Box.createRigidArea(new Dimension(0, 40)));

        // Blessing label where text will appear...anyone familiar with Javascript will understand this dynamic move!
        JLabel blessingLabel = new JLabel("");
        blessingLabel.setForeground(Color.WHITE);
        blessingLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(blessingLabel);

        // Action Listener (Enter key in this instance)
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredName = nameField.getText().trim();
                if (!enteredName.isEmpty()) {
                    blessingLabel.setText("Be blessed, " + enteredName);
                }
            }
        });

        // frame and display panel
        frame.add(panel);
        frame.setVisible(true);
    }
}
