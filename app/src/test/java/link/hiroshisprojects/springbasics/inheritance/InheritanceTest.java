package link.hiroshisprojects.springbasics.inheritance;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;

import link.hiroshisprojects.springbasics.inheritence.InheritanceMain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class InheritanceTest {

    @Test void whenChildBean_thenInheritsAndOverrides() throws Exception {
        String expected = "Child's height 168\nChild's weight 10000\n";
        String actual = tapSystemOutNormalized(() -> InheritanceMain.main(new String[]{}));
        assertEquals(expected, actual);
    }
}
