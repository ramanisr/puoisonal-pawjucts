package gildedrose.items;

public class BackstagePasses extends UpdateableItem {

	public BackstagePasses(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void updateQuality() {
		if (sellIn > 0) {
			if (quality < 50)
				quality++;
			if (sellIn <= 10 && quality < 50)
				quality++;
			if (sellIn <= 5 && quality < 50)
				quality++;
		}
		else 
		{
			quality = 0;
		}
		sellIn--;
	}

}
