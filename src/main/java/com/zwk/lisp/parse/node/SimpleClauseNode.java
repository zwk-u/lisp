package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleClauseNode extends LispNode{
    private ValueExpressionNode cond;

    public SimpleClauseNode(ValueExpressionNode cond) {
        this.cond = cond;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitSimpleClauseNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(cond);
    }
}
