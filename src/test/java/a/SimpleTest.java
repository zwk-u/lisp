package a;

import com.zwk.lisp.impl.MyLispNodeVisitor;
import com.zwk.lisp.parse.Parser;

public class SimpleTest {
    public static void main(String[] args) {
        Parser parser = new Parser("(call concat 123 (case 123 (4) 5))");
        StringBuilder parse = parser.parse(new MyLispNodeVisitor(), null);
        System.out.println();
        System.out.println("parse = " + parse);
    }
}
