public class Property {
	/*
	 This class Property holds 6 variables.This is later inherited by 
	 3 other classes-apartment,house and villa
	*/
	
    static int counter;
	int RegisterNumber;
	String Owner;
	String PostalAddress;
	int RentalCostPerDay;
	int TotalRentalDays;
	
    /*
      4 parameters are stored in the constructor.They are of the form:
	    Property(RentalCostPerDay, TotalRentalDays, Owner, PostalAddress)
     */
	public Property( int RentalCostPerDay, int TotalRentalDays, String Owner, String PostalAddress) {
		//this keyword is used to refer current class instance variable
        this.RegisterNumber=counter++;
		this.RentalCostPerDay = RentalCostPerDay;
        this.TotalRentalDays=TotalRentalDays;
        this.Owner=Owner;
        this.PostalAddress=PostalAddress;
    }
	/*
	methods that are used to assign the value of the variable-it acts as a mutator.
	 It increases the total number of rental days
	 */
	public void RentProperty(int RentalDays){
		TotalRentalDays+=RentalDays;
	}
	
    //methods that are used to return the value of the variables-they act as accessors
	
	public int getRegisterNumber(){
		return RegisterNumber;
	}
	public int getTotalRentalDays(){
		return TotalRentalDays;
	}
	public int getRentalCostPerDay(){
		return RentalCostPerDay;
	}
	public String getOwner(){
		return Owner;
	}
	public String getPostalAddress(){
		return PostalAddress;
	}
}