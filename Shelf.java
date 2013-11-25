import java.util.ArrayList;

/**
 * @author Brandon Jackson, Dov, Ohr, O - Tue 5 Nov 2013
 * 
 * Design a Smart Refrigerator that manages the contents of the refrigerator, this includes
   anything that is edible. It will also monitor itself and give error reports should a part become
   ineffective. Should allow users to be able to manually manage the contents of the food.
 * 
 * 
 */
public class Shelf {
	protected double weight = 0;
	protected final double FULL = 50;
	Sensor sensor = new Sensor(weight);
	ArrayList<Food> food = new ArrayList<Food>();
	int count = 0;
	public Shelf(){
		//
	}
	
	public void addFood(Food foodz){
		if (sensor.getWeight() <= FULL){
		food.add(foodz);
		count++;
		//Must get the weight of the item
		sensor.itemPlaced(foodz.getFoodWeight());
		}
	}
	
	public int getfoodCount(){
		return count;
	}
	
	public void removeFood(Food foodz){
		if (sensor.getWeight() > 0){
		food.remove(foodz);
		sensor.itemRemoved(foodz.weight);
		}
	}
	
	public boolean isEmpty(){
		if (sensor.weight == 0){
			System.out.println("Shelf is empty.");
			return true;
		} else {
			System.out.println("Shelf has " + food.size() + "item.");
			return false;
		}
	}
	
	public double getWeight(){
		return sensor.getWeight();
	}
	}