import javax.swing.JFrame;

public class Lab3Exercises {
	
	
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("Javier Ramirez Zayas"); //Changed from "Hello,World!" to Javier Ramirez Zayas.
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(600, 300); //Set Location to approximately center based on the computer screen.
		myFrame.setSize(200, 200); //Set size to 200x200.
		
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
        
		myFrame.setVisible(true);
		
	}
}