
//import all the packages that are necessary to run the program

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;  
import javax.swing.*;

//class to print all properties
public class PrintAllProperties {
	
	//an empty constructor is called
	PrintAllProperties(){}

	
	public  void PrintAllPropertiesMethod(ArrayList<Apartment> apartments,ArrayList<House> houses, ArrayList<Villa> villas ){
    	int i;
    	JFrame frame = new JFrame("MyBnB print property");
    	frame.setLayout(new GridLayout(20, 0));
    	frame.setSize(1100, 700);
    	
    	//printing the details of apartments by adding the Joptionpane that contains 
    	//its details to the frame
    	UIManager.put("OptionPane.messageFont", new Font("Times New Roman ", Font.BOLD, 14));
    	frame.getContentPane().add(new JOptionPane("Apartments:"));
    	frame.getContentPane().add(new JOptionPane("Register No     Owner       Address      Total Days rented   Cost_per_day     Total_Storey     Number_of_beds"));
    	UIManager.put("OptionPane.messageFont", new Font("Times New Roman ", Font.PLAIN, 14));
    	
    	
    	for(i=0;i<apartments.size();i++)
        frame.getContentPane().add(new JOptionPane(("     "+apartments.get(i).getRegisterNumber()+"                   "+apartments.get(i).getOwner()+"           "+apartments.get(i).getPostalAddress()+"                             "+apartments.get(i).getTotalRentalDays()+"                           "+
				apartments.get(i).getRentalCostPerDay()+"                          "+apartments.get(i).getStoreyNumber()+"                        "+apartments.get(i).getBedsNumber())));
    	
    	
   
    	//printing the details of houses by adding the Joptionpane that contains 
    	//its details to the frame
    	UIManager.put("OptionPane.messageFont", new Font("Times New Roman ", Font.BOLD, 14));
    	frame.getContentPane().add(new JOptionPane("Houses:"));
    	frame.getContentPane().add(new JOptionPane("Register No     Owner       Address      Total Days rented   Cost_per_day     Total_Storey         Clearing_fees"));
    	UIManager.put("OptionPane.messageFont", new Font("Times New Roman ", Font.PLAIN, 14));
    
      
        for(i=0;i<houses.size();i++)
        	
        	frame.getContentPane().add(new JOptionPane("     "+houses.get(i).getRegisterNumber()+"                   "+houses.get(i).getOwner()+"           "+houses.get(i).getPostalAddress()+"                         "+houses.get(i).getTotalRentalDays()+"                         "+
        			houses.get(i).getRentalCostPerDay()+"                        "+houses.get(i).getTotalNumberStoreys()+"                        "+houses.get(i).getClearingFees()));
        
       
      //printing the details of villa by adding the Joptionpane that contains 
    	//its details to the frame 
        UIManager.put("OptionPane.messageFont", new Font("Times New Roman ", Font.BOLD, 14));
        frame.getContentPane().add(new JOptionPane("Villas:"));
    	frame.getContentPane().add(new JOptionPane("Register No     Owner       Address      Total Days rented   Cost_per_day     Total_Storey     Room_sevice/day        tax per day"));
    	UIManager.put("OptionPane.messageFont", new Font("Times New Roman ", Font.PLAIN, 14));

        
        
        
        for(i=0;i<villas.size();i++)
        	frame.getContentPane().add(new JOptionPane("     "+villas.get(i).getRegisterNumber()+"                 "+villas.get(i).getOwner()+"            "+villas.get(i).getPostalAddress()+"                           "+villas.get(i).getTotalRentalDays()+"                     "+
        			villas.get(i).getRentalCostPerDay()+"                           "+villas.get(i).getNumberOfRooms()+"                      "+villas.get(i).getRoomServiceCostPerDay()+"                                     "+villas.get(i).getTaxPerDay()));
       
     //making the frame visible
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }    
	
	
	
}
