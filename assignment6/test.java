
public class test {
public static void main(String args[]){
	AnimalHospital a=new AnimalHospital("file");
	a.pet.add(new Dog("dogs","hss","black","big"));
	Cat sang=new Cat("cats","hss","black","long");
	a.Boardablepet.add(sang);
	sang.setBoardStart(12, 22, 1994);
	sang.setBoardEnd(12, 22, 2094);
	a.printPetsBoarding(12, 22, 1994);
}
}
