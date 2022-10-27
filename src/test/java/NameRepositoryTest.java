import org.junit.Test;
import se.Lexicon.g45.NameRepository;

import static org.junit.Assert.assertArrayEquals;

public class NameRepositoryTest {

    @Test
    public void testFindFullName(){
        String[] templateNames = {"John Doe", "Jane Doe", "King Kong"};
        NameRepository.setNames(templateNames);
        String[] actualFound = NameRepository.findByLastName("Doe");
        String[] expected = {"John Doe", "Jane Doe"};
        assertArrayEquals("Something went wrong", expected, actualFound);

    }
}
