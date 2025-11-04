package lab4.visitor;

import lab4.cor.UIButton;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

// Custom UI rendering
public class DrawVisitor implements Visitor {
    public DrawVisitor(Graphics2D graphics) {
        g2d = graphics;
    }

    @Override
    public void visit(UIButton button) {
        Rectangle rect = button.getRectangle();
        int x = rect.x;
        int y = rect.y;
        int width = rect.width;
        int height = rect.height;

        // Draw rectangle
        g2d.setColor(button.getColor());
        g2d.fillRect(x, y, width, height);

        // Draw border
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x, y, width, height);

        // Draw text
        g2d.drawString(button.getLabel(),
                x + width / 4,
                y + height / 2);
    }

    private Graphics2D g2d;
}
