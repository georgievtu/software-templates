package lab4.visitor;

import lab4.cor.UIButton;

public interface Visitor {
    // Visitor pattern
    // Can overload method for different UI elements
    void visit(UIButton button);
}
