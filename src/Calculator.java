import javax.swing.*;

import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {

    // Declare all calculator's components.
	JPanel windowContent;
	JTextField displayField;
	//JButton button0, button1, button2, button3, button4, button5, button6, button7,
	//button8, button9, buttonPoint, buttonEqual;
	JPanel p1;

      // Constructor  creates the components
      // and adds the to the frame using combination of 
      // Borderlayout and Gridlayout

  Calculator(){

	  windowContent= new JPanel();

	 // Set the layout manager for this panel
	  BorderLayout bl = new BorderLayout(); 
         windowContent.setLayout(bl);

       // Create the display field and place it in the   
       // North area of the window

	  displayField = new JTextField(20);
	  windowContent.add("North",displayField);

     // Create buttons using constructor of the  
     // class JButton that takes the label of the 
     // button as a parameter 

	 // Create the panel with the GridLayout with 12 buttons – 
        //10 numeric ones, period, and the equal sign   
	     JButton buttons [] = {new JButton("0"), new JButton("1"), new JButton("2"), new JButton("3"),
	    		 new JButton("4"), new JButton("5"), new JButton("6"), new JButton("7"),
	    		 new JButton("8"), new JButton("9"), new JButton("."), new JButton("="),};
	  
	  
	  
		  p1 = new JPanel();
		  GridLayout gl =new GridLayout(4,3); 
		   p1.setLayout(gl);
		   for (JButton button: buttons) {
			   p1.add(button);
		   }
		

	 //  Add window controls to the panel p1
	
	// Add the panel p1 to the center of the window				          
               windowContent.add("Center",p1);

	//Create the frame and set its content pane	               
		JFrame frame = new JFrame("MYCalculator");
	       frame.setContentPane(windowContent);

	 // Set the size of the window to be big enough to accommodate all controls 		
	       frame.pack(); 

		 // Display the window
		  frame.setVisible(true);
     }


     public static void main(String[] args) {

	  new Calculator();
     
     }
}