package juintdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddNumbersTest {

	@Test
	void test() {
		AddNumbers a = new AddNumbers();
		assertEquals(30, a.addtwoNumbers(15, 15));
		
	}
	@Test
	void test2() {
		AddNumbers a = new AddNumbers();
		assertEquals(40, a.addtwoNumbers(15, 25));
		
	}

}
