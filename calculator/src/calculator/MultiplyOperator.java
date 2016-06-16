package calculator;

public class MultiplyOperator implements BinaryOperator {

	@Override
	public double calculate(double a, double b) {
		return a * b;
	}

}
