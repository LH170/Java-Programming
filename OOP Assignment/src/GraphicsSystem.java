import java.awt.FlowLayout;

import javax.swing.JFrame;

import uk.ac.leedsbeckett.oop.LBUGraphics;

public class GraphicsSystem extends LBUGraphics {

	
	  public GraphicsSystem()
      {
              JFrame MainFrame = new JFrame();        //create a frame to display the turtle panel on
              MainFrame.setLayout(new FlowLayout());  //not strictly necessary
              MainFrame.add(this);                    //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
              MainFrame.pack();                       //set the frame to a size we can see
              MainFrame.setVisible(true);             //now display it
              //about(); 								//call the LBUGraphics about method to display version information.
              
              
              clear();
              reset();
              penDown();
              //forward(100);
              //setPenColour(PenColour.BLUE);
      }


      
      
      public void processCommand(String command)      //this method must be provided because LBUGraphics will call it when it's JTextField is used
      {
      	   
      	
      	
      	
      
         	//String[] part = command.split("(?<=\\D)(?=\\d)");
      		String[] part = command.split(" ");
         	System.out.println(part[0]); //only contains characters
         	//System.out.println(part[1]); //only contains numbers
         	//System.out.println(part.length);
         	
         	if (part[0].equals("TurnRight")) {
         		try {
         		turnRight(part[1]);
         		
         		}
         		
         			catch(java.lang.ArrayIndexOutOfBoundsException exception) {
         				turnRight(90);
         			}
         	}
         	
         	else if (part[0].equals("about")) {
         		about();
         	}
         	
         	else if (part[0].equals("PenDown")) {
         		penDown();
         	}
         	
         	else if (part[0].equals("Forward")) {
         		try {
         			
         			forward(part[1]);
         		}
         				catch(java.lang.ArrayIndexOutOfBoundsException exception) {
         					forward(1);
         					System.out.println("Missing Parameter");
         				}
         				catch (java.lang.NumberFormatException exception) {
         					System.out.println("Invalid parameter type");
         				}
         		
         		
         	}
         	
         	else if (part[0].equals("BackWard")) {
         		try { 
         			forward(part[1]);
         			
         		}
         			catch(java.lang.ArrayIndexOutOfBoundsException exception) {
         				forward(-1);
         			}
         	}
         	
         	else if (part[0].equals("TurnLeft")) {
         		try {
         			turnLeft(part[1]);
         		}
         		
         		catch(java.lang.ArrayIndexOutOfBoundsException exception) {
         			turnLeft(90);
         	}
         	
         	
      	}
         	
         	else if (part[0].equals("PenUp")) {
         		penUp();
         	}
         	
         	else if (part[0].equals("Black")) {
         		setPenColour(PenColour.BLACK);
         	}
         	
         	else if (part[0].equals("Green")) {
         		setPenColour(PenColour.GREEN);
         	}
         	
         	else if (part[0].equals("Red")) {
         		setPenColour(PenColour.RED);
         	}
         	
         	else if (part[0].equals("White")) {
         		setPenColour(PenColour.WHITE);
         	}
         	
         	else if (part[0].equals("Clear")) {
         		clear();
         	}
         	
         	else if (part[0].equals("Reset")) {
         		reset();
         	}
         	
         	else if (part[0].equals("Width")) {
         		try {
         			setStroke(Integer.parseInt(part[1]));
         		}
         		
         		catch (java.lang.ArrayIndexOutOfBoundsException exception) {
         			System.out.println("Missing Parameter");
         		}
         	}
         	
         	else if (part[0].equals("Speed")) {
         		try {
         			setTurtleSpeed(Integer.parseInt(part[1]));
         		}
         		
         		catch (java.lang.ArrayIndexOutOfBoundsException exception) {
         	
         		}
         	}
         	
         	else {
         		System.out.println("Invalid Command");
         	}
         //String parameter is the text typed into the LBUGraphics JTextfield
         //lands here if return was pressed or "ok" JButton clicked
         //TO DO 
      }
}



