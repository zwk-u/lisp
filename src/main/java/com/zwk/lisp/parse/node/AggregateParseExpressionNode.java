package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class AggregateParseExpressionNode extends ParseExpressionNode {
    private AggregateNode node;

    public AggregateParseExpressionNode(AggregateNode node) {
        this.node = node;
        setChildrenParent();
    }


    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitAggregateExpression(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(node);
    }
}
