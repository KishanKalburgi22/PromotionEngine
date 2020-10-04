package promotion.engine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class PromotionEngineTest {

	@AfterEach
	public void reset() {
		PromotionEngine.TotalAmount = 0;
	}

	@Test
	public void test1() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "1-A"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 50);
	}

	@Test
	public void test2() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "1-B"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 30);
	}

	@Test
	public void test3() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "1-C"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 20);
	}

	@Test
	public void test4() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "1-D"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 15);
	}

	@Test
	public void test5() {
		String simulatedUserInput = "2" + System.getProperty("line.separator") + "1-A"
				+ System.getProperty("line.separator") + "1-B" + System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 80);
	}

	@Test
	public void test6() {
		String simulatedUserInput = "3" + System.getProperty("line.separator") + "1-A"
				+ System.getProperty("line.separator") + "1-B" + System.getProperty("line.separator") + "1-C"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 100);
	}

	@Test
	public void test7() {
		String simulatedUserInput = "3" + System.getProperty("line.separator") + "1-A"
				+ System.getProperty("line.separator") + "1-B" + System.getProperty("line.separator") + "1-D"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 95);
	}

	@Test
	public void test8() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "3-A"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 130);
	}

	@Test
	public void test9() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "2-B"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 45);
	}

	@Test
	public void test10() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "4-A"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 180);
	}

	@Test
	public void test11() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "3-B"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 75);
	}

	@Test
	public void test12() {
		String simulatedUserInput = "2" + System.getProperty("line.separator") + "1-C"
				+ System.getProperty("line.separator") + "1-D" + System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 15);
	}

	@Test
	public void test13() {
		String simulatedUserInput = "2" + System.getProperty("line.separator") + "2-C"
				+ System.getProperty("line.separator") + "1-D" + System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 35);
	}

	@Test
	public void test14() {
		String simulatedUserInput = "4" + System.getProperty("line.separator") + "1-A"
				+ System.getProperty("line.separator") + "1-B" + System.getProperty("line.separator") + "1-C"
				+ System.getProperty("line.separator") + "1-D" + System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 95);
	}

	@Test
	public void test15() {
		String simulatedUserInput = "4" + System.getProperty("line.separator") + "4-A"
				+ System.getProperty("line.separator") + "5-B" + System.getProperty("line.separator") + "3-C"
				+ System.getProperty("line.separator") + "2-D" + System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 350);
	}

}
