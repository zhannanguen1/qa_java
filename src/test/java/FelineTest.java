import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    private final int expectedResult;
    private final int kittensQuantity;
    Feline feline = new Feline();

    public FelineTest(int kittensQuantity, int expectedResult) {
        this.expectedResult = expectedResult;
        this.kittensQuantity = kittensQuantity;
    }

    @Parameterized.Parameters(name = "ТестДата: Количество котят: {0}, {1}")
    public static Object[][] getKittensData() {
        return new Object[][]{
                {2, 2},
                {8, 8},
                {4, 4},
                {0, 0},
        };
    }

    @Test
    public void getKittensCountTest() {
        assertEquals(expectedResult, feline.getKittens(kittensQuantity));
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensTest() {
        Feline feline = new Feline();
        assertEquals(expectedResult, feline.getKittens(kittensQuantity));
    }

}
