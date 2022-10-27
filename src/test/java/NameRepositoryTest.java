import org.junit.Test;
import se.Lexicon.g45.NameRepository;

import static org.junit.Assert.assertArrayEquals;

public class NameRepositoryTest {

    @Test
    public void testFindByLastName(){
        String[] templateNames = {"John Doe", "Jane Doe", "King Kong"};
        NameRepository.setNames(templateNames);
        String[] actualFound = NameRepository.findByLastName("doE");
        String[] expected = {"John Doe", "Jane Doe"};
        assertArrayEquals("Something went wrong", expected, actualFound);

    }

    @Test
    public void testFindByFirstName(){
        String[] templateNames = {"John Doe", "Jane Doe", "King Kong"};
        NameRepository.setNames(templateNames);
        String[] actualFound = NameRepository.findByFirstName("joHn");
        String[] expected = {"John Doe"};
        assertArrayEquals("Something went wrong", expected, actualFound);

    }
}
