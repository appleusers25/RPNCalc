package calculator;

public class FactorialOperator implements UnaryOperator {

	@Override
	public double calculate(double a) {
		if (a <= 1)
			return 1;
		else
			return a * calculate(a - 1);
	}
	
}
