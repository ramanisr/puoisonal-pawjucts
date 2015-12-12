package gildedrose.items;

public class ConstantDegradeItem extends UpdateableItem{

	public ConstantDegradeItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {
		if (quality > 0)
		{	quality--;
		
		}
		if (sellIn <= 0)
		{	
			quality--;
		}
		sellIn--;
	}
}
