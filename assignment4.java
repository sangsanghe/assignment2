import java.util.*;
public class assignment4 {
public static void main(String args[]){
	Stack s = new Stack();
	s.push("hello");
	System.out.println(s.pop());
s.pop();	
}
}
//Implement Class MusicAlbum which encapsulated a music Album, 
//each album has a string variable albumTitle and a String variable singer representing the name of singer, double variable price representing the price of album, 
//objects of this class are Initialized using all of its instance variables.
//The class has accessor methods for all its Variables and a mutator method for price.
class MusicAlbum{
	private String albumTitle;
	private String singer;
	private double price;
	MusicAlbum(String albumTitle, String singer, double price){
		this.albumTitle = albumTitle;
		this.singer = singer;
		this.price = price;
	}
	String getTitle(){
		return albumTitle;
	}
	String getsinger(){
		return singer;
	}
	double getprice(){
		return price;
	}
	void setprice(double price){
		this.price = price;
	}
}

//Write a class named GasTank containing:
//An instance variable named amount of type double, initialized to 0.
//A method named addGas that accepts a parameter of type double . The value of the amount instance variable is increased by the value of the parameter.
//A method named useGas that accepts a parameter of type double . The value of the amount instance variable is decreased by the value of the parameter.
//A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.
class GasTank{
	private double amount = 0;
	void addGas(double amount) {
		this.amount = this.amount + amount;
	}
	void useGas(double amount) {
		this.amount = this.amount + amount;
	}
	double getGasLevel(){
		return amount;
	}
}

//Design and implement a class called Car. You need to create necessary attributes for this class, and method if needed
//Define the Car constructor to initialize these values (in that order). Include getter and setter methods for all instance data.
class Car{
	String brand;
	double price;
	GasTank g;
	Car(String brand,double price, GasTank g){
		this.brand = brand;
		this.price = price;	
		this.g= g;
}
	String getbrand(){
		return brand;
	}
	double getprice(){
		return price;
	}
	void setprice(double price){
		this.price = price;
	}
	void setbrand(String brand){
		this.brand = brand;
	}
	}

//Combine with problem 3 and 4, define a class named Driver that contains methods like drive and addGas so that the driver can drive the car.
class Driver{
	Car car;
	Driver(Car car){
		this.car = car;
	}
	public boolean drive(){
		if(car.g.getGasLevel()>0) return true;
		else return false;
	}
	public void addGas(double amount){
		car.g.addGas(amount);
	}
}

//Design a java class that encapsulate the data structure Stack (Last in First out). The class has 2 methods:
//(push): method for adding items to stack, the push operation adds items to the top of the list
//(pop): method for retrieving items from the stack. The pop operation removes an item from the top of the list, and returns its value to the caller.
//In the case of overflow the user should be informed with a message
//In the case of underflow, the user should be informed with a message & a value of zero is returned.
//
//Assumptions: The stack will hold up to 10 integer values.

class Stack{
	private List list = new ArrayList();
	void push(Object o){
		if(list.size() == 10) System.out.println("OVERFLOW!");
		else{
			list.add(o);
		}
	}
	
	Object pop(){
		if(list.size()==0){
			System.out.println("UNDERFLOW!");
			return null;
		}else{
			Object object = list.get(list.size()-1);
			list.remove(list.size()-1);
		return object;
	}
	}
}



