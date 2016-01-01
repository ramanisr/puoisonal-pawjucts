package gildedrose.UI;

import java.io.IOException;

public class GildedRoseUI {
	
	private static UIServices uiServices; 
	
	public static void initUI() {
		 uiServices = new UIServices();
	}
	
	public static void main(String args[]) throws IOException {
		// Initialize gilded rose and I/O
		initUI();
		uiServices.printIntro();
		uiServices.awaitUserAction();
	}
	

}
