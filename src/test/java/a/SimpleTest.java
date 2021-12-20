package a;

import com.zwk.lisp.impl.MyLispNodeVisitor;
import com.zwk.lisp.parse.Parser;

public class SimpleTest {
    public static void main(String[] args) {
        Parser parser = new Parser("(CASE (AND (= 123 (INT 1)) (=456 'zs')) 2 3 4)");
        StringBuilder parse = parser.parse(new MyLispNodeVisitor(), null);
        System.out.println();
        System.out.println("parse = " + parse);
    }
}
