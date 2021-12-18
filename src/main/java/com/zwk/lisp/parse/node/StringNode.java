package com.zwk.lisp.parse.node;

import com.zwk.lisp.parse.LispNodeVisitor;

import java.util.Collections;
import java.util.List;

public class StringNode extends LispTerminalNode<String>{
    private StringTerminalNode value;

    public StringNode(StringTerminalNode value) {
        this.value = value;
        setChildrenParent();
    }

    @Override
    public <C, R> R visit(LispNodeVisitor<C, R> visitor, C context) {
        return visitor.visitStringNode(this,context);
    }

    @Override
    public List<LispNode> getChildren() {
        return Collections.singletonList(value);
    }

    @Override
    public String getValue() {
        return value.getValue();
    }
}
