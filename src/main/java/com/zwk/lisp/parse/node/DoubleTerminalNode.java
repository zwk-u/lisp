package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class DoubleTerminalNode extends LispTerminalNode<Double>{
    private Double value;

    public DoubleTerminalNode(Double value) {
        this.value = value;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitDoubleTerminalNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public Double getValue() {
        return value;
    }
}
