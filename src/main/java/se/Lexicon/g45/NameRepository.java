package se.Lexicon.g45;

public class NameRepository {


    private static String[] names = new String[] {

    }
    public static int getSize(){

        return 1;
    }

    public static void setNames(String[] names){

    }

    public static void clear(){

    }

    public static String[] findAll(){

        return new String[0];
    }

    public static String find(final String fullName){

        return "temporary";
    }

    public static boolean add(final String fullName){

        return false;
    }

    public static String[] findByFirstName(final String firstName){

        return new String[0];
    }

    public static String[] findByLastName(final String lastName){

        return new String[0];
    }

    public static boolean update(final String original, final String updatedName){

        return false;
    }

    public static boolean remove(final String fullName){

        return false;
    }

}
