package gildedrose;

import gildedrose.items.ConstantDegradeItem;

import org.junit.Test;

public class ConstantDegradeItemTest {

	@Test
	public void testQualityOfAnItemDecreases() {
		ConstantDegradeItem item = new ConstantDegradeItem("SomeItem", 15, 1);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs("SomeItem", 14, 0, item);
	}

	@Test
	public void testQualityOfAnItemCanNeverBeNagative() {
		ConstantDegradeItem item = new ConstantDegradeItem("SomeItem", 15, 0) ;
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs("SomeItem", 14, 0, item);
	}

	@Test
	public void testQualityDegradesTwiceAsFastAfterSellByDate() {
		ConstantDegradeItem item = new ConstantDegradeItem("SomeItem", 0, 10) ;
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs("SomeItem", -1, 8, item);
	}



}
