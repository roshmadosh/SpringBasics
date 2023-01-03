package link.hiroshisprojects.springbasics.annotations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;

public class AnnotationsTest {

    @Test void whenAnnotationsMain_QualifiersInjectedProperly() throws Exception {
        String expected = "Josh the Main Collaborator\nDrake the Action Collaborator\n";
        String actual = tapSystemOutNormalized(() -> AnnotationsMain.main(new String[]{}));

        assertEquals(expected, actual);
    }

}
