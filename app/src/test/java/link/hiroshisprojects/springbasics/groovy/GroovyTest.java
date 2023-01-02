package link.hiroshisprojects.springbasics.groovy;

import link.hiroshisprojects.springbasics.xml.XmlMain;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;
import static org.junit.jupiter.api.Assertions.*;
public class GroovyTest {

    @Test void whenGroovyMain_thenSystemOut() throws Exception {
        String text = tapSystemOutNormalized(() -> GroovyMain.main(new String[]{}));
        assertEquals("CatDAO fetching cat data from DB...\nCatService feeding fetched cats...\n", text);
    }
}
