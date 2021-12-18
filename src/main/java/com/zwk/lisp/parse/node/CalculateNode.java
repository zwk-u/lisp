package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Arrays;
import java.util.List;

public class CalculateNode extends ParseExpressionNode {
    private OperatorTerminalNode operator;
    private LispNode left;
    private LispNode right;

    public CalculateNode(OperatorTerminalNode operator, LispNode left, LispNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitCalculateNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Arrays.asList(operator, left, right);
    }

    public OperatorTerminalNode getOperator() {
        return operator;
    }

    public LispNode getLeft() {
        return left;
    }

    public LispNode getRight() {
        return right;
    }
}
