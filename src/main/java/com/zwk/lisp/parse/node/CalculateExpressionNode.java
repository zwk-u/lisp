package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class CalculateExpressionNode extends LispNode{
    private CalculateNode calculate;

    public CalculateExpressionNode(CalculateNode calculate) {
        this.calculate = calculate;
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitCalculateExpressionNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(calculate);
    }

}
