
public class Driver {

	public static void main(String[] args) {
		SmartRefrigerator fridge = new SmartRefrigerator();
		
		Food apple = new Food("apple", 51, 1);
		
		Food banana = new Food("banana", 5, 1);
		
		Food orange = new Food("orange", 7, 1);
		
		Food watermelon = new Food("waterelon", 60, 1);
		
		Food plum = new Food("plum", 7, 1);
		
		fridge.isRefrigeratorEmpty();
		fridge.addItem(apple);
		fridge.addItem(banana);
		fridge.addItem(orange);
		fridge.addItem(watermelon);
		fridge.addItem(plum);
		//fridge.isRefrigeratorEmpty();
		fridge.getAmountofItems();
        //fridge.toString();

	}

}
