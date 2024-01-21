import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Metodos extends Automobile {

	public static int getChoice() {
		String mess = "1. New Automobile\n";
		mess += "2. Display all Automobiles\n";
		mess += "3. Quit\n";
		int choice;
		mess = JOptionPane.showInputDialog(mess);
		choice = Integer.parseInt(mess);
		return choice;
	}

	public static void displayAutomobiles(ArrayList automobiles) {
		for (int i = 0; i < automobiles.size(); i++) {
			System.out.println(automobiles.get(i).toString());
		}
	}
}
