package se.Lexicon.g45;


import javax.naming.Name;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        String[] templateNames = {"John Doe", "Jane Doe", "King Kong"};
        NameRepository.setNames(templateNames);
        NameRepository.find();
        NameRepository.add("Testing TheCode");
        NameRepository.findAll();
        System.out.println(NameRepository.find("John Doe"));


        while (true) {

            // menuOptions();
            // credits();

            // add some switch here perhaps.
            break;
        }


    } // main

    /** Prints the main menu options */
    public static void menuOptions() {
        System.out.println("\u001B[32m******************************************************************************");
        System.out.println("******************* Group 45 string management service 1.0 *******************");
        System.out.println("******************************************************************************");
        System.out.println("** (\u001B[36m1\u001B[32m) Add a new name to the array  ** (\u001B[36m7\u001B[32m) Remove a name from the array     **");
        System.out.println("** (\u001B[36m2\u001B[32m) Copy template to the array   ** (\u001B[36m8\u001B[32m) Change a name into another name  **");
        System.out.println("** (\u001B[36m3\u001B[32m) Print the array              ** (\u001B[36m9\u001B[32m) Find the size of the array       **");
        System.out.println("** (\u001B[36m4\u001B[32m) Search by first name         ** (\u001B[36m10\u001B[32m) Clear the array                 **");
        System.out.println("** (\u001B[36m5\u001B[32m) Search by last name          ** (\u001B[36m11\u001B[32m) Credits                         **");
        System.out.println("** (\u001B[36m6\u001B[32m) Search by full name          ** (\u001B[36m12\u001B[32m) Exit the application            **");
        System.out.println("******************************************************************************");
        System.out.print("Option: \u001B[0m");
        Scanner scan = new Scanner(System.in);
        // int option = scan.nextInt();
    } // menuOptions

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
