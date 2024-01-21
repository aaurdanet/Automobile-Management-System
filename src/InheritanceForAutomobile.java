import java.util.ArrayList;

public class InheritanceForAutomobile {

	public static void main(String[] args) {

		ArrayList<Automobile> automobiles = new ArrayList<>();
		int choice = 0;
		do {
			choice = Metodos.getChoice();
			switch (choice) {
			case 1:
				automobiles.add(new Automobile());
				break;
			case 2:
				Metodos.displayAutomobiles(automobiles);
			case 3:
				break;
			default:
				System.out.println("Invalid Menu Choice");
				break;
			}
		} while (choice != 3);

	} // end of main
}
