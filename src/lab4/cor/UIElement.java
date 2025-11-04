package lab4.cor;

import lab4.visitor.Visitor;

import java.awt.event.MouseEvent;

public interface UIElement {
    void accept(Visitor visitor);

    // For chain of responsibility
    boolean handleMouseEvent(MouseEvent e);
}
