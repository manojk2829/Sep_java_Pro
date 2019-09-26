package june_TestNG_Pack;

import org.testng.annotations.Test;

public class Sequence_of_Running{
	@Test(priority=0)
	public void test8(){
		System.out.println("6 priority = 0 --- 0");
	}
	
	@Test
	public void test2(){
		System.out.println("4 without Priority test 2 ");
	}
	
	@Test
	public void test3(){
		System.out.println("5 without Priority test 3  ");
	}
	
	@Test(priority=-2)
	public void test4(){
		System.out.println("2 priority= -2 -2");
	}
	
	@Test(priority=-3)
	public void test33(){
		System.out.println("1  priority -3 -3");
	}
	
	@Test(priority=-1)
	public void test5(){
		System.out.println("3 priority = -1 -1");
	}
	
	@Test(priority=2)
	public void test6(){
		System.out.println("8 priority= 2 --- 2");
	}
	
	@Test(priority=1)
	public void test7(){
		System.out.println("7 priority = 1 --- 1");
	}
	
	@Test(priority=10)
	public void test70(){
		System.out.println("9 Last priority = 10");
	}
}
