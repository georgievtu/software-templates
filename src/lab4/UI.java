package lab4;

import lab4.cor.UIButton;
import lab4.cor.UIPanel;

import javax.swing.JFrame;
import java.awt.Rectangle;

public class UI extends JFrame {
    public UI() {
        setTitle("Simple user interface");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Custom UI components
        UIPanel panel = new UIPanel();
        Rectangle buttonRect = new Rectangle(100, 100, 120, 150);
        UIButton button = new UIButton(buttonRect, "Click me!");

        // TODO Set a custom onClickCommand for the button
        // TODO Make it print "Clicked!" when clicked

        panel.addElement(button);
        add(panel);

        setVisible(true);
    }
}
