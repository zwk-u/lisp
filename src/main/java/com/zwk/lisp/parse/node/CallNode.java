package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class CallNode extends LispNode {
    private IdTerminalNode funcName;
    private List<CommonExpressionNode> commonExpressions;

    public CallNode(IdTerminalNode funcName, List<CommonExpressionNode> commonExpressions) {
        this.funcName = funcName;
        this.commonExpressions = commonExpressions;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitCallNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        List<LispNode> result = new ArrayList<>();
        result.add(funcName);
        result.addAll(commonExpressions);
        return result;
    }

    public IdTerminalNode getFuncName() {
        return funcName;
    }

    public List<CommonExpressionNode> getCommonExpressions() {
        return commonExpressions;
    }
}
