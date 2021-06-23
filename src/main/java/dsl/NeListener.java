package dsl;

import model.PrintStatement;
import model.Statement;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NeListener extends NorthEastParserBaseListener {
    Statement statement;

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override public void enterVartype(NorthEastParser.VartypeContext ctx) {
        System.out.println("enter vartype");
    }
    @Override public void exitVartype(NorthEastParser.VartypeContext ctx) { }

    @Override public void enterStatement(NorthEastParser.StatementContext ctx) {

    }
    @Override public void exitStatement(NorthEastParser.StatementContext ctx) { }
    @Override public void enterPrintstatement(NorthEastParser.PrintstatementContext ctx) {
        PrintStatement printStatement = new PrintStatement();
        if(ctx.STRING() != null) {
            printStatement.setPrintContent(ctx.STRING().getText().substring(2, ctx.STRING().getText().length() - 2));
            this.setStatement(printStatement);
        }

    }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    @Override public void visitTerminal(TerminalNode node) { }
    @Override public void visitErrorNode(ErrorNode node) { }
}
