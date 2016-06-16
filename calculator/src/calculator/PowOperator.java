package calculator;

public class PowOperator implements BinaryOperator {

	@Override
	public double calculate(double a, double b) {
		return Math.pow(a, b);
	}
	
}
