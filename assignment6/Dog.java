
public class Dog extends Pet implements Boardable {
	private String size;
	private int startmonth;
	private int startday;
	private int startyear;
	private int endmonth;
	private int endday;
	private int endyear;
	Dog (String name, String ownerName, String color, String size){
		super(name,ownerName,color);
		this.size=size;
	}
	// Constructor must set the size. Do not forget to call super. 
	String getSize() // returns the string size String toString(); 
	/* method that returns a String that identifies the pet as Dog and returns a complete description of the dog, including the values stored in the Pet parent class. */ 
	{
		return size;
	}
	public String toString(){
	    return ("DOG:"+"\n"+getPetName()+" owned by "+getOwnerName()+"\n"+"Color: "+getColor()+"\n"+"Sex: "+getSex()+"\n"+"Size: "+size);
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
