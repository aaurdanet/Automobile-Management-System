import java.util.Objects;

import javax.swing.JOptionPane;

public class Automobile {


	private double engineLiter;
	private String model;
	private String brand;
	private int year;
	private String trim;

	public Automobile() {
		getAutomobile();

	}

	public void getAutomobile() {
		String mess = "Type car brand: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setBrand(mess);

		mess = "Type car model ";
		prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setModel(mess);

		mess = "Type car trim ";
		prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setTrim(mess);

		mess = "Type car engine size in litters";
		prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		double engineSize = Double.parseDouble(mess);
		setEngineLiter(engineSize);

		mess = "Type year of the car ";
		prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		int year = Integer.parseInt(mess);
		setYear(year);

	}

	public double getEngineLiter() {
		return engineLiter;
	}

	public void setEngineLiter(double engineLiter) {
		boolean invalid = true;
		do {
			if (engineLiter > 6.0 || engineLiter < 0) {
				String mess = "Your engine liters most be between 0 and 6.0L";
				String prompt = "Type something...";
				mess = JOptionPane.showInputDialog(mess, prompt);
				engineLiter = Double.parseDouble(mess);
				invalid = true;
			} else
				invalid = false;
		} while (invalid);
		this.engineLiter = engineLiter;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {

		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {

		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		boolean invalid = true;
		do {
			if (year > 2023 || year < 1999) {
				String mess = "The make year of your car most be between 1999 and 2023 ";
				String promt = "Re-enter year";
				mess = JOptionPane.showInputDialog(mess, promt);
				year = Integer.parseInt(mess);
			} else
				invalid = false;

		} while (invalid);

		this.year = year;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;

	}

	
		
	


	

	public String toString() {
		String result = "Brand......: " + getBrand() + "\n";
		result += "Model......: " + getModel() + "\n";
		result += "Trim.......: " + getTrim() + "\n";
		result += "Year.......: " + getYear() + "\n";
		result += "Engine size: " + getEngineLiter() + "\n";
		return result;
	}
}
