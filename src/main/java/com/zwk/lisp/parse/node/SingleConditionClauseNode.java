package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Arrays;
import java.util.List;

public class SingleConditionClauseNode extends ConditionClauseNode {
    private OperatorTerminalNode op;
    private IntTerminalNode id;
    private ValueExpressionNode cond;

    public SingleConditionClauseNode(OperatorTerminalNode op, IntTerminalNode id, ValueExpressionNode cond) {
        this.op = op;
        this.id = id;
        this.cond = cond;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitSingleConditionClauseNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Arrays.asList(op, id, cond);
    }

    public OperatorTerminalNode getOp() {
        return op;
    }

    public IntTerminalNode getId() {
        return id;
    }

    public ValueExpressionNode getCond() {
        return cond;
    }
}
