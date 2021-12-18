package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class Lisp extends LispNode{
    ParseExpressionNode parseExpressionNode;

    public Lisp(ParseExpressionNode parseExpressionNode) {
        this.parseExpressionNode = parseExpressionNode;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitLisp(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(parseExpressionNode);
    }
}
