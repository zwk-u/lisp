package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class SimpleCaseNode extends CaseNode{
    private IntTerminalNode id;
    private List<WhenClauseNode> whenClauses;
    private ValueExpressionNode elseValue;

    public SimpleCaseNode(IntTerminalNode id, List<WhenClauseNode> whenClauses, ValueExpressionNode elseValue) {
        this.id = id;
        this.whenClauses = whenClauses;
        this.elseValue = elseValue;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitSimpleCaseNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        List<LispNode> result = new ArrayList<>();
        result.add(id);
        result.addAll(whenClauses);
        if (elseValue != null) {
            result.add(elseValue);
        }
        return result;
    }

    public IntTerminalNode getId() {
        return id;
    }

    public List<WhenClauseNode> getWhenClauses() {
        return whenClauses;
    }

    public ValueExpressionNode getElseValue() {
        return elseValue;
    }
}
