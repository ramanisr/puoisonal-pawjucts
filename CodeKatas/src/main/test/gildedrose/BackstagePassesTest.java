package gildedrose;

import gildedrose.items.BackstagePasses;

import org.junit.Test;

public class BackstagePassesTest {
	@Test
	public void testBackstagePassesQualityChangeByOneIfMoreThenTenDaysLeft() {
		BackstagePasses item = new BackstagePasses(Constants.BACKSTAGE_PASSES,
				11, 30);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.BACKSTAGE_PASSES,
				10, 31, item);

	}

	@Test
	public void testBackstagePassesQualityChangeByTwoIfMoreThen5AndLessThenTenDaysLeft() {
		BackstagePasses item = new BackstagePasses(Constants.BACKSTAGE_PASSES,
				8, 30);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.BACKSTAGE_PASSES,
				7, 32, item);

	}

	@Test
	public void testBackstagePassesQualityChangeByTwoIfTenDaysLeft() {
		BackstagePasses item = new BackstagePasses(Constants.BACKSTAGE_PASSES,
				10, 30);

		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.BACKSTAGE_PASSES,
				9, 32, item);

	}

	@Test
	public void testBackstagePassesQualityChangeByTwoIfFiveDaysLeft() {
		BackstagePasses item = new BackstagePasses(Constants.BACKSTAGE_PASSES,
				5, 30);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.BACKSTAGE_PASSES,
				4, 33, item);

	}

	@Test
	public void testBackstagePassesQualityChangeByTwoIfLessThen5DaysLeft() {
		BackstagePasses item = new BackstagePasses(Constants.BACKSTAGE_PASSES,
				3, 30);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.BACKSTAGE_PASSES,
				2, 33, item);

	}

	@Test
	public void testBackstagePassesQualityChangeToZeroIfConcertIsOver() {
		BackstagePasses item = new BackstagePasses(Constants.BACKSTAGE_PASSES,
				0, 30);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.BACKSTAGE_PASSES,
				-1, 0, item);

	}
}
