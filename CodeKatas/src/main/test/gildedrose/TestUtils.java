package gildedrose;

import static org.junit.Assert.assertEquals;
import gildedrose.items.UpdateableItem;

public class TestUtils {

	public static void assertItemNameSellInAndQualityAs(String name, int sellin,
			int quality, UpdateableItem items) 
	{
		assertEquals(name, items.name);
		assertEquals(sellin, items.sellIn);
		assertEquals(quality, items.quality);
	} 
}
