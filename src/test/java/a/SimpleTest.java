package a;

import com.zwk.lisp.impl.MyLispNodeVisitor;
import com.zwk.lisp.parse.Parser;

public class SimpleTest {
    public static void main(String[] args) {
        Parser parser = new Parser("(> (CAST VARCHAR 123) (ORIGIN 'date \\'2021-12-10\\''))");
        StringBuilder parse = parser.parse(new MyLispNodeVisitor(), null);
        System.out.println();
        System.out.println("parse = " + parse);
    }
}
