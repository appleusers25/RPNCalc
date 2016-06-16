package calculator;

import java.util.Stack;

public class Calculator {
	
	public double calculate(String exp) throws Exception {
		
		String[] input = exp.split(",");
		Stack<Double> intStack = new Stack<Double>();
		
		for (int i=0; i<input.length; i++) {
			if (isDouble(input[i])) {
				intStack.push(Double.parseDouble(input[i]));
			} else {
				Operator operator = OperatorFactory.getOperator(input[i]);
				double temp = intStack.pop();
				
			    switch ((String)input[i]) {
			    	case "!":
			    	case "%":
			    		intStack.push(((UnaryOperator) operator).calculate(temp));
			    		break;
		    		default:
		    			intStack.push(((BinaryOperator) operator).calculate(intStack.pop(), temp));
		    			break;
			    }
			}
		}
		if (intStack.size() > 1) {
			throw new Exception("Stack contains more than 1");
		}
		double result = intStack.pop();
		return result;
	}
	
	private static boolean isDouble(String s) {
	    try { 
	        Double.parseDouble(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }  
	    // only got here if we didn't return false
	    return true;
	}
}
