import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetKittensGetFamilyTest {

    @Test
    public void getFamilyCatsTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}
