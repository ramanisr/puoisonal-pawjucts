package gildedrose.items;

public class Conjures extends UpdateableItem {

	public Conjures(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {
		if (sellIn > 0){
			quality = quality - 2;
		}
		else 
		{
			quality = quality - 4;
		}
		sellIn--;
	}
}
