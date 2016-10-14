import java.util.*;
public class Checkout {
	DessertShoppe M = new DessertShoppe();
	List<DessertItem> a=new ArrayList();
    int numberOfItems(){
    	return a.size();
    }
    void enterItem(DessertItem item){
    	a.add(item);
    }
    void clear(){
    	a.clear();
    }
    int totalCost(){
    	int totalcost=0;
    	for(int i=0;i<a.size();i++){
    		totalcost+=a.get(i).getCost();
    	}
    	return totalcost;
    }
    int totalTax(){
    	int totaltax=0;
    	for(int i=0;i<a.size();i++){
    		totaltax+=a.get(i).getCost();
    	}
    	return (int)Math.round(totaltax*M.taxrate);
    }
    @Override
    public String toString(){
    	String title ="";
    	for(int s=0;s<M.width/4;s++)
    		title+=" ";
    	title += M.name+"\n";
    	for(int s=0;s<M.width/4;s++)
    		title+=" ";
    	title +="--------------------"+"\n"+"\n";
    	for(int i=0;i<a.size();i++){
    		if(a.get(i) instanceof Candy){
    			Candy d= (Candy)a.get(i);
    			title+=d.weight+" lbs. @ "+(float)(d.price/100)+" /lb."+"\n";
    		}else if(a.get(i) instanceof Cookie){
    			Cookie c=(Cookie)a.get(i);
    			title+=c.num+" @ "+(float)(c.price/100)+" /dz."+"\n";
    		}
    			if(a.get(i).name.length()>M.maxsize)
    			{
    				String[] longname = a.get(i).name.split(" ");
    				String first = "";
    				for(int is=0;first.length()<=M.maxsize;is++){
    					first+=longname[is]+" ";
    				}
    				title+=first+"\n";
    				a.get(i).name=a.get(i).name.substring(first.length());
    			}
    			title+=a.get(i).name;
    			
    		for(int j=0;j<M.width-a.get(i).name.length();j++){
    			title+= " ";
    		}
    		title+=M.cents2dollarsAndCents(a.get(i).getCost())+"\n";
    	}
    	title+="\n"+"Tax";
    	for(int j=0;j<M.width-3;j++){
			title+= " ";
		}
    	title+=(float)((double)totalTax()/100);
    	title+="\n"+"Total Cost";
    	for(int j=0;j<M.width-10;j++){
			title+= " ";
		}
    	title+=(float)((double)(totalCost()+totalTax())/100);
    	return title;
    }
}

class DessertShoppe{
	double taxrate=0.065;
	String name="M & M Dessert Shoppe";
	int maxsize = 24;
	int width =30;
	String cents2dollarsAndCents(int cent){
		if(cent%100<10)
		    return cent/100+".0"+cent%100;
		else
			return cent/100+"."+cent%100;
	}
}
