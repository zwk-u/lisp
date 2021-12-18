package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class IdTerminalNode extends LispTerminalNode<String>{
    private String identifier;

    public IdTerminalNode(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitIdTerminalNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String getValue() {
        return identifier;
    }
}
