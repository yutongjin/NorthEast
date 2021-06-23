package dsl;

import model.PrintStatement;
import model.Statement;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.*;
/*...
        ST hello = new ST("Hello, <name>!");
        hello.add("name", "World");
        String output = hello.render();
        System.out.println(output);*/
public class NeEngine {
    public String compile(String input) {
        NorthEastLexer lexer = new NorthEastLexer(CharStreams.fromString(input));
        NorthEastParser parser = new NorthEastParser(new CommonTokenStream(lexer));
        //System.out.println(parser);
        NeListener neListener = new NeListener();
        ParseTree parseTree = parser.spec();
        ParseTreeWalker.DEFAULT.walk(neListener, parseTree);
        Statement statement = neListener.getStatement();
        //System.out.println(((PrintStatement)statement).getPrintContent());
        // load relative directory of templates
        STGroup g = new STGroupDir("StringTemplate/java");
        String result = g.getInstanceOf("demo").add("st", statement).render();
        //System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        //new NeEngine().compile();
    }
}
