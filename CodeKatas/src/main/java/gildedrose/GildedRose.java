package gildedrose;

import java.util.ArrayList;

import gildedrose.items.Item;
import gildedrose.items.UpdateableItem;

public class GildedRose {
	ArrayList<Item> items;

	public GildedRose(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void updateQuality() {
		for (Item item : items) {
			if(item instanceof UpdateableItem)
				((UpdateableItem)(item)).updateQuality();
		}
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
}
