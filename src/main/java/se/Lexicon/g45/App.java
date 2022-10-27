package se.Lexicon.g45;


import java.util.Scanner;

public class App {

    public static String[] templateNames = {"John Doe", "Jane Doe", "King Kong", "John Wick"};

    public static void main(String[] args) {


        theMenu();



    } // main

    public static void theMenu() {

        Scanner scan = new Scanner(System.in);

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
            int optionInput = scan.nextInt();
            switch (optionInput) {
                case 1:
                    System.out.print("Type the name you want to add: ");
                    String addName = scan.nextLine();
                    NameRepository.add(addName);
                    System.out.println("The name " + addName + " was added!");
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
                    String firstName = scan.next();
                    NameRepository.findByFirstName(firstName);
                    break;
                case 5:
                    System.out.print("Type the last name you want to search for: ");
                    String lastName = scan.next();
                    NameRepository.findByLastName(lastName);
                    break;
                case 6:
                    System.out.print("Type the full name you want to search for: ");
                    String fullName = scan.nextLine();
                    NameRepository.find(fullName);
                    break;
                case 7:
                    System.out.println("Type the name you want to remove: ");
                    String removeName = scan.nextLine();
                    NameRepository.remove(removeName);
                case 8:
                    System.out.print("Type the name you want to replace: "); // fix this when replace works
                    System.out.print("Type the name you want instead: ");
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




} // App
