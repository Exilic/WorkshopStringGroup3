import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.Lexicon.g45.NameRepository;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class NameRepositoryTest {

    @Before
    public void populateArray(){
        String[] templateNames = {"John Doe", "Jane Doe", "King Kong"};
        NameRepository.setNames(templateNames);
    }
    @Test
    public void testFindByLastName(){
        String[] actualFound = NameRepository.findByLastName("doE");
        String[] expected = {"John Doe", "Jane Doe"};
        assertArrayEquals("Something went wrong", expected, actualFound);

    }

    @Test
    public void testFindByFirstName(){
        String[] actualFound = NameRepository.findByFirstName("joHn");
        String[] expected = {"John Doe"};
        assertArrayEquals("Something went wrong", expected, actualFound);
    }

    @Test
    public void testClear(){
        NameRepository.clear();
        String[] actual = NameRepository.findAll();
        assertArrayEquals("Array did not empty", new String[0], actual);
    }

    @Test
    public void testFindAll(){
        String[] templateNames = {"John Doe", "Jane Doe", "King Kong"};
        String[] actual = NameRepository.findAll();
        assertArrayEquals("This didn't work", templateNames, actual);
    }

    @Test
    public void testFind(){
        String actual = NameRepository.find("jaNE DOE");
        assertEquals("Couldn't find", "Jane Doe", actual);
    }

    @Test
    public void testRemove(){
        Boolean actualResponse = NameRepository.remove("kinG konG");
        String actual = NameRepository.find("king koNG");
        Assert.assertTrue(actual.equalsIgnoreCase("null"));
    }

    @Test
    public void testGetSize(){
        int actual = NameRepository.getSize();
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testAdd(){
        NameRepository.add("Don King");
        String actual = NameRepository.findAll()[3];
        Assert.assertEquals("Don King", actual);
    }

    @Test
    public void testUpdate(){
        NameRepository.update("Jane Doe", "Jane Austen");
        String actual = NameRepository.findAll()[1];
        Assert.assertEquals("Jane Austen", actual);
    }

}
