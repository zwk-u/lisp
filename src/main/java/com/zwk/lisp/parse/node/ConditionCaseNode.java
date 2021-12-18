package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class ConditionCaseNode extends CaseNode {
    List<WhenClauseNode> whenClauses;
    ValueExpressionNode elseValue;

    public ConditionCaseNode(List<WhenClauseNode> whenClauses, ValueExpressionNode elseValue) {
        this.whenClauses = whenClauses;
        this.elseValue = elseValue;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitConditionCaseNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        List<LispNode> result = new ArrayList<>(whenClauses);
        if (elseValue != null) {
            result.add(elseValue);
        }
        return result;
    }

    public List<WhenClauseNode> getWhenClauses() {
        return whenClauses;
    }

    public ValueExpressionNode getElseValue() {
        return elseValue;
    }
}
