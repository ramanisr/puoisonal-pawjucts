package gildedrose.items;

public class Sulfuras extends UpdateableItem{

	public Sulfuras(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {
		quality=80;
	}
	
}
