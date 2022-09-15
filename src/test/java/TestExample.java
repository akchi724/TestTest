import org.example.ClassForTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;


public class TestExample {

    private final ClassForTest classForTest = new ClassForTest();

    @Test
    public void oneWord() {
        assertEquals(
                "vladimir",
                classForTest.saySomething("vladimir"));
    }

    @Test
    public void oneWordAnd1() {
        assertEquals(
                "vladimir 1",
                classForTest.saySomething("vladimir"));
    }
}
