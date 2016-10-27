
public class Pet {
private String name;
private String ownerName;
private String color;
protected int sexid;

static final int MALE=0;
static final int FEMALE=1;
static final int SPAYED=2;
static final int NEUTERED=3;

Pet (String name, String ownerName, String color){
	this.name=name;
	this.ownerName=ownerName;
	this.color=color;
} //Constructor 
public String getPetName(){
	return name;
} 
public String getOwnerName(){
	return ownerName;
} 
public String getColor(){
	return color;
} 
public void setSex(int sexid){
	this.sexid=sexid;
} 
public String getSex(){
	if(sexid==MALE) return "MALE";
	if(sexid==FEMALE) return "FEMALE";
	if(sexid==SPAYED) return "SPAYED";
	if(sexid==NEUTERED) return "NEUTERED";
	return "";
} // Should return the string equivalent of the gender, e.g the string “MALE” etc. 
public String toString(){ // Should return the name, owner’s name, age, color, and gender (use getSex()); 
    return (name+" owned by "+ownerName+"\n"+"Color: "+color+"\n"+"Sex: "+getSex());
}
}

















