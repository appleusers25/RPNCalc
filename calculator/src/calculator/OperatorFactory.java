package calculator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {
	
	@SuppressWarnings("serial")
	private static final Map<String, Operator> factoryMap = 
		Collections.unmodifiableMap(new HashMap<String, Operator> () {{
			put("+", new AddOperator());
			put("-", new SubtractOperator());
			put("*", new MultiplyOperator());
			put("/", new DivideOperator());
			put("^", new PowOperator());
			put("!", new FactorialOperator());
			put("%", new PercentOperator());
		}});
	
	public static Operator getOperator(String string) throws Exception {
		Operator operator = factoryMap.get(string); 
		if (operator == null) {
	        throw new Exception();
	    }
	    return operator;
	}
}
