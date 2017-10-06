public class Apartment extends Property{
	// Class apartment inherits class Property
     //2 new variables are declared
	
	int StoreyNumber;
	int BedsNumber;
	/*
	   6 parameters are stored in the constructor.They are of the form:
	    Apartment(StoreyNumber, BedsNumber, RentalCostPerDay, TotalRentalDays, Owner, PostalAddress)
	    
     */
	public Apartment(int StoreyNumber, int BedsNumber, int RentalCostPerDay, int TotalRentalDays, String Owner, String PostalAddress) {
		//constructor of the super class-Property is called
		//"this" keyword is used to reference the values of variables obtained from 
		//super class to this class
		super(RentalCostPerDay,TotalRentalDays,Owner,PostalAddress);
		this.StoreyNumber = StoreyNumber;
        this.BedsNumber=BedsNumber;
    }
	
      //methods that are used to return the value of the 2 new variables-they act as accessors

	public int getStoreyNumber(){
		return StoreyNumber;
	}
	public int getBedsNumber(){
		return BedsNumber;
	}
}