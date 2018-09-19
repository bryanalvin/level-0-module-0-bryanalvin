package extra;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		String Phoenix = JOptionPane
				.showInputDialog("Who is the coolest person in the world,Sasuke,sakura,hinata,or,dave?");

		if (Phoenix.equals("Dave")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "You Idiot None of them are cool except for dave");
		}
		String Boi = JOptionPane.showInputDialog("Who is the 2nd coolest person in the world,Bryan,Dave,Andy");
		if (Boi.equals("Bryan and Dave")) {
			JOptionPane.showMessageDialog(null, "Bingo you know you really should play warframe");

		} else {
			JOptionPane.showMessageDialog(null, "Idiot andy sucks you know that");
		}
		String Rekt = JOptionPane.showInputDialog("The best game in the world is fortnite or pubg");
		if (Rekt.equals("Fortnite")) {
			JOptionPane.showMessageDialog(null, "Bingo you know you really should play Fortnite more");
			
		} else {JOptionPane.showMessageDialog(null, "Idiot you suck");
			
		}
		String Dragons = JOptionPane.showInputDialog("The best anime is bleach or naruto ");
		if (Dragons.equals("Bleach")) {
			JOptionPane.showMessageDialog(null, "Bleach and drago ball are good");

		} else {
			JOptionPane.showMessageDialog(null, "you are not cool");
		}
		String valor = JOptionPane.showInputDialog("Will I marry my truelove Beatrice ");
		if (valor.equals("Yes Yes Yes")) {
			JOptionPane.showMessageDialog(null, "I wuv this quiz");

		} else {
			JOptionPane.showMessageDialog(null, "I will kill you");
		}
	}
}
