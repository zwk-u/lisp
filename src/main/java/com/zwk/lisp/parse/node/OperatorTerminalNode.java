package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class OperatorTerminalNode extends LispTerminalNode<String> {
    private final String operator;

    public OperatorTerminalNode(String operator) {
        this.operator = operator;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitOperatorTerminalNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String getValue() {
        return operator;
    }
}
