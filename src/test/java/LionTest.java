import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;


    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doesNotHaveManeTest() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void incorrectLionSexTest() throws Exception   {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion(feline, "Детеныш");
        });
        String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedResult, exception.getMessage());
    }
    @Mock
    Lion lion;

    @Test
    public void getKittensTest() throws Exception{
        Lion lion = new Lion(new Feline(), "Самец");
        int expectedResult = 1;
        assertEquals(expectedResult, lion.getKittens());
    }
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, lion.getFood());
    }
}
