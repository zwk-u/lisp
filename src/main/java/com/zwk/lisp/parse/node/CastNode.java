package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Arrays;
import java.util.List;

public class CastNode extends LispNode {
    private IdTerminalNode type;
    private IntTerminalNode id;

    public CastNode(IdTerminalNode type, IntTerminalNode id) {
        this.type = type;
        this.id = id;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitCastNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Arrays.asList(type, id);
    }

    public IdTerminalNode getType() {
        return type;
    }

    public IntTerminalNode getId() {
        return id;
    }
}
