package gildedrose;

import gildedrose.items.AgedBrie;

import org.junit.Test;

public class AgedBrieTest {

	@Test
	public void testQualityCannotExcedeFifty() {
		AgedBrie agedBrie = new AgedBrie(Constants.AGED_BRIE, 15, 50);
		agedBrie.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.AGED_BRIE, 14, 50,
				agedBrie);

	}

	@Test
	public void testQualityOfAgedBrieCannotExedeFiftyEvenWhenIncrimentedByTwo() {
		AgedBrie agedBrie = new AgedBrie(Constants.AGED_BRIE, 0, 49);
		agedBrie.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.AGED_BRIE, -1, 50,
				agedBrie);

	}

	@Test
	public void testAgedBrieIncreasesInQuality() {
		AgedBrie agedBrie = new AgedBrie(Constants.AGED_BRIE, 4, 3);
		agedBrie.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.AGED_BRIE, 3, 4,
				agedBrie);
	}
}
