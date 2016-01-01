package gildedrose;

import gildedrose.items.Conjured;

import org.junit.Test;

public class ConjuredTest {

	@Test
	public void testConjuredDegradesTwiceAsFast() {
		Conjured item = new Conjured(Constants.CONJURED, 4, 30);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.CONJURED, 3, 28,
				item);

	}

	@Test
	public void testConjuredDegradesTwiceAsFastAfterExperation() {
		Conjured item = new Conjured(Constants.CONJURED, 0, 30);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.CONJURED, -1, 26,
				item);
	}

}
