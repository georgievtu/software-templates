package lab4.cor;

import lab4.visitor.DrawVisitor;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class UIPanel extends JPanel {
    public UIPanel() {
        elements = new ArrayList<>();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                for (UIElement element : elements) {
                    if (element.handleMouseEvent(e)) {
                        repaint();
                        // Stop once handled
                        break;
                    }
                }
            }
        });
    }

    public void addElement(UIElement element) {
        elements.add(element);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        DrawVisitor drawVisitor = new DrawVisitor((Graphics2D) g);
        // TODO Visit each element with the draw visitor
    }

    private final List<UIElement> elements;
}
