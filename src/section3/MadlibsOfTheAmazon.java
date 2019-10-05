package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it");
		// Get the user to enter an adjective
String adjective=JOptionPane.showInputDialog("Were going to let you decide your situation, describe these paranhas in one word.");
		// Get the user to enter a type of liquid
String liquid=JOptionPane.showInputDialog("What is the most common liquid you've encountered this week?");
		// Get the user to enter a body part
String body=JOptionPane.showInputDialog("If you had to throw out one internal organ, what would you throw out?");
		// Get the user to enter a verb
String verb=JOptionPane.showInputDialog("If you could do anything in the world, what would you do?");
		// Get the user to enter a place
String place=JOptionPane.showInputDialog("If you could only stay in one place for the rest of your life, where would it be?");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
JOptionPane.showMessageDialog(null, "Piranhas are more " + adjective + 
		" during the day, so cross the river at night. Piranhas are attracted to fresh " + liquid + 
		" and will most likely take a bite out of your " + body + 
		" if you " + verb + 
		". Whatever you do, if you have an open wound, try to find another way to get back to the " + place + 
		". Good Luck!");

	}
}

