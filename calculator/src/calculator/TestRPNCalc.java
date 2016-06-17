package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRPNCalc {
	
	private static final double DELTA = 1e-15;

	@Test
	public void sumOfTwoInteger() throws Exception {
		String exp = "2,2,+";
		
		Calculator calc = new Calculator();
		
		assertEquals(4, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void sumOfThreeInteger() throws Exception {
		String exp = "2,2,3,+,+";
		
		Calculator calc = new Calculator();
		
		assertEquals(7, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void sumAndSubThreeInteger() throws Exception {
		String exp = "2,2,3,+,-";
		
		Calculator calc = new Calculator();
		
		assertEquals(-3, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void sumOfFloat() throws Exception {
		String exp = "2.1,0.9,+";
		
		Calculator calc = new Calculator();
		
		assertEquals(3, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void sumAndSubOfFloat() throws Exception {
		String exp = "5,0.9,2.1,+,-";
		
		Calculator calc = new Calculator();
		
		assertEquals(2, calc.calculate(exp), DELTA);
	}
	
	@Test(expected = Exception.class) 
	public void onlyOperators() throws Exception {
		String exp = "*,-,/,+";
		
		Calculator calc = new Calculator();
		
		assertEquals(1, calc.calculate(exp), DELTA);
	}
	
	@Test(expected = Exception.class) 
	public void onlyNumbers() throws Exception {
		String exp = "1,1,1,1,1";
		
		Calculator calc = new Calculator();
		
		assertEquals(1, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void factorial() throws Exception {
		String exp = "5,!";
		
		Calculator calc = new Calculator();
		
		assertEquals(120, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void test1() throws Exception {
		String exp = "1,2,3,+,-";
		
		Calculator calc = new Calculator();
		
		assertEquals(-4, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void test2() throws Exception {
		String exp = "6,2,*,3,/";
		
		Calculator calc = new Calculator();
		
		assertEquals(4, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void test3() throws Exception {
		String exp = "2,3,^,4,5,+,+";
		
		Calculator calc = new Calculator();
		
		assertEquals(17, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void test4() throws Exception {
		String exp = "50,%,2,*";
		
		Calculator calc = new Calculator();
		
		assertEquals(1, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void test5() throws Exception {
		String exp = "3,!,4,5,*,+";
		
		Calculator calc = new Calculator();
		
		assertEquals(26, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void test6() throws Exception {
		String exp = "12,3,/,!";
		
		Calculator calc = new Calculator();
		
		assertEquals(24, calc.calculate(exp), DELTA);
	}
	
	@Test
	public void test7() throws Exception {
		String exp = "5,1,2,+,4,*,+,3,-";
		
		Calculator calc = new Calculator();
		
		assertEquals(14, calc.calculate(exp), DELTA);
	}
	
	@Test(expected = Exception.class) 
	public void Fail1() throws Exception {
		String exp = "";
		
		Calculator calc = new Calculator();
		
		assertEquals(1, calc.calculate(exp), DELTA);
	}
	
	@Test(expected = Exception.class) 
	public void Fail2() throws Exception {
		String exp = "+,2,2";
		
		Calculator calc = new Calculator();
		
		assertEquals(1, calc.calculate(exp), DELTA);
	}
	
	@Test(expected = Exception.class) 
	public void Fail3() throws Exception {
		String exp = "2,+,2";
		
		Calculator calc = new Calculator();
		
		assertEquals(1, calc.calculate(exp), DELTA);
	}
	
	@Test(expected = Exception.class) 
	public void Fail4() throws Exception {
		String exp = "2,2,+,2";
		
		Calculator calc = new Calculator();
		
		assertEquals(4, calc.calculate(exp), DELTA);
	}
	
	@Test(expected = Exception.class) 
	public void Fail5() throws Exception {
		String exp = "2,2,+,+";
		
		Calculator calc = new Calculator();
		
		assertEquals(1, calc.calculate(exp), DELTA);
	}

}
