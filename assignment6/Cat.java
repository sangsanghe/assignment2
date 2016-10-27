
public class Cat extends Pet implements Boardable{
private String hairLength;
private int startmonth;
private int startday;
private int startyear;
private int endmonth;
private int endday;
private int endyear;
Cat (String name, String ownerName, String color, String hairLength){
	super(name,ownerName,color);
	this.hairLength=hairLength;
}
String getHairLength(){ // returns the string hairLength
    return hairLength;
}
public String toString(){
    return ("CAT:"+"\n"+getPetName()+" owned by "+getOwnerName()+"\n"+"Color: "+getColor()+"\n"+"Sex: "+getSex()+"\n"+"Hair: "+hairLength);
}
@Override
public void setBoardStart(int month, int day, int year) {
	// TODO Auto-generated method stub
	this.startmonth=month;
	this.startday=day;
	this.startyear=year;
}
@Override
public void setBoardEnd(int month, int day, int year) {
	// TODO Auto-generated method stub
	this.endmonth=month;
	this.endday=day;
	this.endyear=year;
}
@Override
public boolean boarding(int month, int day, int year) {
	// TODO Auto-generated method stub
	if(year>endyear||year<startyear) return false;
	else if(year==startyear){
		if(month<startmonth) return false;
		else if(month==startmonth){
			if(day<startday) return false;
		}
	}else if(year==endyear){
		if(month>endmonth) return false;
		else if(month==endmonth){
			if(day>endday) return false;
		}
	}
	return true;
}

}
