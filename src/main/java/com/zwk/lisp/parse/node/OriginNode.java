package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class OriginNode extends LispNode {
    private StringTerminalNode literal;

    public OriginNode(StringTerminalNode literal) {
        this.literal = literal;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitOriginNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(literal);
    }

    public StringTerminalNode getLiteral() {
        return literal;
    }
}
