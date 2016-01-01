package gildedrose;

import java.util.ArrayList;

import gildedrose.items.AgedBrie;
import gildedrose.items.BackstagePasses;
import gildedrose.items.Conjured;
import gildedrose.items.ConstantDegradeItem;
import gildedrose.items.Item;
import gildedrose.items.Sulfuras;

public class TextTestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        ArrayList<Item> items = new  ArrayList<Item>();

        items.add(new ConstantDegradeItem("+5 Dexterity Vest", 10, 20));
        items.add(new AgedBrie("Aged Brie", 2, 0));
        items.add(new ConstantDegradeItem("Elixir of the Mongoose", 5, 7));
        items.add(new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        items.add(new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        items.add(new Conjured("Conjured Mana Cake", 3, 6) );

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}