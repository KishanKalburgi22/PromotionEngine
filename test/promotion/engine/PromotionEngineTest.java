package promotion.engine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

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
		String simulatedUserInput = "2" + System.getProperty("line.separator") + "1-A"
				+ System.getProperty("line.separator") + "1-B" + System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 80);
	}

	@Test
	public void test4() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "3-A"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 130);
	}

	@Test
	public void test5() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "2-B"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 45);
	}

	@Test
	public void test6() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "4-A"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 180);
	}

	@Test
	public void test7() {
		String simulatedUserInput = "1" + System.getProperty("line.separator") + "3-B"
				+ System.getProperty("line.separator");
		InputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());
		System.setIn(in);
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 75);
	}

}
