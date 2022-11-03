import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public  void additionMethodTest() {
        long input1 = 20;
        long input2 = 30;
        long expected = 50;
        assertEquals(expected, MathOperations.add(input1, input2));
    }

    @Test
    public void tipAppTest() {
        double cost = 22.56;
        double tip = 20;
        assertEquals(4.51, MathOperations.tip(cost, tip), 0.002 );
    }

    @Test
    public void codeUpTest() {
        String one = "Codeup";
        String two = "Codeup";
        assertEquals(one, two);
    }
    @Test
    public void arrayListComparison() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testAssertArrayEquals(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }
}
