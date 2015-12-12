package gildedrose;

import gildedrose.items.Item;
import gildedrose.items.UpdateableItem;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}
	
	public void updateQuality() {
		for (Item item : items) {
			if(item instanceof UpdateableItem)
				((UpdateableItem)(item)).updateQuality();
		}
	}
	
}
