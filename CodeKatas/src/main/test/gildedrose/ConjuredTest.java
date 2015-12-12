package gildedrose;

import gildedrose.items.Conjures;

import org.junit.Test;

public class ConjuredTest {

	@Test
	public void testConjuredDegradesTwiceAsFast() {
		Conjures item = new Conjures(Constants.CONJURED, 4, 30);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.CONJURED, 3, 28,
				item);

	}

	@Test
	public void testConjuredDegradesTwiceAsFastAfterExperation() {
		Conjures item = new Conjures(Constants.CONJURED, 0, 30);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.CONJURED, -1, 26,
				item);
	}

}
