package link.hiroshisprojects.springbasics.beanpostprocessor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;

public class BeanPostProcessorTest {

    @Test void whenBPP_thenBPPLogicAfterEachBean() throws Exception{
        String first = "BEFORE INITIALIZING first\nAFTER INITIALIZING first\n";
        String second = "BEFORE INITIALIZING second\nAFTER INITIALIZING second\n";
        String third = "BEFORE INITIALIZING third\nAFTER INITIALIZING third\n";
        String expected = first + second + third;
        String actual = tapSystemOutNormalized(() -> BeanPostProcessorMain.main(new String[]{}));

        assertEquals(expected, actual);
    }
}
