package homeworks.homework2_1;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula f = this.target.newFormula();
        f.addOperand((double) arg0);
        f.addOperand((double) arg1);
        f.calculate(Calculator.Operation.SUM);
        return (int) f.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula f = this.target.newFormula();
        f.addOperand((double) arg0);
        f.addOperand((double) arg1);
        f.calculate(Calculator.Operation.MULT);
        return (int) f.result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula f = this.target.newFormula();
        f.addOperand((double) a);
        f.addOperand((double) b);
        f.calculate(Calculator.Operation.POW);
        return (int) f.result();
    }
}
