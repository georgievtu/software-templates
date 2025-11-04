package lab4.cor;

import lab4.command.Command;
import lab4.visitor.Visitor;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class UIButton implements UIElement {
    public UIButton(Rectangle rectangle, String label) {
        this.rectangle = rectangle;
        this.label = label;
        this.color = Color.RED;
    }

    public void setOnClickCommand(Command command) {
        // TODO Command passes a function to execute rather than data
        // TODO Set the onClickCommand
    }

    public boolean contains(Point p) {
        return rectangle.contains(p);
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Call the visit method with the button as the parameter
    }

    @Override
    public boolean handleMouseEvent(MouseEvent e) {
        if (contains(e.getPoint()) && e.getID() == MouseEvent.MOUSE_CLICKED) {
            // TODO Set the color of the button to blue when clicked
            // TODO Then execute the onClickCommand (if it has been set)

            // Event handled
            return true;
        }
        // Pass to next handler in the chain of responsibility
        return false;
    }

    // Getters for rendering
    public Rectangle getRectangle() {
        return rectangle;
    }

    public String getLabel() {
        return label;
    }

    public Color getColor() {
        return color;
    }

    private final Rectangle rectangle; // Size and position
    private final String label;
    private Command onClickCommand;
    private Color color;
}
