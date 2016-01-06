package gildedrose.UI;

import gildedrose.Constants;
import gildedrose.GildedRose;
import gildedrose.items.AgedBrie;
import gildedrose.items.BackstagePasses;
import gildedrose.items.Conjured;
import gildedrose.items.Item;
import gildedrose.items.Sulfuras;
import gildedrose.items.UpdateableItem;

import java.util.ArrayList;
import java.util.Scanner;

public class UIServices {

	private static Scanner scanner;
	private static GildedRose gildedRose;

	public UIServices() {
		gildedRose = new GildedRose(new ArrayList<Item>());
		scanner = new Scanner(System.in);
	}

	public void awaitUserAction() {

		String inputCommand = scanner.nextLine();
		while (!inputCommand.equals(UIConstants.EXIT_KEY)) {
			if (inputCommand.equals(UIConstants.ADD_KEY))
				addItem();

			if (inputCommand.equals(UIConstants.DELETE_KEY))
				deleteItem(gildedRose.getItems());

			if (inputCommand.equals(UIConstants.ADVANCE_DAY_KEY))
				gildedRose.updateQuality();

			if (inputCommand.equals(UIConstants.DISPLAY_INVENTORY_KEY))
				gildedRose.displayInventory();

			inputCommand = scanner.nextLine();
			printOptions();

		}
	}

	// delete a given item. Identified by name
	public void deleteItem(ArrayList<Item> items) {
		System.out.println("Enter Item Name to delete");
		String itemName = scanner.nextLine();
		Boolean found = false;
		for (Item item : items) {
			if (item.name.equals(itemName)) {
				items.remove(item);
				found = true;
				if (!(items.size() > 0))
					break;
			}
		}
		if (!found)
			System.out.println("Item named " + itemName + " not found");
		else
			System.out.println("Item " + itemName + " removed");

	}

	// print intro
	public void printIntro() {
		System.out.println(UIConstants.INTRO);
		printOptions();
	}

	// print the options for user to choose
	public void printOptions() {
		System.out.println(UIConstants.CHOICES);
	}

	// resolve the item type into the correct object
	public Object resolveItemType(String itemName, int sellIn, int quality) {

		if (itemName.equals(Constants.AGED_BRIE)) {
			return new AgedBrie(itemName, sellIn, quality);
		} else if (itemName.equals(Constants.BACKSTAGE_PASSES)) {
			return new BackstagePasses(itemName, sellIn, quality);
		} else if (itemName.equals(Constants.CONJURED)) {
			return new Conjured(itemName, sellIn, quality);
		} else if (itemName.equals(Constants.SULFURAS)) {
			return new Sulfuras(itemName, sellIn, quality);
		} else {
			return new UpdateableItem(itemName, sellIn, quality);
		}
	}

	// method with steps to add item
	public void addItem() {
		String itemName;
		int quality, sellin = 0;
		System.out.println("Enter Item Name to add");
		itemName = scanner.nextLine();
		System.out.println("Enter quantity");
		quality = scanner.nextInt();
		System.out.println("Enter days to sell in");
		sellin = scanner.nextInt();
		gildedRose.getItems().add(
				new BackstagePasses(itemName, sellin, quality));
	}
}
