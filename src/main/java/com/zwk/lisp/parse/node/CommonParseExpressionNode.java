package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class CommonParseExpressionNode extends CommonExpressionNode{
    private ParseExpressionNode parseExpression;

    public CommonParseExpressionNode(ParseExpressionNode parseExpression) {
        this.parseExpression = parseExpression;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitCommonParseExpressionNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(parseExpression);
    }
}
