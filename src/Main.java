//import all the packages that are necessary to run the program
import java.awt.*;  
import javax.swing.*;
import javax.imageio.ImageIO;

//the entire package can be imported or specific parts of the package can be imported (as shown below)
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

/*
 The main is the class that needs to be run first.In this class,the contents of the arraylist are added.And frames are created
 */
public class Main {
	
    public static void main(String[] args) {
    	//new objects are being created for class CalculateTotalIncome and PrintAllProperties

    	CalculateTotalIncome total_income_object=new CalculateTotalIncome();
    	PrintAllProperties p_Properties=new PrintAllProperties();
   
    	//declare array list to store the values for apartment,house and villa
                ArrayList<Apartment> apartments = new ArrayList<Apartment>();
                ArrayList<House> houses = new ArrayList<House>();                        
                ArrayList<Villa> villas = new ArrayList<Villa>();
               
                
    //New frame called MyBnB is created and then its dimensions are set        
                JFrame frame_parent=new JFrame("MYBnB")   ;
               
               frame_parent.setLayout(new GridLayout(4, 3));
               frame_parent.setSize(300, 500);
     //buttons along with their action listeners are added          
               JButton button1= new JButton("Fill in property") ;
           	    button1.addActionListener(new ActionListener()
               {
           		  public void actionPerformed(ActionEvent e)
           		  {  FillInProperties(apartments,houses,villas);  
           		     
           		  }
           		  });

           	 JButton button2= new JButton("Print the Property") ;
        	    button2.addActionListener(new ActionListener()
            {
        		  public void actionPerformed(ActionEvent e)
        		  {  p_Properties.PrintAllPropertiesMethod(apartments,houses,villas);
        		     
        		  }
        		  });
        	    
        	    JLabel l1=new JLabel();
        	   
        	   	 JButton button3= new JButton("Print Total Income") ;
         	    button3.addActionListener(new ActionListener()
             {
         		  public void actionPerformed(ActionEvent e)
         		  { 
         			  JOptionPane.showMessageDialog(null,"The current total income for this year is:"+total_income_object.CalculateTotallIncome(apartments,houses,villas) );
         		     l1.setText("The current total income for this year is:"+total_income_object.CalculateTotallIncome(apartments,houses,villas));
         		  }
         		  });
        	    
         	    //adding buttons and text to frame mybnb
         	   frame_parent.getContentPane().add(button1);
         	   frame_parent.getContentPane().add(button2);
         	   frame_parent.getContentPane().add(button3);
         	   frame_parent.getContentPane().add(l1);
         	  
         	   //making the frame visible
         	   frame_parent.setVisible(true);
         	  frame_parent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
      
        }
    
    
  /*
    In the FillInProperties method we add data to the arrayList.
    The attributes added are as follows : 
    (int Storey_no,int Beds_no, int RentPerDay,int TotalRentPerDay,String Owner,String PostalAddress)
    
   */  
    public static void FillInProperties(ArrayList<Apartment> apartments,ArrayList<House> houses, ArrayList<Villa> villas ){
    	
    	
    	//Entering the details of apartment,house and villa
    	        apartments.add(new Apartment(1,2,50,0,"Anna  ","  Res     "));
    			apartments.add(new Apartment(2,3,50,0,"Amena ","Tiery   "));
    			apartments.add(new Apartment(2,4,50,0,"Orla  ","Whelans "));

    			    houses.add(new House(1,50,50,0,"Anna   ","  Res 2     "));
                houses.add(new House(2,50,60,0,"Amena  ","Tiery 2   "));
                houses.add(new House(4,60,60,0,"Orla   ","Whelans 2 "));
                
                villas.add(new Villa(5,10,10,50,0,"Anna   ",  "  Res 3     "));
                villas.add(new Villa(4,15,20,40,0,"Amena  ",  "Tiery 3   "));
                villas.add(new Villa(8,20,30,55,0,"Orla   ",  "Whelans 3 "));
                
   
    //create a frame called mybnb_renting and set its size
                
	 JFrame frame = new JFrame("MyBnB_renting");
	frame.setLayout(new GridLayout(4, 3));
	frame.setSize(200, 500);
	
	//an image is added in the form of a button
							ImageIcon imageIcon = new ImageIcon(new ImageIcon("/Users/TejaswiniKumar/Downloads/MyBnb/src/apartment.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
						//	
							JButton Appartment =new JButton(imageIcon);
							
							Appartment.addActionListener(new ActionListener()
							{
							  public void actionPerformed(ActionEvent e)
							  {
					         // opens the joptionPane-MyBnB-rent-Apartment when the button is pressed
						     //it has 2 labels,2 text fields and a button
								  JFrame frame1 = new JFrame("MyBnB_rent_Apartment");
								  frame1.setLayout(new GridLayout(5, 0));
							    	frame1.setSize(300, 200);
								    UIManager.put("OptionPane.messageFont", new Font("Times New Roman ", Font.BOLD, 14));
							        frame1.getContentPane().add(new JLabel("Appartment number:"));
							        JTextArea text1= new JTextArea(20,10);
							        frame1.getContentPane().add(text1);
							        
							        frame1.getContentPane().add(new JLabel("Number of days of stay:"));
							        JTextArea text2= new JTextArea(20,10);
							        frame1.getContentPane().add(text2);
							        
							        JButton button= new JButton("Confirm your booking") ;
							        //Action listener is added for the button
							            button.addActionListener(new ActionListener()
							    	{
							    	  public void actionPerformed(ActionEvent e)
							    	  { int aptartmentNum=Integer.parseInt(text1.getText());
							    	  //There are only 3 apartments in total.Apartment numbers-0,1,2.So,if anything else is 
							    	  //inputed then,message dialog box opens
							    	  if(aptartmentNum>2) {
							    		  JOptionPane.showMessageDialog(null, "Re-enter the apartment number:The possible values are 0,1,2");
							    		  System.out.println("Re-enter the apartment number:The possible values are 0,1,2");
							    	  }
							    	  else {
							    		  int rentingDays=Integer.parseInt(text2.getText());
							    		  apartments.get(aptartmentNum).RentProperty(rentingDays);
							    		  
							    	    System.out.print("aptartmentNum+rentingDays   "+aptartmentNum+rentingDays);
							    	    frame1.getDefaultCloseOperation();
							    	    frame1.dispose();
							    		  
							    	    }
							    	    
							    	  }
							    	  });
							            //button is added to the frame and it is made visible

							            frame1.getContentPane().add(button);
							            frame1.setVisible(true);
								        
							  
							  }
							});
							Appartment.setSize(150,150);
							
							//an image is added in the form of a button

							ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("/Users/TejaswiniKumar/Downloads/MyBnb/src/house.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
						
							JButton House =new JButton(imageIcon1);
							House.setSize(150,150);
							
							House.addActionListener(new ActionListener()
							{
							  public void actionPerformed(ActionEvent e)
							  {
								// opens the joptionPane  MyBnB_rent_house  when the button is pressed
								     //it has 2 labels,2 text fields and a button
								  JFrame frame1 = new JFrame("MyBnB_rent_house");
								  frame1.setLayout(new GridLayout(5, 0));
							    	frame1.setSize(300, 200);
								    UIManager.put("OptionPane.messageFont", new Font("Times New Roman ", Font.BOLD, 14));
							        frame1.getContentPane().add(new JLabel("House number:"));
							        JTextArea text1= new JTextArea(20,10);
							        frame1.getContentPane().add(text1);
							        frame1.getContentPane().add(new JLabel("Number of days of stay:"));
							        JTextArea text2= new JTextArea(20,10);
							        frame1.getContentPane().add(text2);
							        
							        JButton button= new JButton("Confirm your booking") ;
							        //Action listener is added for the button

							            button.addActionListener(new ActionListener()
							    	{
							    	  public void actionPerformed(ActionEvent e)
							    	  { 
							    		  int aptartmentNum=Integer.parseInt(text1.getText());
							    	//There are only 3 houses in total.house numbers-0,1,2.So,if anything else is 
							    	  //inputed then,message dialog box opens
							    	  if(aptartmentNum>2) {
							    		  JOptionPane.showMessageDialog(null, "Re-enter the house number:The possible values are 0,1,2");
							    		  System.out.println("Re-enter the house number:The possible values are 0,1,2");
							    	  }
							    	  else {  
							    	  int rentingDays=Integer.parseInt(text2.getText());
							    		  houses.get(aptartmentNum).RentProperty(rentingDays);
							    	    System.out.print(aptartmentNum+rentingDays);
							    	    frame1.dispose();
							    	  }}
							    	  });
							            //button is added to the frame and it is made visible
							            frame1.getContentPane().add(button);
							            frame1.setVisible(true);
							            
							  
							  }
							});
							
							
							
							//an image is added in the form of a button

							ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("/Users/TejaswiniKumar/Downloads/MyBnb/src/villa.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
						    JButton Villa =new JButton(imageIcon2);
						    Villa.addActionListener(new ActionListener()
							{
							  public void actionPerformed(ActionEvent e)
							  {
							// opens the joptionPane-MyBnB rent villa- when the button is pressed
						    //it has 2 labels,2 text fields and a button

								  JFrame frame1 = new JFrame("MyBnB_rent_villa");
								  frame1.setLayout(new GridLayout(5, 0));
							    	frame1.setSize(300, 200);
								    UIManager.put("OptionPane.messageFont", new Font("Times New Roman ", Font.BOLD, 14));
							        frame1.getContentPane().add(new JLabel("Villa number:"));
							        JTextArea text1= new JTextArea(20,10);
							        frame1.getContentPane().add(text1);
							        frame1.getContentPane().add(new JLabel("Number of days of stay:"));
							        JTextArea text2= new JTextArea(20,10);
							        frame1.getContentPane().add(text2);
							        
							        JButton button= new JButton("Confirm your booking") ;
							        //Action listener is added for the button

							            button.addActionListener(new ActionListener()
							    	{
							    	  public void actionPerformed(ActionEvent e)
							    	  { int aptartmentNum=Integer.parseInt(text1.getText());
							    	 	//There are only 3 villas in total.Villa numbers-0,1,2.So,if anything else is 
							    	  //inputed then,message dialog box opens
							    	  if(aptartmentNum>2) {
							    		  JOptionPane.showMessageDialog(null, "Re-enter the villa number:The possible values are 0,1,2");
							    		  System.out.println("Re-enter the villa number:The possible values are 0,1,2");
							    	  }
							    	  else {
							    	    int rentingDays=Integer.parseInt(text2.getText());
							    	    villas.get(aptartmentNum).RentProperty(rentingDays);
							    	    System.out.print(aptartmentNum+rentingDays);
							    	    frame1.getDefaultCloseOperation();
							    	    frame1.dispose();
							    	  }}
							    	  });
							            //button is added to the frame and it is made visible

							            frame1.getContentPane().add(button);
							            frame1.setVisible(true);
							            
							  
							  }
							});
						    
							Villa.setSize(150,150);
							
						// 3 components-apartment,house and villa are added to the frame
							frame.getContentPane().add(Appartment);
							frame.getContentPane().add(House);
							frame.getContentPane().add(Villa);
							
							JButton bclose= new JButton("Done Booking") ;
							bclose.addActionListener(new ActionListener()
						    {
								  public void actionPerformed(ActionEvent e)
								  { 
								 // frame  My_BnB_renting is closed
								  frame.dispose();
								  }
								  });
						
						
							frame.getContentPane().add(bclose);
							//visibility of MyBnB frame is set to true
							frame.setVisible(true);
						    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
						}
    
    
}
