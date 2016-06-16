package calculator;

public class AddOperator implements BinaryOperator {

	@Override
	public double calculate(double a, double b) {
		return a + b;
	}
	
};
