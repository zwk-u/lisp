package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class StringTerminalNode extends LispTerminalNode<String> {
    private final String value;

    public StringTerminalNode(String value) {
        this.value = value;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitStringTerminalNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String getValue() {
        return value;
    }
}
