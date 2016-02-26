package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}
	
	@Before
	public void setUp() throws Exception{
	}
	
	@After 
	public void tearDown() throws Exception{
	}
	
	@Test
	public void testisEven(){	
		assertTrue(MyInteger.isEven(8));
		assertFalse(MyInteger.isEven(11));
		
		MyInteger TestValue = new MyInteger(2);
		boolean ExpectedResult = true;
		boolean result = TestValue.isEven();
		assertEquals("Test isEven() failed",ExpectedResult, result);
	}
	@Test
	public void testisOdd(){
		assertTrue(MyInteger.isOdd(5));
		assertFalse(MyInteger.isOdd(8));
		
		MyInteger TestValue = new MyInteger(5);
		boolean ExpectedResult = true;
		boolean result = TestValue.isOdd();
		assertEquals("Test isOdd() failed", ExpectedResult, result);
	}
	@Test
	public void testisPrime(){
		assertTrue(MyInteger.isPrime(13));
				
		MyInteger TestValue = new MyInteger(13);
		boolean ExpectedResult = true;
		boolean result = TestValue.isPrime();
		assertEquals("Test isPrime() failed", ExpectedResult, result);
	}
	@Test
	public void testisPrime2(){
		MyInteger TestValue = new MyInteger(1);
		boolean ExpectedResult = false;
		boolean result = TestValue.isPrime();
		assertEquals("Test isPrime() failed", ExpectedResult, result);
		
		MyInteger TestValue2 = new MyInteger (41);
		assertTrue(MyInteger.isPrime(TestValue2));
	}
	
	@Test
	public void testequals(){
		MyInteger TestValue = new MyInteger(8);
		assertTrue(TestValue.equals(8));
		assertFalse(TestValue.equals(2));
		
		assertTrue(TestValue.equals(TestValue));
		
	}

	}
	
	
	
	

