Automobile Management System

This is a simple Java program that manages information about automobiles, allowing users to input details such as brand, model, trim, engine size, and year of manufacture. The program provides a basic text-based user interface using Java's JOptionPane for input and output.
Classes
1. Automobile Class

The Automobile class represents an individual automobile and includes the following attributes:

    engineLiter: Engine size in liters.
    model: Car model.
    brand: Car brand.
    year: Year of manufacture.
    trim: Car trim.

The class contains methods to interactively get automobile details from the user (getAutomobile()), set individual attributes with validation (setEngineLiter(), setModel(), setBrand(), setYear(), setTrim()), and a toString() method to display the automobile information.
2. InheritanceForAutomobile Class

The InheritanceForAutomobile class serves as the entry point to the program. It utilizes an ArrayList to store multiple Automobile objects. The user is presented with a menu to perform the following actions:

    Add a new automobile to the list.
    Display details of all automobiles.
    Quit the program.

3. Metodos Class

The Metodos class contains static methods that are used by the InheritanceForAutomobile class. It includes:

    getChoice(): Displays a menu and retrieves the user's choice.
    displayAutomobiles(ArrayList automobiles): Displays details of all automobiles in the given ArrayList.

Usage

    Run the InheritanceForAutomobile class.
    Choose options from the menu to add new automobiles, display details, or quit the program.
    Follow the prompts to input automobile details.

Note

    The program uses basic input validation to ensure that the entered data is within specified ranges.

Feel free to modify and expand upon this code based on your specific requirements.
