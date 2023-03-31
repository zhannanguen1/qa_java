import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {
    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expected = List.of("Marty", "Gloria", "Melmen");
        assertEquals(expected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex(feline);
        String expected = "New York's zoo";
        assertEquals(expected, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());
    }
}
