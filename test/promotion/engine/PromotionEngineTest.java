package promotion.engine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PromotionEngineTest {

	@Test
	public void test1() {
		PromotionEngine.main(null);
		assertEquals(PromotionEngine.TotalAmount, 0);
	}

}
