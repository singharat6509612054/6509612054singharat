package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStack {

	@Test
	void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack(10);
		int size = s1.getSize();
		
		assertEquals(0,size);
		assertTrue(s1.isEmpty());
		//fail("Not yet implemented");
	}
	
	@Test
	void testPushElmToTop() {
		
		
		
		Stack s2 = new Stack(10);
		
		assertFalse(s2.isFull());
		
		String str ="k";
		s2.push(str);
		
		assertEquals("k",s2.top());
		
	}
	
	@Test
	void testPushDifferentElmTypeToStack() {
		
		 
		Stack s3 = new Stack(10);
		
		int i=1;
		String str="k";
		
		s3.push(i);
		s3.push(str);
		
		fail("All elements in the stack must be of the sametype.");
		
	}
	
	@Test
	void testLastInFirstOut(){
		
		Stack s4 = new Stack(4);
		
		s4.push(1);
		s4.push(2);
		s4.push(3);
		assertEquals(3,s4.pop());
		assertEquals(2,s4.pop());
		assertEquals(1,s4.pop());
	
	}
	
	
	
	@Test
	void testPushToFullStack(){
		
		Stack s5 = new Stack(3);
		
		s5.push(1);
		s5.push(2);
		s5.push(3);
		
		s5.push(4);
		
	}
}
