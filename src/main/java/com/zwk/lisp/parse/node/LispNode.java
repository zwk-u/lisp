package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.List;

public abstract class LispNode {
    public abstract <C, R> R visit(LispNodeVisitor<C, R> visitor, C context);

    public abstract List<LispNode> getChildren();

    public <C, R> R accept(LispNodeVisitor<C, R> visitor, C context) {
        return visit(visitor, context);
    }
}
