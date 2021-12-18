package com.zwk.lisp.parse.node;

public abstract class LispTerminalNode<R> extends LispNode {
  public abstract R getValue();
}
