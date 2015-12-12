package gildedrose;

import gildedrose.items.Sulfuras;

import org.junit.Test;

public class SulfurasTest {
	
	@Test
	public void testSulfurasQualityDoesntChange() {
		Sulfuras item = new Sulfuras(Constants.SULFURAS, 0, 80);
		item.updateQuality();
		TestUtils.assertItemNameSellInAndQualityAs(Constants.SULFURAS, 0, 80, item);

	}

}
