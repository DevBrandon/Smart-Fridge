/**
 * @author Brandon Jackson, Dov, Ohr, O - Tue 5 Nov 2013
 * 
 * Design a Smart Refrigerator that manages the contents of the refrigerator, this includes
   anything that is edible. It will also monitor itself and give error reports should a part become
   ineffective. Should allow users to be able to manually manage the contents of the food.
 * 
 * 
 */
public class Sensor {

	protected double initialWeight = 0;
	protected double weight = 0;
	
	public Sensor(double inputWeight){
		initialWeight = inputWeight;
	}
	
	public void setWeight(double inputWeight){
		weight = inputWeight;
	}
	
	public double getWeight(){
		//weight = initialWeight;
		return weight;
	}
	
	public void itemRemoved(double itemWeight){
		 
		weight = initialWeight - itemWeight;
	}
	
	public void itemPlaced(double itemWeight){
		weight = initialWeight + itemWeight;
	}
}
