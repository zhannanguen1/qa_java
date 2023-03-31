import com.example.Animal;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }
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
