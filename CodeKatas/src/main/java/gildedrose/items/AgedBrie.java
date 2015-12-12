package gildedrose.items;

public class AgedBrie extends UpdateableItem{

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void updateQuality() 
	{
		if(quality < 50) 
		{
			quality++;
		}
		if(sellIn <= 0 && quality < 50)
		{
			quality++;
		}
		sellIn--;
	}

}
