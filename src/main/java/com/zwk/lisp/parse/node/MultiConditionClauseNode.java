package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Arrays;
import java.util.List;

public class MultiConditionClauseNode extends ConditionClauseNode {
    private OperatorTerminalNode op;
    private ConditionClauseNode left;
    private ConditionClauseNode right;

    public MultiConditionClauseNode(OperatorTerminalNode op, ConditionClauseNode left, ConditionClauseNode right) {
        this.op = op;
        this.left = left;
        this.right = right;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitMultiConditionClauseNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Arrays.asList(op, left, right);
    }

    public OperatorTerminalNode getOp() {
        return op;
    }

    public ConditionClauseNode getLeft() {
        return left;
    }

    public ConditionClauseNode getRight() {
        return right;
    }
}
