package link.hiroshisprojects.springbasics.xml;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;
import static org.junit.jupiter.api.Assertions.*;
public class XmlTest {
    @Test
    void whenXmlMain_thenSystemOut()throws Exception {
        String text = tapSystemOutNormalized(() -> XmlMain.main(new String[]{}));
        assertEquals("CatDAO fetching cat data from DB...\nCatService feeding fetched cats...\n", text);
    }
}
