package a;

import com.zwk.lisp.impl.MyLispNodeVisitor;
import com.zwk.lisp.impl.PrettyString;
import com.zwk.lisp.parse.Parser;

public class SimpleTest {
    public static void main(String[] args) {
        Parser parser = new Parser("(CASE (IS 123 NULL) 0 (IS NOT 123 NULL) 1 )");
        StringBuilder parse = parser.parse(new MyLispNodeVisitor(), null);
        System.out.println();
        System.out.println("parse = " + PrettyString.removeExtraSpace(parse));
        System.out.println(PrettyString.removeExtraSpace("\t     asdf asd \t \t\r\n asdf a   \r\n\t        \t\t\t\t\t\t"));
    }
}
