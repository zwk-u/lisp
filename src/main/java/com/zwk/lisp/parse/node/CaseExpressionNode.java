package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class CaseExpressionNode extends ParseExpressionNode {
    private CaseNode caseNode;

    public CaseExpressionNode(CaseNode caseNode) {
        this.caseNode = caseNode;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitCaseExpressionNode(this, context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(caseNode);
    }

    public CaseNode getCaseNode() {
        return caseNode;
    }
}
