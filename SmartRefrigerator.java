/**
 * @author Brandon Jackson, Dov, Ohr, O - Tue 5 Nov 2013
 * 
 * Design a Smart Refrigerator that manages the contents of the refrigerator, this includes
   anything that is edible. It will also monitor itself and give error reports should a part become
   ineffective. Should allow users to be able to manually manage the contents of the food.
 * 
 * 
 */
public class SmartRefrigerator {
	//will have shelves
	//Variables
	double weight;
	int items;
	Shelf shelf = new Shelf();
	Shelf shelf1 = new Shelf();
	Shelf shelf2 = new Shelf();
	
	//Constructs an empty refrigerator
	public SmartRefrigerator (){
		
	}
	
	
	public void isRefrigeratorEmpty(){
		if(shelf.isEmpty() == true && shelf1.isEmpty() == true && shelf2.isEmpty() == true){
			System.out.println("The refrigerator is empty.");
		} else{
			System.out.println("The refrigerator is not empty.");
		}
	}
	
	public void getAmountofItems(){
		items = shelf.getfoodCount() + shelf1.getfoodCount() + shelf2.getfoodCount();
		System.out.println("The refrigerator has " + items + " items.");
	}
	
	public void addItem(Food foodz){
		
		if(shelf.getWeight() < 50){
			shelf.addFood(foodz);
			System.out.println(foodz.name + " was added to the refrigerator on shelf 1");
		} else if(shelf1.getWeight() < 50){
			shelf1.addFood(foodz);
			System.out.println(foodz.name + " was added to the refrigerator on shelf 2");
		} else {
			shelf2.addFood(foodz);
			System.out.println(foodz.name + " was added to the refrigerator on shelf 3");
		} 
	
	}
	
	public void removeItem(Food foodz){
		if(shelf.getWeight() > 0){
			shelf.removeFood(foodz);
			System.out.println(foodz.name + " was removed to the refrigerator at shelf 1");
		} else if(shelf1.getWeight() > 0){
			shelf1.removeFood(foodz);
			System.out.println(foodz.name + " was removed to the refrigerator at shelf 2");
		} else {
			shelf2.removeFood(foodz);
			System.out.println(foodz.name + " was removed from the refrigerator at shelf 3");
		} 
	}
	
	public void setPreferredAmountOfItems(Food foodz, int pAmount){
		Food food = new Food(null, weight, items);
		food = foodz;
		food.setPreferredAmount(pAmount);
		foodz = food;
	}
	
	public int getPreferredAmountOfItems(Food foodz){
		return foodz.getPreferredAmount();
	}
	
	public int quanityCheck(){
		return shelf.getfoodCount() + shelf1.getfoodCount() + shelf2.getfoodCount();
	}
	
	/* these method is left undone since we lack the resources
	
	public void orderItem(){
		
	} 
	
	public void cancelOrder(){
		
	}
	
	public void restock(){
		
	}
	
	public void checkUp(){
		
	}
	
	public String stateOfRefrigerator(){
	
	}
	*/

	
}