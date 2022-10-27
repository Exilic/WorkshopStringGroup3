package se.Lexicon.g45;


import javax.naming.Name;

public class App {

    public static void main(String[] args) {


        String[] templateNames = {"John Doe", "Jane Doe", "King Kong"};
        NameRepository.setNames(templateNames);
        NameRepository.findAll();
        NameRepository.add("Testing TheCode");
        NameRepository.findAll();

        while (true) {

            // menuOptions();

            // add some switch here perhaps
            break;
        }


    } // main

    /** Prints the main menu options */
    public static void menuOptions() {
        System.out.println("********************************************");
        System.out.println("** Group 45 string management service 1.0 **");
        System.out.println("********************************************");
        System.out.println("** (1) Add a new name to the array        **"); // add real option things
        System.out.println("** (2) Add a new name to the array        **");
        System.out.println("** (3) Add a new name to the array        **");
        System.out.println("** (4) Add a new name to the array        **");
        System.out.println("** (5) Add a new name to the array        **");
        System.out.println("** (6) Add a new name to the array        **");
        System.out.println("** (7) Add a new name to the array        **");
        System.out.println("** (8) Add a new name to the array        **");
        System.out.println("** (9) Add a new name to the array        **");
        System.out.println("** (10) Add a new name to the array       **");
        System.out.println("** (11) Add a new name to the array       **");
        System.out.println("********************************************");
        System.out.print("Option: ");
    } // menuOptions

} // App
