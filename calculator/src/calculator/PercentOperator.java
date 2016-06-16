package calculator;

public class PercentOperator implements UnaryOperator {

	@Override
	public double calculate(double a) {
		return a/100;
	}

}
