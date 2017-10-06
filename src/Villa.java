public class Villa extends Property{
	// Class Villa inherits class Property
    //3 new variables are declared
	int NumberOfRooms;
	int RoomServiceCostPerDay;
	int TaxPerDay;
	
    /*
     7 parameters are stored in the constructor.They are of the form:
	    Villa(NumberOfRooms, RoomServiceCostPerDay, TaxPerDay, RentalCostPerDay, TotalRentalDays, Owner, PostalAddress)
	 */
	public Villa(int NumberOfRooms, int RoomServiceCostPerDay, int TaxPerDay, int RentalCostPerDay, int TotalRentalDays, String Owner, String PostalAddress) {
		//constructor of the super class-Property is called
				//"this" keyword is used to reference the values of variables obtained from 
				//super class to this class
		super(RentalCostPerDay,TotalRentalDays,Owner,PostalAddress);
		this.NumberOfRooms = NumberOfRooms;
        this.RoomServiceCostPerDay=RoomServiceCostPerDay;
        this.TaxPerDay=TaxPerDay;
    }
    //methods that are used to return the value of the 3 new variables-they act as accessors

	public int getNumberOfRooms(){
		return NumberOfRooms;
	}
	public int getRoomServiceCostPerDay(){
		return RoomServiceCostPerDay;
	}
	public int getTaxPerDay(){
		return TaxPerDay;
	}
}