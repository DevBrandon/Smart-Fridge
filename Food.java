/**
* @author Brandon Jackson, Dov, Ohr, O - Tue 5 Nov 2013
*
* Design a Smart Refrigerator that manages the contents of the refrigerator, this includes
anything that is edible. It will also monitor itself and give error reports should a part become
ineffective. Should allow users to be able to manually manage the contents of the food.
*
*
*/
public class Food {
String name;
double weight;
int preferredAmount;
public Food(String fName, double fWeight,int pAmount){
name = fName;
weight = fWeight;
preferredAmount = pAmount;
}
public double getFoodWeight(){
return weight;
}
public void setFoodWeight(double weight1){
weight = weight1;
}
public void setPreferredAmount(int pAmount){
preferredAmount = pAmount;
}
public int getPreferredAmount(){
return preferredAmount;
}
}