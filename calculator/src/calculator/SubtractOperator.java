package calculator;

public class SubtractOperator implements BinaryOperator {

	@Override
	public double calculate(double a, double b) {
		return a - b;
	}

}
