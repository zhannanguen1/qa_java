import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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


}
