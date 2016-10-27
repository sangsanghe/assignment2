import java.util.*;
public class AnimalHospital {
	String inputFile;
	List<Pet> pet=new ArrayList<Pet>();
	List<Boardable> Boardablepet=new ArrayList<Boardable>();
	AnimalHospital(String inputFile){
		this.inputFile=inputFile;
	}
	void printPetInfoByName(String name)
	/* search the list of pets for every pet of a given name, and print the pet’s information, using the toString() method. */
	{
		for(Pet p:pet){
			if(p.getPetName()==name){
				System.out.println(p.toString());
			}
		}
	}
	void printPetInfoByOwner(String name)
	/* search the list of pets for pets owned by the given person and print the pet’s information for every match, using the toString() method. */
	{
		for(Pet p:pet){
			if(p.getOwnerName()==name){
				System.out.println(p.toString());
			}
		}
	}
	void printPetsBoarding(int month, int day, int year)
	/* search the list of pets for every pet boarding at the given time and print the pet’s information for every match, using the toString() method. */
	{
		for(Boardable b:Boardablepet){
			if(b.boarding(month, day, year)){
				System.out.println(b.toString());;
			}
		}
	}
}
