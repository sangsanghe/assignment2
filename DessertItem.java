
public abstract class DessertItem {
	protected String name;
//	protected int cost;
	public DessertItem(){
	}
    public DessertItem(String name){
    this.name = name;
    }
    final String getName(){
    	return name;
    }
    abstract int getCost();
}
class Candy extends DessertItem{
	//float a=100;
	Candy(String name,double weight, float price){
		this.weight=weight;
		this.price=price;
		//this.name=weight+" lbs. @ "+(float)(price/a)+" /lb."+"\n"+name;
		this.name=name;
	}
	double weight;
	double price;
	int getCost(){
		return (int)Math.round(weight*price);
	}
}
class Cookie extends DessertItem{
	float a= 12;
	Cookie(String name, float num, double price){
		this.name=name;
		this.num=num;
		this.price=price;
	}
	float num;
	double price;
	int getCost(){
		return (int)Math.round((float)(num/a)*price);
	}
}
class IceCream extends DessertItem{
	IceCream(String name, int cost){
		this.name=name;
		this.cost=cost;
	}
	int cost;
	int getCost(){
		return cost;
	}
}
class Sundae extends IceCream{
	Sundae(String name, int cost, String name2, int cost2){
		super(name,cost+cost2);
		this.name=name2+" Sundae with "+name;
	}
	int getCost(){
		return cost;
	}
}




















