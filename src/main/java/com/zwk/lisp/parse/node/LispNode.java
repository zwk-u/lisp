package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.List;

public abstract class LispNode {
    protected LispNode parent;

    public abstract <C, R> R visit(LispNodeVisitor<C, R> visitor, C context);

    public abstract List<LispNode> getChildren();

    public <C, R> R accept(LispNodeVisitor<C, R> visitor, C context) {
        return visit(visitor, context);
    }

    protected void setChildrenParent() {
        getChildren().forEach(node -> node.setParent(this));
    }

    public void setParent(LispNode parent) {
        this.parent = parent;
    }
}
