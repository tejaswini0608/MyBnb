public class House extends Property{
	// Class House inherits class Property
	//2 new variables are declared
	int TotalNumberStoreys;
	int ClearingFees;
	
    /*
    6 parameters are stored in the constructor.They are of the form:
    House(TotalNumberStoreys, ClearingFees, RentalCostPerDay, TotalRentalDays, Owner, PostalAddress)
    
     */
	public House(int TotalNumberStoreys, int ClearingFees, int RentalCostPerDay, int TotalRentalDays, String Owner, String PostalAddress) {
		//constructor of the super class-Property is called
        //"this" keyword is used to reference the values of variables obtained from super
		//class to this class
		super(RentalCostPerDay,TotalRentalDays,Owner,PostalAddress);
		this.TotalNumberStoreys = TotalNumberStoreys;
        this.ClearingFees=ClearingFees;
    }
	//methods that are used to return the value of the 2 new variables-they act as accessors
	public int getTotalNumberStoreys(){
		return TotalNumberStoreys;
	}
	public int getClearingFees(){
		return ClearingFees;
	}
}