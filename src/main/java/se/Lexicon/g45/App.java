package se.Lexicon.g45;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static String[] templateNames = {"John Doe", "Jane Doe", "King Kong", "John Wick"};

    public static void main(String[] args) {


        theMenu();


    } // main

    public static void theMenu() {


        while (true) {

            System.out.println("\u001B[32m******************************************************************************");
            System.out.println("******************* Group 45 string management service 1.0 *******************");
            System.out.println("******************************************************************************");
            System.out.println("** (\u001B[36m1\u001B[32m) Add a new name to the array  ** (\u001B[36m7\u001B[32m) Remove a name from the array     **");
            System.out.println("** (\u001B[36m2\u001B[32m) Copy template to the array   ** (\u001B[36m8\u001B[32m) Change a name into another name  **");
            System.out.println("** (\u001B[36m3\u001B[32m) Print the array              ** (\u001B[36m9\u001B[32m) Find the size of the array       **");
            System.out.println("** (\u001B[36m4\u001B[32m) Search by first name         ** (\u001B[36m10\u001B[32m) Clear the array                 **");
            System.out.println("** (\u001B[36m5\u001B[32m) Search by last name          ** (\u001B[36m11\u001B[32m) Credits                         **");
            System.out.println("** (\u001B[36m6\u001B[32m) Search by full name          ** (\u001B[36m12\u001B[32m) Exit the application            **");
            System.out.println("******************************************************************************\u001B[0m");
            System.out.print("Option: ");

            int optionInput = getNumber();
            switch (optionInput) {
                case 1:
                    System.out.print("Type the name you want to add: ");
                    String addName = getString();
                    boolean addSuccess = NameRepository.add(addName);
                    if (addSuccess) {
                        System.out.println("The name " + addName + " was added!");
                    } else {
                        System.out.println("Nothing was added.");
                    }
                    break;
                case 2:
                    NameRepository.setNames(templateNames);
                    System.out.println("The array now contains the template.");
                    break;
                case 3:
                    NameRepository.findAll();
                    break;
                case 4:
                    System.out.print("Type the first name you want to search for: ");
                    String firstName = getString();
                    String[] returnedFirstName = NameRepository.findByFirstName(firstName);
                    System.out.println(Arrays.toString(returnedFirstName));
                    break;
                case 5:
                    System.out.print("Type the last name you want to search for: ");
                    String lastName = getString();
                    String[] returnedLastName = NameRepository.findByLastName(lastName);
                    System.out.println(Arrays.toString(returnedLastName));
                    break;
                case 6:
                    System.out.print("Type the full name you want to search for: ");
                    String fullName = getString();
                    String returnedFullName = NameRepository.find(fullName);
                    System.out.println(returnedFullName);
                    break;
                case 7:
                    System.out.println("Type the name you want to remove: ");
                    String removeName = getString();
                    boolean successfulRemove = NameRepository.remove(removeName);
                    if (successfulRemove) {
                        System.out.println("The name \"" + removeName + "\" was removed successfully.");
                    } else {
                        System.out.println("Nothing was removed.");
                    }
                    break;
                case 8:
                    System.out.print("Type the name you want to replace: ");
                    String initialName = getString();
                    System.out.print("Type the name you want instead: ");
                    String replaceName = getString();
                    boolean isUpdated = NameRepository.update(initialName, replaceName);
                    if (isUpdated) {
                        System.out.println(" The name " + initialName + " was changed to " + replaceName + ".");
                    } else {
                        System.out.println("Nothing was updated.");
                    }
                    break;
                case 9:
                    int arraySize = NameRepository.getSize();
                    System.out.println("The size of the array is: " + arraySize);
                    break;
                case 10:
                    NameRepository.clear();
                    System.out.println("The array has been nullified.");
                    break;
                case 11:
                    credits();
                    break;
                case 12:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("\u001B[31mPlease enter a valid option!\u001B[0m");
            }


        }
    }

    public static void credits() {
        System.out.println("\u001B[36m _   .-')      ('-.     .-') _    .-') _             ('-.      .-')      (`-')                <-.(`-')   _     (`-')  _  (`-').-> ");
        System.out.println("( '.( OO )_   ( OO ).-.(  OO) )  (  OO) )           ( OO ).-. ( OO ).    ( OO).->       .->    __( OO)  (_)    (OO ).-/  ( OO)_   ");
        System.out.println(" ,--.   ,--.) / . --. //     '._ /     '._ ,-.-')   / . --. /(_)---\\_)   /    '._  (`-')----. '-'---.\\  ,-(`-')/ ,---.  (_)--\\_)  ");
        System.out.println(" |   `.'   |  | \\-.  \\ |'--...__)|'--...__)|  |OO)  | \\-.  \\ /    _ |    |'--...__)( OO).-.  '| .-. (/  | ( OO)| \\ /`.\\ /    _ /  ");
        System.out.println(" |         |.-'-'  |  |'--.  .--''--.  .--'|  |  \\.-'-'  |  |\\  :` `.    `--.  .--'( _) | |  || '-' `.) |  |  )'-'|_.' |\\_..`--.  ");
        System.out.println(" |  |'.'|  | \\| |_.'  |   |  |      |  |   |  |(_/ \\| |_.'  | '..`''.)      |  |    \\|  |)|  || /`'.  |(|  |_/(|  .-.  |.-._)   \\ ");
        System.out.println(" |  |   |  |  |  .-.  |   |  |      |  |  ,|  |_.'  |  .-.  |.-._)   \\      |  |     '  '-'  '| '--'  / |  |'->|  | |  |\\       / ");
        System.out.println(" |  |   |  |  |  | |  |   |  |      |  | (_|  |     |  | |  |\\       /      `--'      `-----' `------'  `--'   `--' `--' `-----'  ");
        System.out.println(" `--'   `--'  `--' `--'   `--'      `--'   `--'     `--' `--' `-----'  \n");
        System.out.println("   ('-.  _   .-')                         <-. (`-')              (`-').-> (`-')  _ <-. (`-')  <-. (`-')   (`-')  _ _(`-')    ");
        System.out.println(" _(  OO)( '.( OO )_                          \\(OO )_      .->    (OO )__  (OO ).-/    \\(OO )_    \\(OO )_  (OO ).-/( (OO ).-> ");
        System.out.println("(,------.,--.   ,--.) ,-.-')  ,--.        ,--./  ,-.)(`-')----. ,--. ,'-' / ,---.  ,--./  ,-.),--./  ,-.) / ,---.  \\    .'_  ");
        System.out.println(" |  .---'|   `.'   |  |  |OO) |  |.-')    |   `.'   |( OO).-.  '|  | |  | | \\ /`.\\ |   `.'   ||   `.'   | | \\ /`.\\ '`'-..__) ");
        System.out.println(" |  |    |         |  |  |  \\ |  | OO )   |  |'.'|  |( _) | |  ||  `-'  | '-'|_.' ||  |'.'|  ||  |'.'|  | '-'|_.' ||  |  ' | ");
        System.out.println("(|  '--. |  |'.'|  |  |  |(_/ |  |`-' |   |  |   |  | \\|  |)|  ||  .-.  |(|  .-.  ||  |   |  ||  |   |  |(|  .-.  ||  |  / : ");
        System.out.println(" |  .--' |  |   |  | ,|  |_.'(|  '---.'   |  |   |  |  '  '-'  '|  | |  | |  | |  ||  |   |  ||  |   |  | |  | |  ||  '-'  / ");
        System.out.println(" |  `---.|  |   |  |(_|  |    |      |    `--'   `--'   `-----' `--' `--' `--' `--'`--'   `--'`--'   `--' `--' `--'`------'  ");
        System.out.println(" `------'`--'   `--'  `--'    `------'    \u001B[0m");
    }


    private static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        try {
            number = scanner.nextInt();

        } catch (InputMismatchException e) {
            number = 0;
        }

        return number;
    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

} // App
