package analyzer.operations;

import analyzer.Argument;
import analyzer.SemanticException;
import symbolTable.Type;

public class EqualOp extends Operator {
    public EqualOp(Type[] types) {
        super(types);
    }

    @Override
    protected void Op(Argument leftArg, Argument rightArg, String label) throws SemanticException {

    }
}