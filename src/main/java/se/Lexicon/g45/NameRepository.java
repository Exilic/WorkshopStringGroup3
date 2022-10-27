package se.Lexicon.g45;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[]{

    };

    /**
     * Returns number of elements in the array
     */
    public static int getSize() {
        return names.length;
    } // getSize

    /**
     * Replaces all existing names with template array
     */
    public static void setNames(String[] names) {

        NameRepository.names = names.clone();
    } // setNames

    /**
     * Clears out the array
     */
    public static void clear() {

        names = new String[0];

    } // clear

    /**
     * Returns all names from the array
     */
    public static String[] findAll() {
        System.out.println(Arrays.toString(names));
        return new String[0];
    } // findAll

    /**
     * Returns name if found and null if not found
     */
    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return "null";
    } // find

    /**
     * Adds a new name to the array. Returns true when name was added and false when the array contains
     * the name.
     */
    public static boolean add(final String fullName) {

        String compare = find(fullName);
        if (compare == "null") {
            String tempString[] = names.clone();
            names = new String[tempString.length + 1];

            for (int i = 0; i < tempString.length; i++) {
                names[i] = tempString[i];
            }
            names[tempString.length] = fullName;
        }

        return false;
    } // add

    /**
     * Searches the array trying to find all names that has passed in first name. Returns a String array containing all
     * matches
     */
    public static String[] findByFirstName(final String firstName) {
        String[] foundNames = new String[0];
        for (String name : names) {
            int lastPosition = name.indexOf(" ");
            if (name.substring(0, lastPosition).toLowerCase().equals(firstName.toLowerCase())) {
                foundNames = Arrays.copyOf(foundNames, foundNames.length + 1);
                foundNames[foundNames.length - 1] = name;
            }
        }
        return foundNames;
    } // findByFirstName

    /**
     * Searches the array trying to find all names that has passed in last name. Returns a String array containing all
     * matches.
     */
    public static String[] findByLastName(final String lastName) {
        String[] foundNames = new String[0];

        for (String name : names) {
            int firstPosition = name.indexOf(" ") + 1;
            if (name.substring(firstPosition).toLowerCase().equals(lastName.toLowerCase())) {
                foundNames = Arrays.copyOf(foundNames, foundNames.length + 1);
                foundNames[foundNames.length - 1] = name;
            }
        }
        return foundNames;
    } // findByLastName

    /**
     * Finds a name and replace it with new fullName if available. Returns true if name was found and updated
     * with the new name. False if name could not be updated because name wasn’t found or name was found but an
     * existing name matching the updatedName already exists.
     */
    public static boolean update(final String original, final String updatedName) {

        return false;
    } // update

    /**
     * Removes a name from the array. Returns true if name was removed and false if the name was not
     * removed for some reason
     */
    public static boolean remove(final String fullName) {

        String compare = find(fullName);
        if (compare != "null") {
            String tempString[] = names.clone();
            clear();
            int indexOf = -1;
            for (int i = 0; i < tempString.length; i++) {
                if (tempString[i] == fullName) {
                    indexOf = i;
                }
            }
            for (int i = 0; i < tempString.length; i++) {

                if (indexOf != i) {
                    add(tempString[i]);
                }

            }
            return true;

        }

        return false;
    } // remove

} // NameRepository
