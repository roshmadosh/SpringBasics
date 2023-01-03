package link.hiroshisprojects.springbasics.lifecycle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;

public class LifecycleTest {
    @Test void whenLifecycleBean_thenInitCalled() throws Exception {
        String expected = "Init called after properties set. Message: My message set during bean definition.\nsetterMessage: My setter-injected message.\n";
        String actual = tapSystemOutNormalized(() -> LifecycleMain.main(new String[]{}));
        assertEquals(expected, actual);
    }
}
