package core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JUNITStack {

	@Test
	void test() {
		
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0,size);
		assertTrue(s1.isEmpty());
		
	}
	@Test 
	void testpush() {
		Stack s2 = new Stack();
		s2.push(1);
		
		assertEquals(1, s2.Top());
		
	}
	@Test
	void testpop() {
		Stack s3 = new Stack();
		assertNul(s3.pop());
		
		s3.push("ELE 1");
		s3.push("ELE 2");
		
		assertEquals("ELE 2", s3.pop());
		assertEquals(1, s3.getSize());
		assertEquaks("ELE 1", s3.pop());
		assertTrue(s3.isEmpty());
	
	}


}
