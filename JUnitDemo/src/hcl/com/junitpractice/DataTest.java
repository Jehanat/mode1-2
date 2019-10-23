package hcl.com.junitpractice;

import static org.junit.Assert.*;

import org.junit.Test;


public class DataTest {
	
	@Test(expected=NullPointerException.class)
	public void testNullEx(){
		Data obj=null;
		assertEquals(5,obj.sum(2, 3));
	}
	
	@Test
	public void testdiv(){
		Data objData=new Data();
		assertEquals(2,objData.div(5,2));
		
	}
	 @Test
	 (expected=ArithmeticException.class)
	 public void testDivEx() {
	
	 Data objData=new Data();
	 objData.div(5,0);
	 }
	 
	
	
	@Test
	public void testgetPropertyTest(){
		Data objData=new Data();
		assertNull(objData.getPropertyTest("Shrey"));
		assertNotNull(objData.getPropertyTest("Jehanat"));
	}
	@Test
	public void testeven(){
		Data objData=new Data();
		assertTrue(objData.even(6));
		assertFalse(objData.even(5));
	}
	
	@Test
	public void testminArray(){
		Data objData=new Data();
		int[] a=new int[]{1,2,3,4,5};
		int[] a1=new int[]{11,88,78,43,1};
		
		assertEquals(1,objData.minArray(a1));

		
	}
	
	
	@Test
	public void testMax3(){
		Data objData=new Data();
		assertEquals(5,objData.max3(5,1, 3));
		assertEquals(5,objData.max3(1,5, 3));
		assertEquals(5,objData.max3(1, 3,5));
	}
	@Test
	public void testSum(){
		Data objData=new Data();
		assertEquals(4,objData.sum(2,2));
		assertEquals(4,objData.sum(1, 3));
	}

	@Test
	public void testSayHello(){
		Data objData=new Data();
		assertEquals("Welcome to JUnit",objData.sayHello());
	}

}
