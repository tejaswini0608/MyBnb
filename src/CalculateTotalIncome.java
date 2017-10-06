
//import all the packages that are necessary to run the program

import java.util.ArrayList;
public class CalculateTotalIncome{
//A constructor with no parameters is called
	CalculateTotalIncome(){
		
	}
	//a CalculateTotalIncome is created.It has the 3 parameters:
	// arrayList of apartment,house,villa
public int CalculateTotallIncome(ArrayList<Apartment> apartments,ArrayList<House> houses, ArrayList<Villa> villas ){
    	int TotalRentalIncome=0,i;
    	//TotalRentalIncome is calculated by running for loops
    	// TotalRentalIncome=TotalRentalDays()*RentalCostPerDay+ other taxes
 
    	
    	//calculating the income for apartment
            for(i=0;i<apartments.size();i++) {
            	TotalRentalIncome+=(apartments.get(i).getTotalRentalDays()) * (apartments.get(i).getRentalCostPerDay());
            }
        
            //calculating the income for house
            for(i=0;i<houses.size();i++) {
            	TotalRentalIncome+=houses.get(i).getTotalRentalDays()  * ( houses.get(i).getRentalCostPerDay());
            	// An additional clearing fee is added when leaving the room(You pay it only once you leave the room,at the end)
            	if(houses.get(i).getTotalRentalDays()>0) {
            		
            		TotalRentalIncome+=houses.get(i).getClearingFees();
            	}
            		
            }
            
            
          //calculating the income for villa
            for(i=0;i<villas.size();i++) {
            	TotalRentalIncome+=villas.get(i).getTotalRentalDays()*(villas.get(i).getRoomServiceCostPerDay()+villas.get(i).getTaxPerDay()+  villas.get(i).getRentalCostPerDay());
            }
            	
            	return TotalRentalIncome;
        }
    }
